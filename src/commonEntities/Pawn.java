package commonEntities;

import java.io.Serializable;

/**
 * A Class the represents the a game piece, the pawn. It is Serializable to be
 * able to be sent with an object stream.
 *
 * @author Nikolas
 */
public class Pawn implements Serializable {

private int color;
private String playerName;
private int position;

/**
 * Passes the field of the object.
 *
 * @param color
 * @param playerName
 * @param position
 */
public Pawn(int color, String playerName, int position) {
    this.color = color;
    this.playerName = playerName;
    this.position = position;
}

/**
 * Gets the color of the pawn.
 *
 * @return
 */
public int getColor() {
    return color;
}

/**
 * Sets the color of the pawn.
 *
 * @param color
 */
public void setColor(int color) {
    this.color = color;
}

/**
 * Gets the owner of the pawn.
 *
 * @return
 */
public String getPlayerName() {
    return playerName;
}

/**
 * Sets the owner of the pawn.
 *
 * @param playerName
 */
public void setPlayerName(String playerName) {
    this.playerName = playerName;
}

/**
 * Gets the position in the map of the pawn.
 *
 * @return
 */
public int getPosition() {
    return position;
}

/**
 * Sets the position in the map of the pawn.
 *
 * @param position
 */
public void setPosition(int position) {
    this.position = position;
}

}
