package commonEntities;

import java.io.Serializable;

/**
 * This class hold the information about the player.
 * @author Nikolas
 */
public class Player implements Serializable {

    /**
     * Players name.
     */
    public String name;

    /**
     * Players color.
     */
    public int color;

    /**
     * Creates a new Player with the given values.
     * @param name
     * @param color
     */
    public Player(String name, int color) {
	this.name = name;
	this.color = color;
    }

    /**
     *
     * @return
     */
    public String getName() {
	return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     *
     * @return
     */
    public int getColor() {
	return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(int color) {
	this.color = color;
    }

    /**
     * Returns a string with the color and name of the player.
     * @return
     */
    @Override
    public String toString() {
	if(color == 0)
	    return name + ": green";
	else if(color == 1)
	    return name + ": red";
	else if(color == 1)
	    return name + ": blue";
	else
	    return name + ": yellow";
	   
    }

}
