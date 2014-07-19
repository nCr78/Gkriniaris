package gkriniaris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author nCr78
 */

public class Star extends JPanel
{
    public static final double halfPI = Math.PI / 2; 
    
    @Override
    public void paintComponent(Graphics g) {
          Graphics2D g2d = (Graphics2D)g;
          int xPoints[] = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
          int yPoints[] = { 0, 30, 36, 54, 96, 72, 96, 54, 36, 30 }; 
          int nPoints = xPoints.length;
          int dieresi=3;
          int polaplasiasmos=1;
          for(int i=0; i<nPoints;i++)
          {
              xPoints[i] = polaplasiasmos*(xPoints[i]/dieresi);
              yPoints[i] = polaplasiasmos*(yPoints[i]/dieresi);
          }
          
          Polygon star = new Polygon (xPoints, yPoints, nPoints);
          g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
          g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
          g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
          g2d.translate(33, 41);
          g2d.rotate(-Math.PI / 1.1);
          
          g2d.setColor(new Color(255,145,0));
          g2d.fill(star);  
          
          g2d.setColor(Color.BLACK);
          g2d.drawPolygon(star);
  }
} 