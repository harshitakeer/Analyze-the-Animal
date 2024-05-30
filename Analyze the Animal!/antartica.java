import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.io.IOException;
import java.net.URISyntaxException;

public class antartica extends main{
  JFrame antarticaFrame = new JFrame();
  public antartica(){
    
    antarticaFrame.setSize(1000, 1000);
    antarticaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    antarticaFrame.setLayout(new BorderLayout());

    ImageIcon polarbearIcon = new ImageIcon("polarbear.png");
    ImageIcon antarticaIcon = new ImageIcon("antartica.png");
    Image polarbear2 = polarbearIcon.getImage();
    Image polarbear1 = polarbear2.getScaledInstance(40, 40, Image.SCALE_DEFAULT);
    ImageIcon polarbear = new ImageIcon(polarbear1);
    

    JLabel antarticaLabel = new JLabel(antarticaIcon);
    antarticaLabel.setLayout(null);
    JLabel polarbearLabel = new JLabel(polarbear);
    polarbearLabel.setLocation(200,300);
    polarbearLabel.setBounds(100, 200, 70, 70);

    JLabel findpolarbearTitle = new JLabel("Find the Polar Bear!", SwingConstants.CENTER);
    findpolarbearTitle.setPreferredSize(new Dimension(1000, 30));
    findpolarbearTitle.setBounds(0, 10, 1000, 90); 
    findpolarbearTitle.setFont(new Font("Serif", Font.BOLD, 18));
    findpolarbearTitle.setForeground(new Color(0xFFFFFF));
    findpolarbearTitle.setBackground(new Color(0x10527E));
    findpolarbearTitle.setOpaque(true);
    Border polarbearBorder = BorderFactory.createLineBorder(new Color(0x76AABC), 3);  
    findpolarbearTitle.setBorder(polarbearBorder);
    antarticaFrame.add(findpolarbearTitle, BorderLayout.NORTH);
    findpolarbearTitle.setVisible(true);
    
    
    polarbearLabel.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        polarbearInfo();
      }
    });


    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setPreferredSize(new Dimension(500, 500));

    antarticaLabel.setBounds(0, 0, antarticaIcon.getIconWidth(), antarticaIcon.getIconHeight());
    polarbearLabel.setBounds(-280, -150, polarbearIcon.getIconWidth(), polarbearIcon.getIconHeight());
    
    
    layeredPane.add(antarticaLabel, Integer.valueOf(0));  
    layeredPane.add(polarbearLabel, Integer.valueOf(1)); 
  
    antarticaFrame.add(layeredPane, BorderLayout.CENTER);
    antarticaFrame.setVisible(true);

    
  }

  public void polarbearInfo() {
    JPanel antarticainfoPanel = new JPanel();
    antarticainfoPanel.setPreferredSize(new Dimension(antarticaFrame.getWidth(), antarticaFrame.getHeight()));
    antarticainfoPanel.setBackground(Color.decode("#76AABC"));
    antarticainfoPanel.setLayout(null); 

  
    ImageIcon infoantarticaIcon = new ImageIcon("polarbear.png"); 
    ImageIcon infoantarticaIcon1 = new ImageIcon("realpolarbear.png");
    ImageIcon infoantarticaIcon2 = new ImageIcon("realpolarbear1.png");
    ImageIcon infoantarticaIcon3 = new ImageIcon("realpolarbear2.png");

    Image realpolarbear1 = infoantarticaIcon1.getImage();
    Image realpolarbear11 = realpolarbear1.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon therealpolarbear1 = new ImageIcon (realpolarbear11);

    Image realpolarbear2 = infoantarticaIcon2.getImage();
    Image realpolarbear22 = realpolarbear2.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon therealpolarbear2 = new ImageIcon(realpolarbear22);

    Image realpolarbear3 = infoantarticaIcon3.getImage();
    Image realpolarbear33 = realpolarbear3.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon therealpolarbear3 = new ImageIcon (realpolarbear33);

    Image clipartpolarbear = infoantarticaIcon.getImage();
    Image clipartpolarbear1 = clipartpolarbear.getScaledInstance(70, 70, Image.SCALE_DEFAULT);
    ImageIcon theclipartpolarbear = new ImageIcon (clipartpolarbear1);

  
    
    JLabel iconpolarbearLabel = new JLabel(theclipartpolarbear);
    iconpolarbearLabel.setBounds(20, 80, 70, 50);
    
    JLabel realpolarbear1Label = new JLabel(therealpolarbear1);
    realpolarbear1Label.setBounds(370, 375, 200, 200);
    
    JLabel realpolarbear2Label = new JLabel(therealpolarbear2);
    realpolarbear2Label.setBounds(100, 375, 200, 200);

    JLabel realpolarbear3Label = new JLabel(therealpolarbear3);
    realpolarbear3Label.setBounds(650, 375, 200, 200);

    antarticainfoPanel.add(iconpolarbearLabel);
    antarticainfoPanel.add(realpolarbear1Label);
    antarticainfoPanel.add(realpolarbear2Label);
    antarticainfoPanel.add(realpolarbear3Label);


    JLabel congratsLabel = new JLabel("<html><div style='background-color:0x10527E; color:white; text-align:center; padding:10px;'>Congrats, you passed level three!</div></html>");
    congratsLabel.setFont(new Font("Serif", Font.BOLD, 20)); 
    congratsLabel.setForeground(Color.WHITE);
    congratsLabel.setOpaque(true);
    congratsLabel.setBackground(new Color(0x10527E)); 
    Border congratsBorder = BorderFactory.createLineBorder(new Color(0xFFFFFF), 2, true); 
    congratsLabel.setBorder(congratsBorder);
    congratsLabel.setBounds(antarticaFrame.getWidth() - 400, 10, 390, 50); 
    antarticainfoPanel.add(congratsLabel);
    antarticainfoPanel.setBorder(congratsBorder); 
    
   

    JButton continueNext = new JButton("Continue?");
    continueNext.setBounds(100, 600, 100, 30); 
    antarticainfoPanel.add(continueNext);


    continueNext.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        rainforest r = new rainforest();
      }
    });

    JEditorPane polarbearInfoPane = new JEditorPane();
    polarbearInfoPane.setContentType("text/html");  
    polarbearInfoPane.setEditable(false);  
    polarbearInfoPane.setText("<html>" +
        "<div style='width: 450px; font-family: Serif; color: white;'>" +
        "<p>You found it! The Polar Bear is the beast of the Artic and they can smell their prey from a kilometer away! Read on to learn more about Polar Bears and ways to save this endangered animal!</p>" +
        "<ul style='list-style-type: circle;'>" +
        "<li>Polar Bears can swim constantly for days at a time.</li>" +
        "<li>Scientists are able to extract polar bear DNA from just their footprints.</li>" +
        "<li>Due to climate warning, Polar Bears face endangerment as their habitats melt.</li>" +
        "<li>The Polar Bear's conservation status is 'Vulnerable'. See links below for ways to help save the Polar Bears.</li>" +
        "</ul>" +
        "<p><strong>Support Polar Bear Conservation:</strong></p>" +
        "<ul style='list-style-type: square;'>" +
        "<li><a href='https://gifts.worldwildlife.org/gift-center/gifts/Species-Adoptions/Polar-Bear.aspx?sc=AWY1800OQ18317A01909RX' style='color: #10527E;'>Adopt a Polar Bear - WWF</a></li>" +
        "<li><a href='https://polarbearsinternational.org/act-now/take-action/' style='color: #10527E;'>Take Action for Polar Bears</a></li>" +
        "</ul>" +
        "</div>" +
        "</html>");
        polarbearInfoPane.addHyperlinkListener(e -> {
        if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            try {
                Desktop.getDesktop().browse(e.getURL().toURI());  
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
    });


    polarbearInfoPane.setBackground(antarticainfoPanel.getBackground());
    polarbearInfoPane.setBounds(100, 70, 600, 300);  
    antarticainfoPanel.add(polarbearInfoPane);


    antarticaFrame.getContentPane().removeAll(); 
    antarticaFrame.add(antarticainfoPanel, BorderLayout.CENTER);
    antarticaFrame.revalidate();
    antarticaFrame.repaint();   
  }

  


}