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
public int colour;

/**
 *
 * @param name
 * @param colour
 */
public Player(String name, int colour) {
    this.name = name;
    this.colour = colour;
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
public int getColour() {
    return colour;
}

/**
 *
 * @param colour
 */
public void setColour(int colour) {
    this.colour = colour;
}

/**
 *
 * @return
 */
@Override
public String toString() {
    return name + ':' + colour;
}

}
