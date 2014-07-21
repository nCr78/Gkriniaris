package commonEntities;

import java.io.Serializable;

/**
 * This class holds the GameSettings.
 * @author Nikolas
 */
public class GameSettings implements Serializable {

    private int players;
    private boolean rejoinable;
    private int numberPawns;

    /**
     *
     * @param players The number of players.
     * @param rejoinable NOT USED
     * @param numberPawns The number of pawns per player.
     */
    public GameSettings(int players, boolean rejoinable, int numberPawns) {
	this.numberPawns = numberPawns;
	this.players = players;
	this.rejoinable = rejoinable;
    }

    /**
     *
     * @return
     */
    public int getPlayers() {
	return players;
    }

    /**
     *
     * @param players
     */
    public void setPlayers(int players) {
	this.players = players;
    }

    /**
     *
     * @return
     */
    public boolean isRejoinable() {
	return rejoinable;
    }

    /**
     *
     * @param rejoinable
     */
    public void setRejoinable(boolean rejoinable) {
	this.rejoinable = rejoinable;
    }

    /**
     *
     * @return
     */
    public int getNumberPawns() {
	return numberPawns;
    }

    /**
     *
     * @param numberPawns
     */
    public void setNumberPawns(int numberPawns) {
	this.numberPawns = numberPawns;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
	return players + "," + rejoinable + "," + numberPawns;
    }

}
