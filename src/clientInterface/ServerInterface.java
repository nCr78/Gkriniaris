package clientInterface;

import commonEntities.Dice;
import commonEntities.GameSettings;
import commonEntities.Pawn;
import commonEntities.Player;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Nikolas
 */
public class ServerInterface {

private Socket sock;
private int port;
private ObjectOutputStream output;
private ObjectInputStream input;
private boolean gmFlag;
private GameSettings gms;
private ArrayList<Player> ppl;
private Pawn pwn;
private Dice dc;

public ServerInterface(String hostname, int port) throws IOException, ClassNotFoundException {
    this.sock = new Socket(hostname, port);
    this.output = new ObjectOutputStream(this.sock.getOutputStream());
    this.input = new ObjectInputStream(this.sock.getInputStream());
    this.gmFlag = this.input.readObject().equals("NEW");
    this.ppl = new ArrayList<>();
}

public void init(Player p) throws IOException {
    sendToServer(p);
}

public void init(Player p, GameSettings gm) throws IOException {
    sendToServer(p);
    sendToServer(gm);
}

public void sync() throws IOException, ClassNotFoundException {
    String[] temp;
    if (gmFlag) {
	temp = (String[]) readFromServer();
    } else {
	gms = (GameSettings) readFromServer();
	temp = (String[]) readFromServer();
    }
    System.out.println(readFromServer());
    for (String s : temp) {
	ppl.add(new Player(s.split(":")[0],
		Integer.valueOf(s.split(":")[1])));
    }
}

public void updatePawn(Dice d, Pawn p) throws IOException{
    sendToServer("UPDATE");
    sendToServer(d);
    sendToServer(p);
}

public void endGame() throws IOException, ClassNotFoundException{
    sendToServer("END");//to bug mallon einai oti "waiting for other players" den diavazei an tou stileis "END", ara crasharei otan paei na kanei read
    readFromServer();
    terminate();
}

public int waitForTurn() throws IOException, ClassNotFoundException{
    String temp = (String) readFromServer();
    switch (temp) {
    case "TURN":
	return 1;
    case "Game Over":
	terminate();
	return -1;
    default:
	this.dc = (Dice) readFromServer();
	this.pwn = (Pawn) readFromServer();
	return 0;
    }
}

public void terminate() throws IOException{
    this.input.close();
    this.output.close();
    this.sock.close();    
}

public boolean getGmFlag() {
    return this.gmFlag;
}

public ArrayList<Player> getPlayers() {
    return this.ppl;
}

public Pawn getPawn() {
    return this.pwn;
}

public Dice getDice() {
    return this.dc;
}

public void sendToServer(Object o) throws IOException {
    output.writeObject(o);
}

public Object readFromServer() throws IOException, ClassNotFoundException {
    return input.readObject();
}
}
