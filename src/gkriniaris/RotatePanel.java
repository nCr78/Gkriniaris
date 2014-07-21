package gkriniaris;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
* Creates rotated JPanels based on what is needed in the game. It can have
* specific colors and different rotation. It overrides JPanel's paintComponent
* function to do so.
*/
public class RotatePanel extends JPanel {
    Color color;
    int Dieresi;

    /**
     * Creates a rotated JPanel with another panel inside it.
     */
    public RotatePanel() 
    {
        Dieresi=4;
        JPanel l = new JPanel();
        JPanel l2 = new JPanel();
        setLayout(null);
        l.setBackground(Color.WHITE);
        l.setPreferredSize(new Dimension(169, 170));
        l.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        l.setBounds(new Rectangle(new Point(200, 300), l.getPreferredSize()));
        l.setLocation(35, 34);
        
        
        l.setLayout(null);
        l2.setBackground(Color.WHITE);
        l2.setPreferredSize(new Dimension(114, 113));
        l2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        l2.setBounds(new Rectangle(new Point(200, 300), l2.getPreferredSize()));
        l2.setLocation(27, 27);
        
      
        l.add(l2);
        this.setBackground(color);
        this.add(l);
    }
    
    /**
     * Takes 4 JPanels and rotates them in a way that is displayed in the center
     * of the game's board.
     * @param dieresi is the variable of how much you want it rotated.
     */
    public RotatePanel(int dieresi)
    {
        Dieresi = dieresi;
        JPanel kokino = new JPanel();
        JPanel kitrino = new JPanel();
        JPanel prasino = new JPanel();
        JPanel ble = new JPanel();
        
        
        setLayout(null);
        kokino.setBackground(Color.RED);
        kokino.setPreferredSize(new Dimension(100, 100));
        kokino.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        kokino.setBounds(new Rectangle(new Point(200, 300), kokino.getPreferredSize()));
        kokino.setLocation(59, -39);
        
        kitrino.setBackground(new Color(255,255,51));
        kitrino.setPreferredSize(new Dimension(100, 100));
        kitrino.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        kitrino.setBounds(new Rectangle(new Point(200, 300), kokino.getPreferredSize()));
        kitrino.setLocation(-40, 60);
        
        prasino.setBackground(new Color(0,204,51));
        prasino.setPreferredSize(new Dimension(100, 100));
        prasino.setBounds(new Rectangle(new Point(200, 300), kokino.getPreferredSize()));
        prasino.setLocation(-40, -40);
        
        ble.setBackground(new Color(51,51,255));
        ble.setPreferredSize(new Dimension(100, 100));
        ble.setBounds(new Rectangle(new Point(200, 300), kokino.getPreferredSize()));
        ble.setLocation(59, 60);
//        this.setBackground(Color.red);
        
        this.add(kokino);
        this.add(kitrino);
        this.add(prasino);
        this.add(ble);
        
    }

void setColor(Color c)
{
    color = c;
}

/**
* Overrides JPanel's paintComponent function to draw a rotated JPanel with a
* specific color and angle.
*/
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        int w2 = getWidth() / 2;
        int h2 = getHeight() / 2;
        g2d.rotate(-Math.PI / Dieresi, w2, h2);
        super.paintComponent(g);
    }
}

