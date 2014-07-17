package commonEntities;

import java.io.Serializable;

/**
 *
 * @author Nikolas
 */
public class Dice implements Serializable {

private int die1;
private int die2;

public Dice(int die1, int die2){
    this.die1 = die1;
    this.die2 = die2;
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
public int getDie2() {
    return die2;
}

/**
 *
 * @param die2
 */
public void setDie2(int die2) {
    this.die2 = die2;
}

/**
 *
 * @return
 */
public int sum() {
    return die1 + die2;
}
}
