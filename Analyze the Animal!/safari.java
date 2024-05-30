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

public class safari extends main{
  JFrame safariFrame = new JFrame();
  public safari(){
    
    safariFrame.setSize(1000, 1000);
    safariFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    safariFrame.setLayout(new BorderLayout());

    ImageIcon elephantIcon = new ImageIcon("elephant.png");
    ImageIcon safariIcon = new ImageIcon("safari.png");
    Image elephant2 = elephantIcon.getImage();
    Image elephant1 = elephant2.getScaledInstance(40, 40, Image.SCALE_DEFAULT);
    ImageIcon elephant = new ImageIcon(elephant1);
    

    JLabel safariLabel = new JLabel(safariIcon);
    safariLabel.setLayout(null);
    JLabel elephantLabel = new JLabel(elephant);
    elephantLabel.setLocation(200,300);
    elephantLabel.setBounds(100, 200, 70, 70);

    JLabel findelephantTitle = new JLabel("Find the Elephant!", SwingConstants.CENTER);
    findelephantTitle.setPreferredSize(new Dimension(1000, 30));
    findelephantTitle.setBounds(0, 10, 1000, 90);  
    findelephantTitle.setFont(new Font("Serif", Font.BOLD, 18));
    findelephantTitle.setForeground(new Color(0xFFFFFF));
    findelephantTitle.setBackground(new Color(0xCE8147));
    findelephantTitle.setOpaque(true);
    Border elephantBorder = BorderFactory.createLineBorder(new Color(0x568731), 3);  
    findelephantTitle.setBorder(elephantBorder);
    safariFrame.add(findelephantTitle, BorderLayout.NORTH);
    findelephantTitle.setVisible(true);
    
    
    elephantLabel.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        elephantInfo();
      }
    });

    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setPreferredSize(new Dimension(500, 500));

    safariLabel.setBounds(0, 0, safariIcon.getIconWidth(), safariIcon.getIconHeight());
    elephantLabel.setBounds(650, 5, elephantIcon.getIconWidth(), elephantIcon.getIconHeight());
    
    
    layeredPane.add(safariLabel, Integer.valueOf(0));  
    layeredPane.add(elephantLabel, Integer.valueOf(1)); 
  
    safariFrame.add(layeredPane, BorderLayout.CENTER);
    safariFrame.setVisible(true);

    
  }

  public void elephantInfo() {
    JPanel safariinfoPanel = new JPanel();
    safariinfoPanel.setPreferredSize(new Dimension(safariFrame.getWidth(), safariFrame.getHeight()));
    safariinfoPanel.setBackground(Color.decode("#CE8147"));
    safariinfoPanel.setLayout(null); 

  
    ImageIcon infosafariIcon = new ImageIcon("elephant.png"); 
    ImageIcon infosafariIcon1 = new ImageIcon("realelephant.png");
    ImageIcon infosafariIcon2 = new ImageIcon("realelephant1.png");
    ImageIcon infosafariIcon3 = new ImageIcon("realelephant2.png");

    Image realelephant1 = infosafariIcon1.getImage();
    Image realelephant11 = realelephant1.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon therealelephant1 = new ImageIcon (realelephant11);

    Image realelephant2 = infosafariIcon2.getImage();
    Image realelephant22 = realelephant2.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon therealelephant2 = new ImageIcon (realelephant22);

    Image realelephant3 = infosafariIcon3.getImage();
    Image realelephant33 = realelephant3.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon therealelephant3 = new ImageIcon (realelephant33);

    Image clipartelephant = infosafariIcon.getImage();
    Image clipartelephant1 = clipartelephant.getScaledInstance(70, 70, Image.SCALE_DEFAULT);
    ImageIcon theclipartelephant = new ImageIcon (clipartelephant1);

  
    
    JLabel iconelephantLabel = new JLabel(theclipartelephant);
    iconelephantLabel.setBounds(20, 80, 70, 50);
    
    JLabel realelephant1Label = new JLabel(therealelephant1);
    realelephant1Label.setBounds(370, 375, 200, 200);
    
    JLabel realelephant2Label = new JLabel(therealelephant2);
    realelephant2Label.setBounds(100, 375, 200, 200);

    JLabel realelephant3Label = new JLabel(therealelephant3);
    realelephant3Label.setBounds(650, 375, 200, 200);

    safariinfoPanel.add(iconelephantLabel);
    safariinfoPanel.add(realelephant1Label);
    safariinfoPanel.add(realelephant2Label);
    safariinfoPanel.add(realelephant3Label);

    JLabel congratsLabel = new JLabel("<html><div style='background-color:0x9DB26C; color:white; text-align:center; padding:10px;'>Congrats, you passed level one!</div></html>");
    congratsLabel.setFont(new Font("Serif", Font.BOLD, 20)); 
    congratsLabel.setForeground(Color.WHITE);
    congratsLabel.setOpaque(true);
    congratsLabel.setBackground(new Color(0x9DB26C)); 
    Border congratsBorder = BorderFactory.createLineBorder(new Color(0xFFFFFF), 2, true);
    congratsLabel.setBorder(congratsBorder);
    congratsLabel.setBounds(safariFrame.getWidth() - 400, 10, 390, 50); 
    safariinfoPanel.add(congratsLabel);
    safariinfoPanel.setBorder(congratsBorder); 
    
   

    JButton continueNext = new JButton("Continue?");
    continueNext.setBounds(100, 600, 100, 30); 
    safariinfoPanel.add(continueNext);


    continueNext.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        jungle j = new jungle();
      }
    });

    JEditorPane elephantInfoPane = new JEditorPane();
    elephantInfoPane.setContentType("text/html");  
    elephantInfoPane.setEditable(false);  
    elephantInfoPane.setText("<html>" +
        "<div style='width: 450px; font-family: Serif; color: white;'>" +
        "<p>You found it! The Elephant is the world's largest land animal! Read on to learn more about Elephants and ways to save this endangered animal!</p>" +
        "<ul style='list-style-type: circle;'>" +
        "<li>Scientists are able to tell Elephant species apart by just their ears.</li>" +
        "<li>Elephants communicate with each other through vibrations.</li>" +
        "<li>Elephants are endangered due to poaching for the illegal ivory trade.</li>" +
        "<li>The Cheetah's conservation status is 'Endangered'. See links below for ways to help save the Elephants.</li>" +
        "</ul>" +
        "<p><strong>Support Elephant Conservation:</strong></p>" +
        "<ul style='list-style-type: square;'>" +
        "<li><a href='https://gifts.worldwildlife.org/gift-center/gifts/Species-Adoptions/African-Elephant' style='color: #568731;'>Adopt an Elephant - WWF</a></li>" +
        "<li><a href='https://www.savetheelephants.org/donate-page-us/' style='color: #568731;'>Donate to an Elephant Charity</a></li>" +
        "</ul>" +
        "</div>" +
        "</html>");
        elephantInfoPane.addHyperlinkListener(e -> {
        if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            try {
                Desktop.getDesktop().browse(e.getURL().toURI());  
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
    });


    elephantInfoPane.setBackground(safariinfoPanel.getBackground());
    elephantInfoPane.setBounds(100, 70, 600, 300);  
    safariinfoPanel.add(elephantInfoPane);


    safariFrame.getContentPane().removeAll();  
    safariFrame.add(safariinfoPanel, BorderLayout.CENTER);
    safariFrame.revalidate(); 
    safariFrame.repaint();   
  }

  


}