package gkriniaris;
//4
import clientInterface.ServerInterface;
import commonEntities.Dice;
import commonEntities.GameSettings;
import commonEntities.Pawn;
import commonEntities.Player;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;

/**
 *
 * @author nCr78
 */
public class Parathiro extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    public Parathiro() {
        initComponents();
        initComplex();
	placePawns();
        addListeners();
        System.out.println("TODO: gameLogic(start sinartisi dld) + remove pawns/players if not exist (also add an xriastoun?rejoinable?) \nStatus: Fixed parathiro bug, einai koble me 2 paixtes.\nNikola: <AMA> boreis koitakse ligo na min borei na valei o xristis to idio xroma, xoris na vgainei ksana apo tin arxi to parathiro, alla apla na min iparxei to sigkekrimeno xroma pou epelekse kapios allos xristis..ara tha prepei na pairnei tin lista available xromaton apo ton server k oxi locally..");
    }
    private void initComplex()
    {
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        PrintStream printStream = new PrintStream(new CustomOutput(jTextArea1));
        System.setOut(printStream);
        System.setErr(printStream);
       
        Circle kiklos_prasino = new Circle();
        jPanel70.add(kiklos_prasino);
        jPanel70.setPreferredSize(new Dimension(40, 40));
       
        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kiklos_prasino, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addComponent(kiklos_prasino)
                .addGap(0, 0, 0))
        );
        
        
        Circle kiklos_kokino = new Circle();
        jPanel16.add(kiklos_kokino);
        jPanel16.setPreferredSize(new Dimension(40, 40));
       
        
        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kiklos_kokino, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(kiklos_kokino)
                .addGap(0, 0, 0))
        );
        
        Circle kiklos_ble = new Circle();
        jPanel78.add(kiklos_ble);
        jPanel78.setPreferredSize(new Dimension(40, 40));
       
        
        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kiklos_ble, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addComponent(kiklos_ble)
                .addGap(0, 0, 0))
        );
        
        Circle kiklos_kitrino = new Circle();
        jPanel35.add(kiklos_kitrino);
        jPanel35.setPreferredSize(new Dimension(40, 40));
       
        
        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kiklos_kitrino, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addComponent(kiklos_kitrino)
                .addGap(0, 0, 0))
        );
        
        
        
        Star star_prasino = new Star();
        jPanel63.add(star_prasino);
        jPanel63.setPreferredSize(new Dimension(40, 40));
       
        
        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(star_prasino, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addComponent(star_prasino)
                .addGap(0, 0, 0))
        );
        
        Star star_kokino = new Star();
        jPanel21.add(star_kokino);
        jPanel21.setPreferredSize(new Dimension(40, 40));
        
        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(star_kokino, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(star_kokino)
                .addGap(0, 0, 0))
        );
        
        Star star_ble = new Star();
        jPanel89.add(star_ble);
        jPanel89.setPreferredSize(new Dimension(40, 40));
        
        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(star_ble, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addComponent(star_ble)
                .addGap(0, 0, 0))
        );
        
        Star star_kitrino = new Star();
        jPanel30.add(star_kitrino);
        jPanel30.setPreferredSize(new Dimension(40, 40));
        
        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(star_kitrino, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(star_kitrino)
                .addGap(0, 0, 0))
        );
        
        kentrikoRGBY = new RotatePanel(4);
        kentrikoRGBY.setPreferredSize(new Dimension(120, 120));
        
        javax.swing.GroupLayout KentrikoLayout = new javax.swing.GroupLayout(Kentriko);
        Kentriko.setLayout(KentrikoLayout);
        KentrikoLayout.setHorizontalGroup(
            KentrikoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kentrikoRGBY, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        KentrikoLayout.setVerticalGroup(
            KentrikoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KentrikoLayout.createSequentialGroup()
                .addComponent(kentrikoRGBY)
                .addGap(0, 0, 0))
        );
        
        
        fouf = new RotatePanel();
        fouf.setColor(new Color(0,204,51));
        //rithmisi gia to rotated panel
        fouf.setPreferredSize(new Dimension(239, 238));
       
        jLayeredPane1.setBounds(0, 0, 240, 240);
        
        panoPrasino.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        panoPrasino.setBackground(new Color(0,204,51));
        panoPrasino.setBounds(99, 60, 40, 40);
        panoPrasino.setOpaque(true);
        
        katoPrasino.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        katoPrasino.setBackground(new Color(0,204,51));
        katoPrasino.setBounds(99, 138, 40, 40);
        katoPrasino.setOpaque(true);
        
        aristeraPrasino.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        aristeraPrasino.setBackground(new Color(0,204,51));
        aristeraPrasino.setBounds(60, 99, 40, 40);
        aristeraPrasino.setOpaque(true);
        
        deksiaPrasino.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        deksiaPrasino.setBackground(new Color(0,204,51));
        deksiaPrasino.setBounds(138, 99, 40, 40);
        deksiaPrasino.setOpaque(true);
        
        jLayeredPane1.add(panoPrasino, new Integer(0), 0);
        jLayeredPane1.add(katoPrasino, new Integer(0), 0);
        jLayeredPane1.add(aristeraPrasino, new Integer(0), 0);
        jLayeredPane1.add(deksiaPrasino, new Integer(0), 0);
        
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(fouf)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fouf)
        );
        
        
        
        
        fouf2 = new RotatePanel();
        fouf2.setPreferredSize(new Dimension(239, 238));

        jLayeredPane2.setBounds(0, 0, 240, 240);

        panoKokino.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        panoKokino.setBackground(Color.red);
        panoKokino.setBounds(99, 60, 40, 40);
        panoKokino.setOpaque(true);
        
        katoKokino.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        katoKokino.setBackground(Color.red);
        katoKokino.setBounds(99, 138, 40, 40);
        katoKokino.setOpaque(true);
        
        aristeraKokino.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        aristeraKokino.setBackground(Color.red);
        aristeraKokino.setBounds(60, 99, 40, 40);
        aristeraKokino.setOpaque(true);
        
        deksiaKokino.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        deksiaKokino.setBackground(Color.red);
        deksiaKokino.setBounds(138, 99, 40, 40);
        deksiaKokino.setOpaque(true);
        
        jLayeredPane2.add(panoKokino, new Integer(0), 0);
        jLayeredPane2.add(katoKokino, new Integer(0), 0);
        jLayeredPane2.add(aristeraKokino, new Integer(0), 0);
        jLayeredPane2.add(deksiaKokino, new Integer(0), 0);
        
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(fouf2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fouf2)
        );
        
        
        
        
        fouf3 = new RotatePanel();
        fouf3.setPreferredSize(new Dimension(239, 238));
        
        jLayeredPane3.setBounds(0, 0, 240, 240);

        panoKitrino.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        panoKitrino.setBackground(new Color(255,255,51));
        panoKitrino.setBounds(99, 60, 40, 40);
        panoKitrino.setOpaque(true);
        
        katoKitrino.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        katoKitrino.setBackground(new Color(255,255,51));
        katoKitrino.setBounds(99, 138, 40, 40);
        katoKitrino.setOpaque(true);
        
        aristeraKitrino.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        aristeraKitrino.setBackground(new Color(255,255,51));
        aristeraKitrino.setBounds(60, 99, 40, 40);
        aristeraKitrino.setOpaque(true);
        
        deksiaKitrino.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        deksiaKitrino.setBackground(new Color(255,255,51));
        deksiaKitrino.setBounds(138, 99, 40, 40);
        deksiaKitrino.setOpaque(true);
        
        jLayeredPane3.add(panoKitrino, new Integer(0), 0);
        jLayeredPane3.add(katoKitrino, new Integer(0), 0);
        jLayeredPane3.add(aristeraKitrino, new Integer(0), 0);
        jLayeredPane3.add(deksiaKitrino, new Integer(0), 0);
        
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(fouf3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fouf3)
        );
        
        
        
        
        fouf4 = new RotatePanel();
        fouf4.setPreferredSize(new Dimension(239, 238));
        
        jLayeredPane4.setBounds(0, 0, 240, 240);

        panoBle.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        panoBle.setBackground(new Color(51,51,255));
        panoBle.setBounds(99, 60, 40, 40);
        panoBle.setOpaque(true);
        
        katoBle.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        katoBle.setBackground(new Color(51,51,255));
        katoBle.setBounds(99, 138, 40, 40);
        katoBle.setOpaque(true);
        
        aristeraBle.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        aristeraBle.setBackground(new Color(51,51,255));
        aristeraBle.setBounds(60, 99, 40, 40);
        aristeraBle.setOpaque(true);
        
        deksiaBle.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        deksiaBle.setBackground(new Color(51,51,255));
        deksiaBle.setBounds(138, 99, 40, 40);
        deksiaBle.setOpaque(true);
        
        jLayeredPane4.add(panoBle, new Integer(0), 0);
        jLayeredPane4.add(katoBle, new Integer(0), 0);
        jLayeredPane4.add(aristeraBle, new Integer(0), 0);
        jLayeredPane4.add(deksiaBle, new Integer(0), 0);
        
        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(fouf4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fouf4)
        );
    }
    
    private void addComplex(RotatePanel fouf, JLayeredPane jlp, JPanel panel, JPanel pano, JPanel kato, JPanel deksia, JPanel aristera)
    {
        fouf = new RotatePanel();
        fouf.setPreferredSize(new Dimension(239, 238));
        
        jlp.setBounds(0, 0, 240, 240);

        pano.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        pano.setBackground(new Color(51,51,255));
        pano.setBounds(99, 60, 40, 40);
        pano.setOpaque(true);
        
        kato.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        kato.setBackground(new Color(51,51,255));
        kato.setBounds(99, 138, 40, 40);
        kato.setOpaque(true);
        
        aristera.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        aristera.setBackground(new Color(51,51,255));
        aristera.setBounds(60, 99, 40, 40);
        aristera.setOpaque(true);
        
        deksia.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        deksia.setBackground(new Color(51,51,255));
        deksia.setBounds(138, 99, 40, 40);
        deksia.setOpaque(true);
        
        jlp.add(pano, new Integer(0), 0);
        jlp.add(kato, new Integer(0), 0);
        jlp.add(aristera, new Integer(0), 0);
        jlp.add(deksia, new Integer(0), 0);
        
        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(panel);
        panel.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(fouf)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fouf)
        );
    }
    
    private void placePawns()
    {
        //final Pawn Focused = new Pawn(Color.darkGray, "focus", 0);
  
        //allos tropos: layered pane se kathe panel pou exo...same lines of code or what?...-_-
        pawn_prasino = new Pawn(0, "Prasinos", 0);
        pawn_prasino2 = new Pawn(0, "Prasinos2", 1);
        pawn_prasino3 = new Pawn(0, "Prasinos3", 2);
        pawn_prasino4 = new Pawn(0, "Prasinos4", 3);
        BorderLayout panoPrasinoLayout = new BorderLayout();
        BorderLayout katoPrasinoLayout = new BorderLayout();
        BorderLayout deksiaPrasinoLayout = new BorderLayout();
        BorderLayout aristeraPrasinoLayout = new BorderLayout();
        panoPrasino.setLayout(panoPrasinoLayout);
        katoPrasino.setLayout(katoPrasinoLayout);
        deksiaPrasino.setLayout(deksiaPrasinoLayout);
        aristeraPrasino.setLayout(aristeraPrasinoLayout);
        panoPrasino.add(pawn_prasino, BorderLayout.CENTER);
        katoPrasino.add(pawn_prasino2, BorderLayout.CENTER);
        deksiaPrasino.add(pawn_prasino3, BorderLayout.CENTER);
        aristeraPrasino.add(pawn_prasino4, BorderLayout.CENTER);
        
        pawn_kokino = new Pawn(1, "Kokinos", 0);
        pawn_kokino2 = new Pawn(1, "Kokinos2", 1);
        pawn_kokino3 = new Pawn(1, "Kokinos3", 2);
        pawn_kokino4 = new Pawn(1, "Kokinos4", 3);
        BorderLayout panoKokinoLayout = new BorderLayout();
        BorderLayout katoKokinoLayout = new BorderLayout();
        BorderLayout deksiaKokinoLayout = new BorderLayout();
        BorderLayout aristeraKokinoLayout = new BorderLayout();
        panoKokino.setLayout(panoKokinoLayout);
        katoKokino.setLayout(katoKokinoLayout);
        deksiaKokino.setLayout(deksiaKokinoLayout);
        aristeraKokino.setLayout(aristeraKokinoLayout);
        panoKokino.add(pawn_kokino, BorderLayout.CENTER);
        katoKokino.add(pawn_kokino2, BorderLayout.CENTER);
        deksiaKokino.add(pawn_kokino3, BorderLayout.CENTER);
        aristeraKokino.add(pawn_kokino4, BorderLayout.CENTER);
        
        pawn_ble = new Pawn(2, "Ble", 0);
        pawn_ble2 = new Pawn(2, "Ble2", 1);
        pawn_ble3 = new Pawn(2, "Ble3", 2);
        pawn_ble4 = new Pawn(2, "Ble4", 3);
        BorderLayout panoBleLayout = new BorderLayout();
        BorderLayout katoBleLayout = new BorderLayout();
        BorderLayout deksiaBleLayout = new BorderLayout();
        BorderLayout aristeraBleLayout = new BorderLayout();
        panoBle.setLayout(panoBleLayout);
        katoBle.setLayout(katoBleLayout);
        deksiaBle.setLayout(deksiaBleLayout);
        aristeraBle.setLayout(aristeraBleLayout);
        panoBle.add(pawn_ble, BorderLayout.CENTER);
        katoBle.add(pawn_ble2, BorderLayout.CENTER);
        deksiaBle.add(pawn_ble3, BorderLayout.CENTER);
        aristeraBle.add(pawn_ble4, BorderLayout.CENTER);
        
        pawn_kitrino = new Pawn(3, "Kitrinos", 0);
        pawn_kitrino2 = new Pawn(3, "Kitrinos2", 1);
        pawn_kitrino3 = new Pawn(3, "Kitrinos3", 2);
        pawn_kitrino4 = new Pawn(3, "Kitrinos4", 3);
        BorderLayout panoKitrinoLayout = new BorderLayout();
        BorderLayout katoKitrinoLayout = new BorderLayout();
        BorderLayout deksiaKitrinoLayout = new BorderLayout();
        BorderLayout aristeraKitrinoLayout = new BorderLayout();
        panoKitrino.setLayout(panoKitrinoLayout);
        katoKitrino.setLayout(katoKitrinoLayout);
        deksiaKitrino.setLayout(deksiaKitrinoLayout);
        aristeraKitrino.setLayout(aristeraKitrinoLayout);
        panoKitrino.add(pawn_kitrino, BorderLayout.CENTER);
        katoKitrino.add(pawn_kitrino2, BorderLayout.CENTER);
        deksiaKitrino.add(pawn_kitrino3, BorderLayout.CENTER);
        aristeraKitrino.add(pawn_kitrino4, BorderLayout.CENTER);
    }
    
    private void addListeners()
    {
        addMouseListener(pawn_prasino);
        addMouseListener(pawn_prasino2);
        addMouseListener(pawn_prasino3);
        addMouseListener(pawn_prasino4);
        
        addMouseListener(pawn_kokino);
        addMouseListener(pawn_kokino2);
        addMouseListener(pawn_kokino3);
        addMouseListener(pawn_kokino4);
        
        addMouseListener(pawn_ble);
        addMouseListener(pawn_ble2);
        addMouseListener(pawn_ble3);
        addMouseListener(pawn_ble4);
        
        addMouseListener(pawn_kitrino);
        addMouseListener(pawn_kitrino2);
        addMouseListener(pawn_kitrino3);
        addMouseListener(pawn_kitrino4);
    }
    
    public void paint (HashMap<Integer,PriorityQueue<Pawn>> kati)
    {
        
    }
    
    private void addMouseListener(final Pawn p)
    {
        p.addMouseMotionListener(new MouseMotionListener() 
        {
            @Override
            public void mouseMoved(MouseEvent e) 
            {
                final int x = e.getX();
                final int y = e.getY();
		int prevPosition=-1 , position=-1;
                final Rectangle cellBounds = p.getBounds();
                if (cellBounds != null && cellBounds.contains(x, y)) {p.setCursor(new Cursor(Cursor.HAND_CURSOR));}
                else {p.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));}
		//Edo prepei na ftiaxnei ena new Pawn me tin allagi
		//kai telos prepei na allazei tin playingFlag se false gia na sinexisei to programma
		if(myTurn && gameStartedFlag){
		    //pawnMoved = new Pawn(me.getColour(), me.getName(), prevPosition,position);
		    playingFlag = false;		    
		}
            }

            @Override
            public void mouseDragged(MouseEvent e) {}
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jPanel4 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel5 = new javax.swing.JPanel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        jPanel79 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        Kentriko = new javax.swing.JPanel();
        KentrikoLayers = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(609, 740));
        setPreferredSize(new java.awt.Dimension(590, 740));
        setResizable(false);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(590, 900));
        jPanel1.setMinimumSize(new java.awt.Dimension(590, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(590, 900));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanel2.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanel3.setMinimumSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3)
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanel4.setMinimumSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanel5.setMinimumSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane4)
        );

        jPanel58.setMaximumSize(new java.awt.Dimension(280, 120));
        jPanel58.setName(""); // NOI18N
        jPanel58.setLayout(new java.awt.GridBagLayout());

        jPanel59.setBackground(new java.awt.Color(0, 204, 51));
        jPanel59.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel59.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel59.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel58.add(jPanel59, gridBagConstraints);

        jPanel60.setBackground(new java.awt.Color(255, 255, 255));
        jPanel60.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel60.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel60.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel58.add(jPanel60, gridBagConstraints);

        jPanel61.setBackground(new java.awt.Color(255, 255, 255));
        jPanel61.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel61.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel61.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel58.add(jPanel61, gridBagConstraints);

        jPanel62.setBackground(new java.awt.Color(255, 255, 255));
        jPanel62.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel62.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel62.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        jPanel58.add(jPanel62, gridBagConstraints);

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));
        jPanel63.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel63.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel63.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel58.add(jPanel63, gridBagConstraints);

        jPanel64.setBackground(new java.awt.Color(255, 255, 255));
        jPanel64.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel64.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel64.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        jPanel58.add(jPanel64, gridBagConstraints);

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel37.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel37.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel58.add(jPanel37, gridBagConstraints);

        jPanel38.setBackground(new java.awt.Color(0, 204, 51));
        jPanel38.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel38.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel38.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel58.add(jPanel38, gridBagConstraints);

        jPanel39.setBackground(new java.awt.Color(0, 204, 51));
        jPanel39.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel39.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel39.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel58.add(jPanel39, gridBagConstraints);

        jPanel40.setBackground(new java.awt.Color(0, 204, 51));
        jPanel40.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel40.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel40.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        jPanel58.add(jPanel40, gridBagConstraints);

        jPanel41.setBackground(new java.awt.Color(0, 204, 51));
        jPanel41.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel41.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel41.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        jPanel58.add(jPanel41, gridBagConstraints);

        jPanel42.setBackground(new java.awt.Color(0, 204, 51));
        jPanel42.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel42.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel42.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        jPanel58.add(jPanel42, gridBagConstraints);

        jPanel67.setBackground(new java.awt.Color(255, 255, 255));
        jPanel67.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel67.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel67.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel58.add(jPanel67, gridBagConstraints);

        jPanel68.setBackground(new java.awt.Color(255, 255, 255));
        jPanel68.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel68.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel68.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel58.add(jPanel68, gridBagConstraints);

        jPanel69.setBackground(new java.awt.Color(255, 255, 255));
        jPanel69.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel69.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel69.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel58.add(jPanel69, gridBagConstraints);

        jPanel70.setBackground(new java.awt.Color(255, 255, 255));
        jPanel70.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel70.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel70.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        jPanel58.add(jPanel70, gridBagConstraints);

        jPanel71.setBackground(new java.awt.Color(255, 255, 255));
        jPanel71.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel71.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel71.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        jPanel58.add(jPanel71, gridBagConstraints);

        jPanel72.setBackground(new java.awt.Color(255, 255, 255));
        jPanel72.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel72.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel72.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        jPanel58.add(jPanel72, gridBagConstraints);

        jPanel74.setMaximumSize(new java.awt.Dimension(280, 120));
        jPanel74.setName(""); // NOI18N
        jPanel74.setLayout(new java.awt.GridBagLayout());

        jPanel75.setBackground(new java.awt.Color(255, 255, 255));
        jPanel75.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel75.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel75.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel74.add(jPanel75, gridBagConstraints);

        jPanel77.setBackground(new java.awt.Color(255, 255, 255));
        jPanel77.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel77.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel77.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel74.add(jPanel77, gridBagConstraints);

        jPanel78.setBackground(new java.awt.Color(255, 255, 255));
        jPanel78.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel78.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel78.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel74.add(jPanel78, gridBagConstraints);

        jPanel79.setBackground(new java.awt.Color(255, 255, 255));
        jPanel79.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel79.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel79.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        jPanel74.add(jPanel79, gridBagConstraints);

        jPanel80.setBackground(new java.awt.Color(255, 255, 255));
        jPanel80.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel80.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel80.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel74.add(jPanel80, gridBagConstraints);

        jPanel81.setBackground(new java.awt.Color(255, 255, 255));
        jPanel81.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel81.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel81.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        jPanel74.add(jPanel81, gridBagConstraints);

        jPanel82.setBackground(new java.awt.Color(255, 255, 255));
        jPanel82.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel82.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel82.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        jPanel74.add(jPanel82, gridBagConstraints);

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel43.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel43.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel74.add(jPanel43, gridBagConstraints);

        jPanel83.setBackground(new java.awt.Color(51, 51, 255));
        jPanel83.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel83.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel83.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel74.add(jPanel83, gridBagConstraints);

        jPanel85.setBackground(new java.awt.Color(51, 51, 255));
        jPanel85.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel85.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel85.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel74.add(jPanel85, gridBagConstraints);

        jPanel86.setBackground(new java.awt.Color(51, 51, 255));
        jPanel86.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel86.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel86.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        jPanel74.add(jPanel86, gridBagConstraints);

        jPanel87.setBackground(new java.awt.Color(51, 51, 255));
        jPanel87.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel87.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel87.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        jPanel74.add(jPanel87, gridBagConstraints);

        jPanel88.setBackground(new java.awt.Color(51, 51, 255));
        jPanel88.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel88.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel88.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel74.add(jPanel88, gridBagConstraints);

        jPanel89.setBackground(new java.awt.Color(255, 255, 255));
        jPanel89.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel89.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel89.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel74.add(jPanel89, gridBagConstraints);

        jPanel91.setBackground(new java.awt.Color(255, 255, 255));
        jPanel91.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel91.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel91.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel74.add(jPanel91, gridBagConstraints);

        jPanel92.setBackground(new java.awt.Color(255, 255, 255));
        jPanel92.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel92.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel92.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        jPanel74.add(jPanel92, gridBagConstraints);

        jPanel93.setBackground(new java.awt.Color(51, 51, 255));
        jPanel93.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel93.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel93.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        jPanel74.add(jPanel93, gridBagConstraints);

        jPanel94.setBackground(new java.awt.Color(255, 255, 255));
        jPanel94.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel94.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel94.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        jPanel74.add(jPanel94, gridBagConstraints);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel7.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel7.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel6.add(jPanel7, gridBagConstraints);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel8.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel8.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel8.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel6.add(jPanel8, gridBagConstraints);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel9.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel9.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel9.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel6.add(jPanel9, gridBagConstraints);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel10.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel10.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel10.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel6.add(jPanel10, gridBagConstraints);

        jPanel11.setBackground(new java.awt.Color(255, 0, 0));
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel11.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel11.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel11.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel6.add(jPanel11, gridBagConstraints);

        jPanel12.setBackground(new java.awt.Color(255, 0, 0));
        jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel12.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel12.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel12.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel6.add(jPanel12, gridBagConstraints);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel13.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel13.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel13.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel6.add(jPanel13, gridBagConstraints);

        jPanel14.setBackground(new java.awt.Color(255, 0, 0));
        jPanel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel14.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel14.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel14.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel6.add(jPanel14, gridBagConstraints);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel15.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel15.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel15.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel6.add(jPanel15, gridBagConstraints);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel16.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel16.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel16.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel6.add(jPanel16, gridBagConstraints);

        jPanel17.setBackground(new java.awt.Color(255, 0, 0));
        jPanel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel17.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel17.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel17.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel6.add(jPanel17, gridBagConstraints);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel18.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel18.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel18.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        jPanel6.add(jPanel18, gridBagConstraints);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel19.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel19.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel19.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel6.add(jPanel19, gridBagConstraints);

        jPanel20.setBackground(new java.awt.Color(255, 0, 0));
        jPanel20.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel20.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel20.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel20.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        jPanel6.add(jPanel20, gridBagConstraints);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel21.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel21.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel21.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel6.add(jPanel21, gridBagConstraints);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel23.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel23.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel23.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel6.add(jPanel23, gridBagConstraints);

        jPanel24.setBackground(new java.awt.Color(255, 0, 0));
        jPanel24.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel24.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel24.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel24.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        jPanel6.add(jPanel24, gridBagConstraints);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel25.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel25.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel25.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        jPanel6.add(jPanel25, gridBagConstraints);

        jPanel26.setLayout(new java.awt.GridBagLayout());

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel27.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel27.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel26.add(jPanel27, gridBagConstraints);

        jPanel28.setBackground(new java.awt.Color(255, 255, 51));
        jPanel28.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel28.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel28.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel26.add(jPanel28, gridBagConstraints);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel29.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel29.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel26.add(jPanel29, gridBagConstraints);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel30.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel30.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel26.add(jPanel30, gridBagConstraints);

        jPanel31.setBackground(new java.awt.Color(255, 255, 51));
        jPanel31.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel31.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel31.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel26.add(jPanel31, gridBagConstraints);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel32.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel32.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel26.add(jPanel32, gridBagConstraints);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel33.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel33.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel26.add(jPanel33, gridBagConstraints);

        jPanel34.setBackground(new java.awt.Color(255, 255, 51));
        jPanel34.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel34.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel34.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel26.add(jPanel34, gridBagConstraints);

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel35.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel35.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel26.add(jPanel35, gridBagConstraints);

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel36.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel36.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel26.add(jPanel36, gridBagConstraints);

        jPanel44.setBackground(new java.awt.Color(255, 255, 51));
        jPanel44.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel44.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel44.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel26.add(jPanel44, gridBagConstraints);

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel50.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel50.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        jPanel26.add(jPanel50, gridBagConstraints);

        jPanel51.setBackground(new java.awt.Color(255, 255, 51));
        jPanel51.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel51.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel51.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel26.add(jPanel51, gridBagConstraints);

        jPanel52.setBackground(new java.awt.Color(255, 255, 51));
        jPanel52.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel52.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel52.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        jPanel26.add(jPanel52, gridBagConstraints);

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));
        jPanel53.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel53.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel53.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel26.add(jPanel53, gridBagConstraints);

        jPanel54.setBackground(new java.awt.Color(255, 255, 255));
        jPanel54.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel54.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel54.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel26.add(jPanel54, gridBagConstraints);

        jPanel55.setBackground(new java.awt.Color(255, 255, 255));
        jPanel55.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel55.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel55.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        jPanel26.add(jPanel55, gridBagConstraints);

        jPanel56.setBackground(new java.awt.Color(255, 255, 255));
        jPanel56.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel56.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel56.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        jPanel26.add(jPanel56, gridBagConstraints);

        javax.swing.GroupLayout KentrikoLayersLayout = new javax.swing.GroupLayout(KentrikoLayers);
        KentrikoLayers.setLayout(KentrikoLayersLayout);
        KentrikoLayersLayout.setHorizontalGroup(
            KentrikoLayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        KentrikoLayersLayout.setVerticalGroup(
            KentrikoLayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout KentrikoLayout = new javax.swing.GroupLayout(Kentriko);
        Kentriko.setLayout(KentrikoLayout);
        KentrikoLayout.setHorizontalGroup(
            KentrikoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KentrikoLayers, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        KentrikoLayout.setVerticalGroup(
            KentrikoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KentrikoLayout.createSequentialGroup()
                .addComponent(KentrikoLayers)
                .addGap(0, 0, 0))
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel58, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Kentriko, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel74, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kentriko, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Game");

        jMenuItem1.setText("Join game");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoinGame_Action(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Stop game");
        jMenuItem2.setEnabled(false);
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopGame_Action(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitGame_Action(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem4.setText("Help");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Help_Action(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("About \"Gkriniaris\"");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                About_Action(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);
    }// </editor-fold>//GEN-END:initComponents

    private void JoinGame_Action(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoinGame_Action
        JOptionPane OP = new JOptionPane();        
        String host = null;
        String splitvar[];
        int port;
        boolean connected=false;
        try
        {
            host = OP.showInputDialog(p, "Hostname (example: 127.0.0.1:80)", "Hostname", JOptionPane.PLAIN_MESSAGE,null,null,"127.0.0.1:80").toString();
            splitvar = host.split(":");
            port = Integer.parseInt(splitvar[1]);
            SI = new ServerInterface(splitvar[0], port);
            connected=true;
        }
        catch (java.lang.ArrayIndexOutOfBoundsException e){System.out.println("Wrong details");}
        catch (IOException ex){System.out.println("Couldn't connect!");} 
        catch (ClassNotFoundException ex){}
        catch (java.lang.NullPointerException e){}
        if(connected)
        {
            System.out.println("Connected");
            String[]comboBoxContents={"Red Player","Blue Player","Yellow Player", "Green Player"};
            JComboBox comboBox = new JComboBox(comboBoxContents);
            JPanel panel = new JPanel(new GridBagLayout());
            JTextField TF = new JTextField();
            JLabel JL = new JLabel("Select:  ");
            JLabel JL2 = new JLabel("Name:");
            JPanel space1 = new JPanel();
            JPanel space2 = new JPanel();

            space1.setPreferredSize(new Dimension(0, 10));
            space2.setPreferredSize(new Dimension(0, 10));
            TF.setPreferredSize(new Dimension(100, 25));
            TF.setText("Fouf");
            comboBox.setRenderer(new ColorCellRenderer());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.CENTER;
            
            panel.add(JL, gbc);
            gbc.gridx++;
            panel.add(comboBox, gbc);//thesi 0,1
            gbc.gridy++;
            panel.add(space1, gbc);//thesi 1,1
            gbc.gridx--;
            gbc.gridy++;
            panel.add(JL2, gbc);//thesi 2,0
            gbc.gridx++;
            panel.add(TF, gbc);//thesi 2,1
            int player_num = 0;
            int pawns = 0;
            int players = 0;
            boolean checkbox_value = false;
            String name = null;
            boolean check = false;
            try {check = SI.getGmFlag();}
            catch(java.lang.NullPointerException e){System.out.println("Couldn't get game settings..");}
            if (check) 
            {
                String[]numberOfPlayers={"1","2","3","4"};
                JCheckBox checkbox = new JCheckBox();
                JComboBox comboBox2 = new JComboBox(numberOfPlayers);
                JComboBox comboBox3 = new JComboBox(numberOfPlayers);
                JLabel JL3 = new JLabel("Number of players:  ");
                JLabel JL4 = new JLabel("Number of pawns:  ");
                JLabel JL5 = new JLabel("Rejoinable:  ");
                JPanel space3 = new JPanel();
                JPanel space4 = new JPanel();
                space3.setPreferredSize(new Dimension(0, 10));
                space4.setPreferredSize(new Dimension(0, 10));
                comboBox3.setSelectedIndex(3);
                checkbox.setEnabled(false);
                checkbox.setSelected(false);
                
                gbc.gridx--;
                gbc.gridy++;
                panel.add(space2, gbc);//thesi 3,0
                gbc.gridy++;
                panel.add(JL3, gbc);//thesi 4,0
                gbc.gridx++;
                panel.add(comboBox2, gbc);//thesi 4,1
                gbc.gridx--;
                gbc.gridy++;
                panel.add(space3, gbc);//thesi 5,0
                gbc.gridy++;
                panel.add(JL4, gbc);//thesi 6,0
                gbc.gridx++;
                panel.add(comboBox3, gbc);//thesi 6,1
                gbc.gridx--;
                gbc.gridy++;
                panel.add(space4, gbc);//thesi 7,0
                gbc.gridy++;
                panel.add(JL5, gbc);//thesi 8,0
                gbc.gridx++;
                panel.add(checkbox, gbc);//thesi 8,1
                System.out.print("Waiting.. ");
                OP.showMessageDialog(p, panel, "Set game settings", JOptionPane.PLAIN_MESSAGE);
                name = TF.getText();
                player_num = comboBox.getSelectedIndex();
                me = new Player(name,player_num);
                players = comboBox2.getSelectedIndex()+1;
                pawns = comboBox3.getSelectedIndex()+1;
                checkbox_value = checkbox.isSelected();
                
                gms = new GameSettings(players, checkbox_value, pawns);
                try {SI.init(me, gms);} 
                catch (IOException ex) {Logger.getLogger(Parathiro.class.getName()).log(Level.SEVERE, null, ex);}
            }
	    else{              
                OP.showMessageDialog(p, panel, "Choose a nickname", JOptionPane.PLAIN_MESSAGE);
                name = TF.getText();
                player_num = comboBox.getSelectedIndex();
                me = new Player(name,player_num);
                try {
		    SI.init(me);
		}catch (IOException | java.lang.NullPointerException ex) {
		    System.out.println("Something went wrong in the server comunication");
		}
            }
            jMenuItem2.setEnabled(true);
            jMenuItem1.setEnabled(false);
            try {
		SI.sync();
	    }catch (IOException | ClassNotFoundException ex) {
		System.out.println("Something went wrong in the server comunication");
	    }
	    PrintPlayers();
            Start();
        }
    }//GEN-LAST:event_JoinGame_Action

    private void StopGame_Action(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopGame_Action
        try{
            SI.endGame();
            jMenuItem2.setEnabled(false);
            jMenuItem1.setEnabled(true);
        }catch (IOException ex) {
	    System.out.println("Disconnected!");
	}catch (java.lang.NullPointerException e) {
	    System.out.println("You were not connected anyway..");
	}catch (ClassNotFoundException ex) {
	    System.out.println("Error in comunication with the server");
	}
    }//GEN-LAST:event_StopGame_Action

    private void ExitGame_Action(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitGame_Action
        StopGame_Action(evt);
	this.dispose();
    }//GEN-LAST:event_ExitGame_Action

    private void Help_Action(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Help_Action
        final JOptionPane OP = new JOptionPane();
        final JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(600, 180));
        JTextArea textArea = new JTextArea(
                "Two, three, or four may play. At the beginning of the game, each player's tokens are out of play and staged in one of the large corner areas of the board in the player's color (called the player's yard  ). When able to, the players will enter their tokens one per time on their respective starting squares, and proceed to race them clockwise around the board along the game track (the path of squares not part of any player's home column). When reaching the square below the home column, a player continues by racing tokens up the column to the finish square. The rolls of a cube die control the swiftness of the tokens, and entry to the finish square requires a precise roll from the player. The first to bring all their tokens to the finish wins the game. The others often continue play to determine second-, third-, and fourth-place finishers.", 
                6, 
                20);
        textArea.setPreferredSize(new Dimension(600, 180));
        textArea.setFont(new Font("Dialog", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        
        panel.add(textArea);
        OP.showOptionDialog(p, panel, "How to play", JOptionPane.YES_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Thanks!" }, null);
    }//GEN-LAST:event_Help_Action

    private void About_Action(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_About_Action
        JOptionPane OP = new JOptionPane();
        JPanel panel = new JPanel(new BorderLayout());
        panel.setPreferredSize(new Dimension(300, 0));
        JTextArea textArea = new JTextArea("Karamolegkos Eleftherios"+"      2024200900083\n\n"+"Andronopoulos Nikolas"+"          2024200900026", 6, 20);
        textArea.setPreferredSize(new Dimension(300, 0));
        textArea.setFont(new Font("Dialog", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        
        panel.add(textArea, BorderLayout.CENTER);
        OP.showOptionDialog(p, panel, "About", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[] {}, null);
        
    }//GEN-LAST:event_About_Action

    public void PrintPlayers(){
	System.out.println("Player Connected in game: ");
	for (Player p : SI.getPlayers()){
	    System.out.print("\t"+p.getName()+" : ");
	    switch(p.getColor()){
		case 0:
		    System.out.println("red");
		    break;
		case 1:
		    System.out.println("blue");
		    break;
		case 2:
		    System.out.println("yellow");
		    break;
		case 3:
		    System.out.println("green");
		    break;
		default:
		    break;
	    }
	}
    }
    
    public void Start(){
	gameStartedFlag = true;
	try{
	    int resp = 0;
	    while(resp != 1){
		resp = SI.waitForTurn();
		if(resp==0){
		    System.out.println(SI.getDice()+"\n"+SI.getPawn());
		    updateBoard(SI.getPawn());
		}else if(resp==1){
		    myTurn = true;
		    playingFlag = true;
		    System.out.println("=> THIS YOUR TURN! <=");
		    diceRolled = new Dice((int)Math.random()*6+1);
		    System.out.println("You rolled a: "+diceRolled.getDie1());
		    //Waits for listener
		    while(playingFlag){ }
		    SI.updatePawn(diceRolled, pawnMoved);
		    myTurn = false;
		}else if(resp ==-1)
		    System.out.println("Game Ended");
	    }
	} catch (IOException | ClassNotFoundException ex) {
	    System.out.println("Something went worng... Game ended!");
	}
	gameStartedFlag = false;
    }

    private void updateBoard(Pawn pawn) {
	System.out.println("Player "+
		pawn.getPlayerName()+
		" moved a pawn from"+
		pawn.getPrevPosition()+
		" to  "+
		pawn.getPosition());
	//Edo kaneis ta dika sou gia na kanei update to board me to kainourgio move
	//somehow...
    }
  class ColorCellRenderer implements ListCellRenderer 
  {
    private DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
    private Dimension preferredSize = new Dimension(100, 20);

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) 
    {
        JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value.equals("Red Player")) 
        {
            renderer.setBackground(Color.RED);
            renderer.setForeground(Color.RED);
        }
        else if(value.equals("Blue Player"))
        {
            renderer.setBackground(Color.BLUE);
            renderer.setForeground(Color.BLUE);
        }
        else if(value.equals("Yellow Player"))
        {
            renderer.setBackground(Color.YELLOW);
            renderer.setForeground(Color.YELLOW);
        }
        else if(value.equals("Green Player"))
        {
            renderer.setBackground(Color.GREEN);
            renderer.setForeground(Color.GREEN);
        }
        
        if (cellHasFocus || isSelected) {renderer.setBorder(new LineBorder(Color.BLACK));}
        else {renderer.setBorder(null);}
        
        if(index<0) {renderer.setBorder(null);}
        renderer.setPreferredSize(preferredSize);
        return renderer;
    }
}
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Parathiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parathiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parathiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parathiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                p = new Parathiro();
                p.pack();
                p.setLocationRelativeTo(null);
                p.setVisible(true);
            }
        });
    }
//    private String name;
    private ServerInterface SI = null;
    private boolean playingFlag;
    private boolean gameStartedFlag;
    private boolean myTurn;
    private GameSettings gms;
    private Player me;
    private Dice diceRolled;
    private Pawn pawnMoved;
    private static Parathiro p;
    private Pawn pawn_prasino;
    private Pawn pawn_prasino2;
    private Pawn pawn_prasino3;
    private Pawn pawn_prasino4;
    private Pawn pawn_kokino;
    private Pawn pawn_kokino2;
    private Pawn pawn_kokino3;
    private Pawn pawn_kokino4;
    private Pawn pawn_ble;
    private Pawn pawn_ble2;
    private Pawn pawn_ble3;
    private Pawn pawn_ble4;
    private Pawn pawn_kitrino;
    private Pawn pawn_kitrino2;
    private Pawn pawn_kitrino3;
    private Pawn pawn_kitrino4;
    private RotatePanel kentrikoRGBY;
    private RotatePanel fouf;
    private RotatePanel fouf2;
    private RotatePanel fouf3;
    private RotatePanel fouf4;
    private JPanel panoPrasino = new JPanel();
    private JPanel katoPrasino = new JPanel();
    private JPanel aristeraPrasino = new JPanel();
    private JPanel deksiaPrasino = new JPanel();
    private JPanel panoKokino = new JPanel();
    private JPanel katoKokino = new JPanel();
    private JPanel aristeraKokino = new JPanel();
    private JPanel deksiaKokino = new JPanel();
    private JPanel panoKitrino = new JPanel();
    private JPanel katoKitrino = new JPanel();
    private JPanel aristeraKitrino = new JPanel();
    private JPanel deksiaKitrino = new JPanel();
    private JPanel panoBle = new JPanel();
    private JPanel katoBle = new JPanel();
    private JPanel aristeraBle = new JPanel();
    private JPanel deksiaBle = new JPanel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Kentriko;
    private javax.swing.JLayeredPane KentrikoLayers;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
