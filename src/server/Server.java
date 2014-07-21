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

/**
 * This class is the game server. On creation runs the initialization. This
 * connects the Game Master, who sets GameSettings (number of players and
 * pawns). Afterwards connects the other players, sending them the current game
 * settings and learning their player info. Lastly initiates the game and relays
 * Pawn and dice updates, or ends the game if commanded.
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

    /**
     * Initializes the game. Connecting the game master and the other players
     *
     * @param port Server's port to listen to.
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public Server(int port) throws IOException, ClassNotFoundException {
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
	System.out.println("Game Master Connected: "
		+ currentPlayer.toString());
	gms = (GameSettings) readData(sock);
	System.out.println("Game settings: " + gms.toString());
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
	    System.out.println("Player connected "
		    + currentPlayer.toString());
	    addPlayer(sock, currentPlayer);
	}
	playerData = new String[gms.getPlayers()];
	System.out.println("Starting Game...");
	syncGame();
	announce("Game Starts!");
	StartGame();
	endGame();
    }

    /**
     * Main game information relay and command execution.
     *
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private void StartGame() throws IOException, ClassNotFoundException {
	String cmd = "", pname = "";
	Dice dc;
	Pawn pwn;
	while (true) {
	    for (Socket s : playerList.keySet()) {
		pname = playerList.get(s).name;
		System.out.println("=> " + pname + "'s turn!");
		sendData(s, "TURN");
		cmd = (String) readData(s);
		if (cmd.equals("UPDATE")) {
		    announce(cmd, s);
		    dc = (Dice) readData(s);
		    System.out.println("=> "
			    + pname
			    + " rolled a "
			    + dc.getDie1());
		    updateDice(s, dc);
		    pwn = (Pawn) readData(s);
		    System.out.println("=> "
			    + pname
			    + " moved "
			    + pwn);
		    updatePawn(s, pwn);
		} else {
		    System.out.println("=> "
			    + pname
			    + " ended the game.");
		}
	    }
	    if (cmd.equals("END")) {
		break;
	    }
	}
    }

    /**
     * Adds a Socket and a Player to a map.
     *
     * @param s current connected Socket
     * @param p current connected Player
     */
    private void addPlayer(Socket s, Player p) {
	playerList.put(s, p);
    }

    /**
     * Saves the In/Out Streams in a map.
     *
     * @param s A player's Socket.
     * @param i A player's input ObjectStream.
     * @param o A player's output ObjectStream.
     */
    private void addStreams(Socket s, ObjectInputStream i, ObjectOutputStream o) {
	socketStreams.put(s, new ObjectStreams(i, o));
    }

    /**
     * Returns the output ObjectStream from the map.
     *
     * @param s Player's Socket.
     * @return OutputStream associated with the given Socket.
     */
    private ObjectOutputStream getOutStream(Socket s) {
	return socketStreams.get(s).out;
    }

    /**
     * Returns the input ObjectStream from the map.
     *
     * @param s Player's Socket.
     * @return InputStream associated with the given Socket.
     */
    private ObjectInputStream getInStream(Socket s) {
	return socketStreams.get(s).in;
    }

    /**
     * Update the player with the new dice that has been rolled.
     *
     * @param origin Excludes the currently playing player from the update.
     * @param d The Dice object to update from.
     * @throws IOException
     */
    private void updateDice(Socket origin, Dice d) throws IOException {
	for (Socket s : playerList.keySet()) {
	    if (s != origin) {
		sendData(s, d);
	    }
	}
    }

    /**
     * Sends a String to all players.
     *
     * @param data The String to send.
     * @throws IOException
     */
    private void announce(String data) throws IOException {
	for (Socket s : playerList.keySet()) {
	    sendData(s, data);
	}
    }

    /**
     * Sends a String to all players excluding the currently playing player.
     *
     * @param data The String to be sent.
     * @param origin The player excluded from the recipients.
     * @throws IOException
     */
    private void announce(String data, Socket origin) throws IOException {
	for (Socket s : playerList.keySet()) {
	    if (s != origin) {
		sendData(s, data);
	    }
	}
    }

    /**
     * Updates the other players about the new Pawn position, except the moves
     * originating player.
     *
     * @param origin Moves originating player.
     * @param p The new Pawn move.
     * @throws IOException
     */
    private void updatePawn(Socket origin, Pawn p) throws IOException {
	for (Socket s : playerList.keySet()) {
	    if (s != origin) {
		sendData(s, p);
	    }
	}
    }

    /**
     * Function to simplify data transmission.
     *
     * @param s Player socket to send to.
     * @param data Object to send.
     * @throws IOException
     */
    private void sendData(Socket s, Object data) throws IOException {
	getOutStream(s).writeObject(data);
    }

    /**
     * Function to simplify data transmission.
     *
     * @param s Player socket to read from.
     * @throws IOException
     */
    private Object readData(Socket s) throws IOException, ClassNotFoundException {
	return getInStream(s).readObject();
    }

    /**
     * Informs all players for the game completion and closes all active
     * connections.
     *
     * @throws IOException
     */
    private void endGame() throws IOException {
	announce("Game Over");
	for (Socket s : playerList.keySet()) {
	    s.close();
	    System.out.println("Player: "
		    + playerList.get(s).toString()
		    + " disconnected.");
	    socketStreams.get(s).in.close();
	    socketStreams.get(s).out.close();
	}
	socketStreams.clear();
	playerList.clear();
	System.out.println("Game Ended,all players disconnected.");
    }

    /**
     * Function to sync all players with the player list and game settings.
     * Excluding the game master who already has the game settings.
     *
     * @throws IOException
     */
    private void syncGame() throws IOException {
	int counter = 0;
	for (Socket s : playerList.keySet()) {
	    playerData[counter] = playerList.get(s).getName()+
		    ":"+
		    playerList.get(s).getColor();
	    counter++;
	}
	for (Socket s : playerList.keySet()) {
	    if (!playerList.get(s).getName().equals(playerData[0].split(":")[0])) {
		sendData(s, gms);
	    }
	    sendData(s, playerData);
	}
	System.out.println("Setup Complete! Starting Game...");
    }

    /**
     * Holds both in and out ObjectStreams in one object for simplicity.
     */
    class ObjectStreams {

	ObjectInputStream in;
	ObjectOutputStream out;

	private ObjectStreams(ObjectInputStream in, ObjectOutputStream out) {
	    this.in = in;
	    this.out = out;
	}

    }

}
