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
 * This is a class the handles the all communication with the server. On
 * creation initializes with the server and finds out if this is a new game,
 * by using the gmFlag. Then the init() function must be call in order to inform
 * the server (and thus the other players) with the Player's object 
 * and GameSettings. Then the sync() must be run in order to sync with the
 * Players list and GamesSttings with the server and the other players.
 * the using the waitForTurn() you can get update for the server or 
 * get an indication for when is your turn.
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

    /**
     *
     * @param hostname The servers ip or hostname.
     * @param port The servers port.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public ServerInterface(String hostname, int port) throws IOException, ClassNotFoundException {
	this.sock = new Socket(hostname, port);
	this.output = new ObjectOutputStream(this.sock.getOutputStream());
	this.input = new ObjectInputStream(this.sock.getInputStream());
	this.gmFlag = this.input.readObject().equals("NEW");
	this.ppl = new ArrayList<>();
    }
    /**
     * 
     * @return The the GameSettings, which we got from the server.
     */
    public GameSettings getGms() {
	return gms;
    }
    /**
     * This function tells the server the players name.
     *
     * @param p The players info.
     * @throws IOException
     */
    public void init(Player p) throws IOException {
	sendToServer(p);
    }

    /**
     * This function tells the server the players name and the sends the game
     * settings, if this is a new game.
     *
     * @param p The players info.
     * @param gm The game settings info.
     * @throws IOException
     */
    public void init(Player p, GameSettings gm) throws IOException {
	this.gms = gm;
	sendToServer(p);
	sendToServer(gm);
    }

    /**
     * This function gets the player list and game settings from the server.
     *
     * @throws IOException
     * @throws ClassNotFoundException
     */
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

    /**
     * Sends to the server the Pawn that moved and the current dice roll.
     *
     * @param d The dices the have been rolled.
     * @param p A pawns new location.
     * @throws IOException
     */
    public void updatePawn(Dice d, Pawn p) throws IOException {
	sendToServer("UPDATE");
	sendToServer(d);
	sendToServer(p);
    }

    /**
     * Tell the server to end the game.
     *
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void endGame() throws IOException, ClassNotFoundException {
	sendToServer("END");
	readFromServer();
	terminate();
    }

    /**
     * Waits for the server to indicate if its your turn, announces the
     * completion of the game or moves that have been made by other players.
     *
     * @return One for turn , -1 to end the game or 0 for other players moves.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public int waitForTurn() throws IOException, ClassNotFoundException {
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

    /**
     * Terminates connections and streams.
     *
     * @throws IOException
     */
    public void terminate() throws IOException {
	this.input.close();
	this.output.close();
	this.sock.close();
    }

    /**
     * This flag indicates if you are the first player to connect, thus
     * requiring game setting to be created.
     *
     * @return The game master flag.
     */
    public boolean getGmFlag() {
	return this.gmFlag;
    }

    /**
     *
     * @return Return an array of the player of the game.
     */
    public ArrayList<Player> getPlayers() {
	return this.ppl;
    }

    /**
     *
     * @return Return a move made by an other player
     */
    public Pawn getPawn() {
	return this.pwn;
    }

    /**
     *
     * @return Return a dice roll made by an other player
     */
    public Dice getDice() {
	return this.dc;
    }

    /**
     * Simplifies communications.
     *
     * @param o Sends an Object to the server.
     * @throws IOException
     */
    public void sendToServer(Object o) throws IOException {
	output.writeObject(o);
    }

    /**
     * Simplifies communications.
     *
     * @return An object sent by the server.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object readFromServer() throws IOException, ClassNotFoundException {
	return input.readObject();
    }
}
