package server;

import commonEntities.Dice;
import commonEntities.GameSettings;
import commonEntities.Pawn;
import commonEntities.Player;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nikolas
 */
public class Server {

private ServerSocket ssock;
private Socket sock;
private ObjectInputStream input;
private ObjectOutputStream output;
private String[] playerData;
private GameSettings gms;
private LinkedHashMap<Socket, Player> playerList;
private HashMap<Socket, ObjectStreams> socketStreams;
private Player currentPlayer;

Server(int port) {
    try {
	playerList = new LinkedHashMap<>();
	socketStreams = new HashMap<>();
	ssock = new ServerSocket(port);
	System.out.println("Listening");
	//First Player sets the game settings
	sock = ssock.accept();
	addStreams(sock, new ObjectInputStream(sock.getInputStream()), new ObjectOutputStream(sock.getOutputStream()));
	System.out.println("Connection is made");
	//Tell if this is a new game
	sendData(sock, "NEW");
	//Exchange info
	currentPlayer = (Player) readData(sock);
	addPlayer(sock, currentPlayer);
	System.out.println("Game Master Connected: " + 
		currentPlayer.getName()+
		" with color: "+
		currentPlayer.getColour());
	gms = (GameSettings) readData(sock);
	System.out.println("Game settings: "+gms.toString());
	//Adding new players
	while (gms.getPlayers() != playerList.size()) {
	    System.out.println("Waiting for other players...");
	    sock = ssock.accept();
	    addStreams(sock, new ObjectInputStream(sock.getInputStream()), new ObjectOutputStream(sock.getOutputStream()));

	    System.out.println("New connection...");
	    //Tell if this is a new game
	    sendData(sock, "EXISTS");
	    //Read players info
	    currentPlayer = (Player) readData(sock);
	    System.out.println("Game Master Connected: " + 
		    currentPlayer.getName()+
		    " with color: "+
		    currentPlayer.getColour());
	    addPlayer(sock, currentPlayer);
	}
	playerData = new String[gms.getPlayers()];
	System.out.println("Starting Game...");
	syncGame();
	announce("Game Starts!");
	StartGame();
	endGame();

    } catch (IOException ex) {
	Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
	System.out.println("Player disconnected.");
    } catch (ClassNotFoundException ex) {
	Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
    }

}

private void StartGame() throws IOException, ClassNotFoundException {
    String cmd = "", pname = "";
    Dice dc;
    Pawn pwn;
    while(true){
	for(Socket s : playerList.keySet()){
	    pname = playerList.get(s).name;
	    System.out.println("=> "+pname+"'s turn!");
	    sendData(s, "TURN");
	    cmd = (String) readData(s);
	    if(cmd.equals("UPDATE")){
		announce(cmd, s);
		dc = (Dice) readData(s);
		System.out.println("=> "+
			pname+
			" rolled a "+
			dc.getDie1()+
			" and a "+
			dc.getDie2());
		updateDice(s,dc);
		pwn = (Pawn) readData(s);
		System.out.println("=> "+
			pname+
			" moved a pawn to "+
			pwn.getPosition());
		updatePawn(s,pwn);
	    }else
		System.out.println("=> "+
			pname+
			" ended the game.");
	}
	if(cmd.equals("END"))
	    break;
    }
}

private void addPlayer(Socket s, Player p) {
    playerList.put(s, p);
}

private void addStreams(Socket s, ObjectInputStream i, ObjectOutputStream o) {
    socketStreams.put(s, new ObjectStreams(i, o));
}

private ObjectOutputStream getOutStream(Socket s) {
    return socketStreams.get(s).out;
}

private ObjectInputStream getInStream(Socket s) {
    return socketStreams.get(s).in;
}

private void updateDice(Socket origin, Dice d) throws IOException{
    for (Socket s : playerList.keySet()) {
	if (s != origin) 
	    sendData(s, d);
    }    
}

private void announce(String data) throws IOException {
    for (Socket s : playerList.keySet()) {
	sendData(s, data);
    }
}

private void announce(String data, Socket origin) throws IOException {
    for (Socket s : playerList.keySet()) {
	if(s != origin)
	    sendData(s, data);
    }
}

private void updatePawn(Socket origin, Pawn p) throws IOException {
    for (Socket s : playerList.keySet()) {
	if (s != origin) 
	    sendData(s, p);
    }
}

private void sendData(Socket s, Object data) throws IOException {
    getOutStream(s).writeObject(data);
}

private Object readData(Socket s) throws IOException, ClassNotFoundException {
    return getInStream(s).readObject();
}

private void endGame() throws IOException {
    announce("Game Over");
    for (Socket s : playerList.keySet()) {
	s.close();
	System.out.println("Player: "+ 
		playerList.get(s).getName()+
		" disconnected.");
	socketStreams.get(s).in.close();
	socketStreams.get(s).out.close();
    }
    socketStreams.clear();
    playerList.clear();
    System.out.println("Game Ended,all players disconnected.");
}

private void syncGame() throws IOException {
    int counter = 0;
    for (Socket s : playerList.keySet()) {
	playerData[counter] = playerList.get(s).toString();
	counter++;
    }
    for (Socket s : playerList.keySet()) {
	if(!playerList.get(s).getName().equals(playerData[0].split(":")[0]))
	    sendData(s, gms);
	sendData(s, playerData);
    }
    System.out.println("Setup Complete! Starting Game...");
}

class ObjectStreams {

ObjectInputStream in;
ObjectOutputStream out;

private ObjectStreams(ObjectInputStream in, ObjectOutputStream out) {
    this.in = in;
    this.out = out;
}

}

}
