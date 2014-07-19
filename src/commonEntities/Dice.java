package commonEntities;

import java.io.Serializable;

/**
 *
 * @author Nikolas
 */
public class Dice implements Serializable {

private int die1;

public Dice(int die1){
    this.die1 = die1;
}
/**
 *
 * @return
 */
public int getDie1() {
    return die1;
}

/**
 *
 * @param die1
 */
public void setDie1(int die1) {
    this.die1 = die1;
}

/**
 *
 * @return
 */
}
