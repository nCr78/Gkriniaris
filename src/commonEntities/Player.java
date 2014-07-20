package commonEntities;

import java.io.Serializable;

/**
 *
 * @author Nikolas
 */
public class Player implements Serializable {

    /**
     *
     */
    public String name;

    /**
     *
     */
    public int color;

    /**
     *
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
     *
     * @return
     */
    @Override
    public String toString() {
	return name + ':' + color;
    }

}
