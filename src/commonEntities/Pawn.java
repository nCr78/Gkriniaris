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
 * @author Nikolas
 */
public class Pawn extends JPanel implements Serializable 
{

private Color color = new Color(0, 0, 0); 
private String playerName;
private int position;

/**
 * Passes the field of the object.
 *
 * @param color
 * @param playerName
 * @param position
 */
public Pawn(Color color, String playerName, int position) {
    this.color = color;
    this.playerName = playerName;
    this.position = position;
}

/**
 * Gets the color of the pawn.
 *
 * @return
 */
public Color getColor() {
    return color;
}

/**
 * Sets the color of the pawn.
 *
 * @param color
 */
public void setColor(Color color) {
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
    public void paintComponent(Graphics g) {
          Graphics2D g2d = (Graphics2D)g;
          g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
          g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
          g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
          Shape theCircle = new Ellipse2D.Double(4, 4, 1.0 * 16, 1.0 * 16);
          g2d.setColor(Color.black);
          g2d.setStroke(new BasicStroke(2));
          g2d.draw(theCircle);
//          g2d.translate(20, 20);
          g2d.setColor(color);
          g2d.fill(theCircle);
    }

}
