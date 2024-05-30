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

public class ocean extends main{
  JFrame oceanFrame = new JFrame();

  public ocean(){
    
    oceanFrame.setSize(1000, 1000);
    oceanFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    oceanFrame.setLayout(new BorderLayout());

    ImageIcon hammerheadsharkIcon = new ImageIcon("hammerheadshark.png");
    ImageIcon oceanIcon = new ImageIcon("ocean.png");
    Image hammerheadshark2 = hammerheadsharkIcon.getImage();
    Image hammerheadshark1 = hammerheadshark2.getScaledInstance(70, 70, Image.SCALE_DEFAULT);
    ImageIcon hammerheadshark = new ImageIcon(hammerheadshark1);
    
    JLabel oceanLabel = new JLabel(oceanIcon);
    oceanLabel.setLayout(null);
    JLabel hammerheadsharkLabel = new JLabel(hammerheadshark);
    hammerheadsharkLabel.setLocation(200,300);
    hammerheadsharkLabel.setBounds(100, 200, 70, 70);


    JLabel findhammerheadsharkTitle = new JLabel("Find the Hammerhead Shark!", SwingConstants.CENTER);
    findhammerheadsharkTitle.setPreferredSize(new Dimension(1000, 30));
    findhammerheadsharkTitle.setBounds(0, 10, 1000, 90);  
    findhammerheadsharkTitle.setFont(new Font("Serif", Font.BOLD, 18));
    findhammerheadsharkTitle.setForeground(new Color(0xFFFFFF));
    findhammerheadsharkTitle.setBackground(new Color(0xE95D80));
    findhammerheadsharkTitle.setOpaque(true);
    Border hammerheadsharkBorder = BorderFactory.createLineBorder(new Color(0x208AAE), 3);  
    findhammerheadsharkTitle.setBorder(hammerheadsharkBorder);
    oceanFrame.add(findhammerheadsharkTitle, BorderLayout.NORTH);
    findhammerheadsharkTitle.setVisible(true);


    
    hammerheadsharkLabel.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        hammerheadsharkInfo();
      }
    });

    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setPreferredSize(new Dimension(500, 500));

    oceanLabel.setBounds(0, 0, oceanIcon.getIconWidth(), oceanIcon.getIconHeight());
    hammerheadsharkLabel.setBounds(240, 100, hammerheadsharkIcon.getIconWidth(), hammerheadsharkIcon.getIconHeight());
    
    layeredPane.add(oceanLabel, Integer.valueOf(0));  
    layeredPane.add(hammerheadsharkLabel, Integer.valueOf(1)); 
  
    oceanFrame.add(layeredPane, BorderLayout.CENTER);
    oceanFrame.setVisible(true); 
  }

  public void hammerheadsharkInfo() {
    JPanel oceaninfoPanel = new JPanel();
    oceaninfoPanel.setPreferredSize(new Dimension(oceanFrame.getWidth(), oceanFrame.getHeight()));
    oceaninfoPanel.setBackground(Color.decode("#208AAE"));
    oceaninfoPanel.setLayout(null); 

  
    ImageIcon infooceanIcon = new ImageIcon("hammerheadshark.png");
    ImageIcon infooceanIcon1 = new ImageIcon("realhammerheadshark.png");
    ImageIcon infooceanIcon2 = new ImageIcon("realhammerheadshark1.png");
    ImageIcon infooceanIcon3 = new ImageIcon("realhammerheadshark2.png");

    Image realhammerheadshark1 = infooceanIcon1.getImage();
    Image realhammerheadshark11 = realhammerheadshark1.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon therealhammerheadshark1 = new ImageIcon (realhammerheadshark11);

    Image realhammerheadshark2 = infooceanIcon2.getImage();
    Image realhammerheadshark22 = realhammerheadshark2.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon therealhammerheadshark2 = new ImageIcon (realhammerheadshark22);

    Image realhammerheadshark3 = infooceanIcon3.getImage();
    Image realhammerheadshark33 = realhammerheadshark3.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon therealhammerheadshark3 = new ImageIcon (realhammerheadshark33);

    Image cliparthammerheadshark = infooceanIcon.getImage();
    Image cliparthammerheadshark1 = cliparthammerheadshark.getScaledInstance(70, 70, Image.SCALE_DEFAULT);
    ImageIcon thecliparthammerheadshark = new ImageIcon (cliparthammerheadshark1);

  
    
    JLabel iconhammerheadsharkLabel = new JLabel(thecliparthammerheadshark);
    iconhammerheadsharkLabel.setBounds(20, 80, 70, 50);
    
    JLabel realhammerheadshark1Label = new JLabel(therealhammerheadshark1);
    realhammerheadshark1Label.setBounds(370, 375, 200, 200);
    
    JLabel realhammerheadshark2Label = new JLabel(therealhammerheadshark2);
    realhammerheadshark2Label.setBounds(100, 375, 200, 200);

    JLabel realhammerheadshark3Label = new JLabel(therealhammerheadshark3);
    realhammerheadshark3Label.setBounds(650, 375, 200, 200);

    oceaninfoPanel.add(iconhammerheadsharkLabel);
    oceaninfoPanel.add(realhammerheadshark1Label);
    oceaninfoPanel.add(realhammerheadshark2Label);
    oceaninfoPanel.add(realhammerheadshark3Label);

    JLabel congratsLabel = new JLabel("<html><div style='background-color:0xE95D80; color:white; text-align:center; padding:10px;'>Congrats, you passed level five!</div></html>");
    congratsLabel.setFont(new Font("Serif", Font.BOLD, 20)); 
    congratsLabel.setForeground(Color.WHITE);
    congratsLabel.setOpaque(true);
    congratsLabel.setBackground(new Color(0xE95D80)); 
    Border congratsBorder = BorderFactory.createLineBorder(new Color(0xFFFFFF), 2, true); 
    congratsLabel.setBorder(congratsBorder);
    congratsLabel.setBounds(oceanFrame.getWidth() - 400, 10, 390, 50); 
    oceaninfoPanel.add(congratsLabel);
    oceaninfoPanel.setBorder(congratsBorder); 
    
   

    JButton continueNext = new JButton("Continue?");
    continueNext.setBounds(100, 600, 100, 30); 
    oceaninfoPanel.add(continueNext);


    continueNext.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        lastpage lp = new lastpage();
      }
    });

    JEditorPane hammerheadsharkInfoPane = new JEditorPane();
    hammerheadsharkInfoPane.setContentType("text/html");  
    hammerheadsharkInfoPane.setEditable(false);  
    hammerheadsharkInfoPane.setText("<html>" +
        "<div style='width: 450px; font-family: Serif; color: white;'>" +
        "<p>You found it! Hammerhead Sharks are among the most recognizable species and ocean creatures! Read on to learn more about Hammerhead Sharks and ways to save this endangered animal!</p>" +
        "<ul style='list-style-type: circle;'>" +
        "<li>Hammerhead Sharks can use their heads to aid in hunting.</li>" +
        "<li>Hammerhead Sharks have eyes that allow 360° of vision, but they can't see in front of them.</li>" +
        "<li>Hammerhead Sharks are endangered due to commericial fishing, for the shark fin trade.</li>" +
        "<li>The Hammerhead Shark's conservation status is 'Critically Endangered'. See links below for ways to help save the Hammerhead Sharks.</li>" +
        "</ul>" +
        "<p><strong>Support Hammerhead Shark Conservation:</strong></p>" +
        "<ul style='list-style-type: square;'>" +
        "<li><a href='https://gifts.worldwildlife.org/gift-center/gifts/Species-Adoptions/Hammerhead-Shark.aspx' style='color: #E95D80;'>Adopt a Hammerhead Shark - WWF</a></li>" +
        "<li><a href='https://friendofthesea.org/marine-conservation-projects-and-awareness/save-the-sharks/#:~:text=As%20overfishing%20is%20the%20primary,further%20decline%20of%20shark%20populations.' style='color: #E95D80;'>Hammerhead Shark Campaign</a></li>" +
        "</ul>" +
        "</div>" +
        "</html>");
        hammerheadsharkInfoPane.addHyperlinkListener(e -> {
        if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            try {
                Desktop.getDesktop().browse(e.getURL().toURI());  
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
    });


    hammerheadsharkInfoPane.setBackground(oceaninfoPanel.getBackground());
    hammerheadsharkInfoPane.setBounds(100, 70, 600, 300);  
    oceaninfoPanel.add(hammerheadsharkInfoPane);

    oceanFrame.getContentPane().removeAll();  
    oceanFrame.add(oceaninfoPanel, BorderLayout.CENTER);
    oceanFrame.revalidate(); 
    oceanFrame.repaint();   
  }






  


}
