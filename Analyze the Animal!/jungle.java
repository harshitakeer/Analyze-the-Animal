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

public class jungle extends main{
  JFrame jungleFrame = new JFrame();

  public jungle(){
    
    jungleFrame.setSize(1000, 1000);
    jungleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jungleFrame.setLayout(new BorderLayout());

    ImageIcon cheetahIcon = new ImageIcon("cheetah.png");
    ImageIcon jungleIcon = new ImageIcon("jungle.png");
    Image cheetah2 = cheetahIcon.getImage();
    Image cheetah1 = cheetah2.getScaledInstance(60, 60, Image.SCALE_DEFAULT);
    ImageIcon cheetah = new ImageIcon(cheetah1);
    
    JLabel jungleLabel = new JLabel(jungleIcon);
    jungleLabel.setLayout(null);
    JLabel cheetahLabel = new JLabel(cheetah);
    cheetahLabel.setLocation(200,300);
    cheetahLabel.setBounds(100, 200, 70, 70);


    JLabel findCheetahTitle = new JLabel("Find the Cheetah!", SwingConstants.CENTER);
    findCheetahTitle.setPreferredSize(new Dimension(1000, 30));
    findCheetahTitle.setBounds(0, 10, 1000, 90);  
    findCheetahTitle.setFont(new Font("Serif", Font.BOLD, 18));
    findCheetahTitle.setForeground(new Color(0xFFFFFF));
    findCheetahTitle.setBackground(new Color(0xBE3749));
    findCheetahTitle.setOpaque(true);
    Border cheetahBorder = BorderFactory.createLineBorder(new Color(0x659948), 3);  
    findCheetahTitle.setBorder(cheetahBorder);
    jungleFrame.add(findCheetahTitle, BorderLayout.NORTH);
    findCheetahTitle.setVisible(true);


    
    cheetahLabel.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        cheetahInfo();
      }
    });

    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setPreferredSize(new Dimension(500, 500));

    jungleLabel.setBounds(0, 0, jungleIcon.getIconWidth(), jungleIcon.getIconHeight());
    cheetahLabel.setBounds(100, 150, cheetahIcon.getIconWidth(), cheetahIcon.getIconHeight());
    
        layeredPane.add(jungleLabel, Integer.valueOf(0));  
    layeredPane.add(cheetahLabel, Integer.valueOf(1)); 
  
    jungleFrame.add(layeredPane, BorderLayout.CENTER);
    jungleFrame.setVisible(true); 
  }

  public void cheetahInfo() {
    JPanel jungleinfoPanel = new JPanel();
    jungleinfoPanel.setPreferredSize(new Dimension(jungleFrame.getWidth(), jungleFrame.getHeight()));
    jungleinfoPanel.setBackground(Color.decode("#173D00"));
    jungleinfoPanel.setLayout(null); 

  
    ImageIcon infojungleIcon = new ImageIcon("cheetah.png"); 
    ImageIcon infojungleIcon1 = new ImageIcon("realcheetah.png");
    ImageIcon infojungleIcon2 = new ImageIcon("realcheetah1.jpeg");
    ImageIcon infojungleIcon3 = new ImageIcon("realcheetah2.png");

    Image realcheetah1 = infojungleIcon1.getImage();
    Image realcheetah11 = realcheetah1.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon therealcheetah1 = new ImageIcon (realcheetah11);

    Image realcheetah2 = infojungleIcon2.getImage();
    Image realcheetah22 = realcheetah2.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon therealcheetah2 = new ImageIcon (realcheetah22);

    Image realcheetah3 = infojungleIcon3.getImage();
    Image realcheetah33 = realcheetah3.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon therealcheetah3 = new ImageIcon (realcheetah33);

    Image clipartcheetah = infojungleIcon.getImage();
    Image clipartcheetah1 = clipartcheetah.getScaledInstance(70, 70, Image.SCALE_DEFAULT);
    ImageIcon theclipartcheetah = new ImageIcon (clipartcheetah1);

  
    
    JLabel iconcheetahLabel = new JLabel(theclipartcheetah);
    iconcheetahLabel.setBounds(20, 80, 70, 50);
    
    JLabel realcheetah1Label = new JLabel(therealcheetah1);
    realcheetah1Label.setBounds(370, 375, 200, 200);
    
    JLabel realcheetah2Label = new JLabel(therealcheetah2);
    realcheetah2Label.setBounds(100, 375, 200, 200);

    JLabel realcheetah3Label = new JLabel(therealcheetah3);
    realcheetah3Label.setBounds(650, 375, 200, 200);

    jungleinfoPanel.add(iconcheetahLabel);
    jungleinfoPanel.add(realcheetah1Label);
    jungleinfoPanel.add(realcheetah2Label);
    jungleinfoPanel.add(realcheetah3Label);

    JLabel congratsLabel = new JLabel("<html><div style='background-color:0xBE3749; color:white; text-align:center; padding:10px;'>Congrats, you passed level two!</div></html>");
    congratsLabel.setFont(new Font("Serif", Font.BOLD, 20)); 
    congratsLabel.setForeground(Color.WHITE);
    congratsLabel.setOpaque(true);
    congratsLabel.setBackground(new Color(0xbe945b)); 
    Border congratsBorder = BorderFactory.createLineBorder(new Color(0xFFFFFF), 2, true); 
    congratsLabel.setBorder(congratsBorder);
    congratsLabel.setBounds(jungleFrame.getWidth() - 400, 10, 390, 50); 
    jungleinfoPanel.add(congratsLabel);
    jungleinfoPanel.setBorder(congratsBorder); 
    
   

    JButton continueNext = new JButton("Continue?");
    continueNext.setBounds(100, 600, 100, 30); 
    jungleinfoPanel.add(continueNext);


    continueNext.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        antartica a = new antartica();
      }
    });

    JEditorPane cheetahInfoPane = new JEditorPane();
    cheetahInfoPane.setContentType("text/html"); 
    cheetahInfoPane.setEditable(false);  
    cheetahInfoPane.setText("<html>" +
        "<div style='width: 450px; font-family: Serif; color: white;'>" +
        "<p>You found it! The Cheetah is the fastest mammal on land and can even reach speeds of 70 miles an hour! Read on to learn more about Cheetahs and ways to save this endangered animal!</p>" +
        "<ul style='list-style-type: circle;'>" +
        "<li>Cheetahs can't roar, so they more commonly chirp and meow.</li>" +
        "<li>Cheetahs are carnivorous and usually hunt either early in the morning or late afternoon.</li>" +
        "<li>Cheetahs are the single surviving species of Acinonyx, which is a genus.</li>" +
        "<li>The Cheetah's conservation status is 'Vulnerable'. See links below for ways to help save the Cheetahs.</li>" +
        "</ul>" +
        "<p><strong>Support Cheetah Conservation:</strong></p>" +
        "<ul style='list-style-type: square;'>" +
        "<li><a href='https://gifts.worldwildlife.org/gift-center/gifts/Species-Adoptions/Cheetah?sc=AWY1800OQ18352A01716RX&gad_source=1&gclid=Cj0KCQjw0ruyBhDuARIsANSZ3wpxpyFr_F9QS7SI7V4BxC1IFObXPwsLmRBKtNwsBTTqu8yqcNA8aBgaAqbaEALw_wcB' style='color: #be945b;'>Adopt a Cheetah - WWF</a></li>" +
        "<li><a href='https://cheetah.org/get-involved/ways-to-give/#:~:text=By%20donating%20to%20CCF%20you,conservation%20efforts%20with%20a%20bequest.' style='color: #be945b;'>Donate to CCF</a></li>" +
        "</ul>" +
        "</div>" +
        "</html>");
    cheetahInfoPane.addHyperlinkListener(e -> {
        if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            try {
                Desktop.getDesktop().browse(e.getURL().toURI());  
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
    });


    cheetahInfoPane.setBackground(jungleinfoPanel.getBackground());
    cheetahInfoPane.setBounds(100, 70, 600, 300);  
    jungleinfoPanel.add(cheetahInfoPane);


    jungleFrame.getContentPane().removeAll();  
    jungleFrame.add(jungleinfoPanel, BorderLayout.CENTER);
    jungleFrame.revalidate(); 
    jungleFrame.repaint();    
  }






  


}
