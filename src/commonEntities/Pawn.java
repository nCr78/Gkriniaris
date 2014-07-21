package commonEntities;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.io.Serializable;
import javax.swing.JPanel;

/**
 * A Class the represents the a game piece, the pawn. It is Serializable to be
 * able to be sent with an object stream.
 *
 * @author Nikolas-nCr78
 */
public class Pawn extends JPanel implements Serializable {
    
    private int Start;
    private int color;
    private String playerName;
    private int position;
    private int prevPosition;

    
    /**
     * Passes the field of the object.
     * @param color
     * @param Start
     * @param playerName
     */
    public Pawn(int color, int Start, String playerName) {
	this.color = color;
	this.playerName = playerName;
	this.Start = Start;
        this.position = position;
	this.prevPosition = prevPosition;
    }

    /**
     * Gets the previous position of the pawn.
     *
     * @return
     */
    public int getPrevPosition() {
	return prevPosition;
    }
    
    /**
     * Gets the starting position of a pawn.
     *
     * @return
     */
    public int getStart() {
	return Start;
    }

    /**
     * Sets the previous position of a pawn.
     * @param prevPosition
     */
    public void setPrevPosition(int prevPosition) {
	this.prevPosition = prevPosition;
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
    
    @Override
    public String toString(){
	return position+"";
    }
    
    /**
     * Similarly to the circle: it creates a 2D ellipse around a point then
     * fills it with a specific color. It extends JPanel and overrides it's
     * paintComponent function to do so.
     */
    @Override
    public void paintComponent(Graphics g) 
    {
        Color C = new Color(0,0,0);
        if(color==0){C = new Color(0,204,51);}
        else if(color==1){C = Color.red;}
        else if(color==2){C = new Color(51,51,255);}
        else if(color==3){C = new Color(255,255,51);}
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        Shape theCircle = new Ellipse2D.Double(11, 11, 1.0 * 16, 1.0 * 16);
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(theCircle);
        g2d.setColor(C);
        g2d.fill(theCircle);
    }
    
}
