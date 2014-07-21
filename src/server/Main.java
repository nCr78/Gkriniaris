package server;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nikolas
 */
public class Main {

    /**
     * Starts the server.
     *
     * @param args No arguments used.
     */
    public static void main(String[] args) {
	try {
	    new Server(80);
	} catch (IOException | ClassNotFoundException ex) {
	    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	}
    }
}
