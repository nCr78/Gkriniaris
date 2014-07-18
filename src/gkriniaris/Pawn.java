/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
 *
 * @author nCr78
 */
public class Pawn extends JPanel
{
// private static final double halfPI = Math.PI / 2; 
 private Color color = new Color(0, 0, 0); 
 public Pawn(Color c) {
         color = c;
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
