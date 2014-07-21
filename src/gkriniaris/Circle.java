package gkriniaris;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

/**
* Creates a JPanel that has a shape of a circle (It overrides JPanel's 
* paintComponent to do that). It takes a specific point and draws a 2D ellipse
* around it. Then it fills that ellipse with a specific color.
* I'm using rendering hints so the shape looks better.
* @author nCr78
*/
public class Circle extends JPanel
{
    public static final double halfPI = Math.PI / 2; 
    
    @Override
    public void paintComponent(Graphics g) {
          Graphics2D g2d = (Graphics2D)g;
          g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
          g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
          g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
          Shape theCircle = new Ellipse2D.Double(4, 4, 2.0 * 16, 2.0 * 16);
          g2d.setColor(Color.black);
          g2d.setStroke(new BasicStroke(2));
          g2d.draw(theCircle);
          g2d.setColor(new Color(201, 60, 166));
          g2d.fill(theCircle);
  }
} 