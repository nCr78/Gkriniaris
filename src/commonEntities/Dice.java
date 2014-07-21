package commonEntities;

import java.io.Serializable;

/**
 * This class represents the dice.
 * @author Nikolas
 */
public class Dice implements Serializable {

    private int die1;

    public Dice(int die1) {
	this.die1 = die1;
    }
    /**
     *
     * @return Returns the value of the die.
     */
    public int getDie1() {
	return die1;
    }

    /**
     * Sets the value of the die.
     * @param die1
     */
    public void setDie1(int die1) {
	this.die1 = die1;
    }
}
