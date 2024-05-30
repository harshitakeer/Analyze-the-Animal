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

public class rainforest extends main{
  JFrame rainforestFrame = new JFrame();

  public rainforest(){
    
    rainforestFrame.setSize(1000, 1000);
    rainforestFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    rainforestFrame.setLayout(new BorderLayout());

    ImageIcon slothIcon = new ImageIcon("sloth.png");
    ImageIcon rainforestIcon = new ImageIcon("rainforest.png");
    Image sloth2 = slothIcon.getImage();
    Image sloth1 = sloth2.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
    ImageIcon sloth = new ImageIcon(sloth1);
    
    JLabel rainforestLabel = new JLabel(rainforestIcon);
    rainforestLabel.setLayout(null);
    JLabel slothLabel = new JLabel(sloth);
    slothLabel.setLocation(200,300);
    slothLabel.setBounds(100, 200, 70, 70);


    JLabel findslothTitle = new JLabel("Find the Sloth!", SwingConstants.CENTER);
    findslothTitle.setPreferredSize(new Dimension(1000, 30));
    findslothTitle.setBounds(0, 10, 1000, 90);  
    findslothTitle.setFont(new Font("Serif", Font.BOLD, 18));
    findslothTitle.setForeground(new Color(0xFFFFFF));
    findslothTitle.setBackground(new Color(0x484538));
    findslothTitle.setOpaque(true);
    Border slothBorder = BorderFactory.createLineBorder(new Color(0x659948), 3);  
    findslothTitle.setBorder(slothBorder);
    rainforestFrame.add(findslothTitle, BorderLayout.NORTH);
    findslothTitle.setVisible(true);


    
    slothLabel.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        slothInfo();
      }
    });

    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setPreferredSize(new Dimension(500, 500));

    rainforestLabel.setBounds(0, 0, rainforestIcon.getIconWidth(), rainforestIcon.getIconHeight());
    slothLabel.setBounds(700, 400, slothIcon.getIconWidth(), slothIcon.getIconHeight());
    
    layeredPane.add(rainforestLabel, Integer.valueOf(0));  
    layeredPane.add(slothLabel, Integer.valueOf(1)); 
  
    rainforestFrame.add(layeredPane, BorderLayout.CENTER);
    rainforestFrame.setVisible(true); 
  }

  public void slothInfo() {
    JPanel rainforestinfoPanel = new JPanel();
    rainforestinfoPanel.setPreferredSize(new Dimension(rainforestFrame.getWidth(), rainforestFrame.getHeight()));
    rainforestinfoPanel.setBackground(Color.decode("#9BA06A"));
    rainforestinfoPanel.setLayout(null); 

  
    ImageIcon inforainforestIcon = new ImageIcon("sloth.png"); 
    ImageIcon inforainforestIcon1 = new ImageIcon("realsloth.png");
    ImageIcon inforainforestIcon2 = new ImageIcon("realsloth1.png");
    ImageIcon inforainforestIcon3 = new ImageIcon("realsloth2.png");

    Image realsloth1 = inforainforestIcon1.getImage();
    Image realsloth11 = realsloth1.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon therealsloth1 = new ImageIcon (realsloth11);

    Image realsloth2 = inforainforestIcon2.getImage();
    Image realsloth22 = realsloth2.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon therealsloth2 = new ImageIcon (realsloth22);

    Image realsloth3 = inforainforestIcon3.getImage();
    Image realsloth33 = realsloth3.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon therealsloth3 = new ImageIcon (realsloth33);

    Image clipartsloth = inforainforestIcon.getImage();
    Image clipartsloth1 = clipartsloth.getScaledInstance(70, 70, Image.SCALE_DEFAULT);
    ImageIcon theclipartsloth = new ImageIcon (clipartsloth1);

  
    
    JLabel iconslothLabel = new JLabel(theclipartsloth);
    iconslothLabel.setBounds(20, 80, 70, 50);
    
    JLabel realsloth1Label = new JLabel(therealsloth1);
    realsloth1Label.setBounds(370, 375, 200, 200);
    
    JLabel realsloth2Label = new JLabel(therealsloth2);
    realsloth2Label.setBounds(100, 375, 200, 200);

    JLabel realsloth3Label = new JLabel(therealsloth3);
    realsloth3Label.setBounds(650, 375, 200, 200);

    rainforestinfoPanel.add(iconslothLabel);
    rainforestinfoPanel.add(realsloth1Label);
    rainforestinfoPanel.add(realsloth2Label);
    rainforestinfoPanel.add(realsloth3Label);

    JLabel congratsLabel = new JLabel("<html><div style='background-color:0x484538; color:white; text-align:center; padding:10px;'>Congrats, you passed level four!</div></html>");
    congratsLabel.setFont(new Font("Serif", Font.BOLD, 20)); 
    congratsLabel.setForeground(Color.WHITE);
    congratsLabel.setOpaque(true);
    congratsLabel.setBackground(new Color(0x484538)); 
    Border congratsBorder = BorderFactory.createLineBorder(new Color(0xFFFFFF), 2, true); 
    congratsLabel.setBorder(congratsBorder);
    congratsLabel.setBounds(rainforestFrame.getWidth() - 400, 10, 390, 50); 
    rainforestinfoPanel.add(congratsLabel);
    rainforestinfoPanel.setBorder(congratsBorder);
    
   

    JButton continueNext = new JButton("Continue?");
    continueNext.setBounds(100, 600, 100, 30); 
    rainforestinfoPanel.add(continueNext);


    continueNext.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        ocean o = new ocean();
      }
    });

    JEditorPane slothInfoPane = new JEditorPane();
    slothInfoPane.setContentType("text/html");  
    slothInfoPane.setEditable(false);
    slothInfoPane.setText("<html>" +
        "<div style='width: 450px; font-family: Serif; color: white;'>" +
        "<p>You found it! For the Sloth, everything is slow and sluggish, including food digestion! Read on to learn more about Sloths and ways to save this endangered animal!</p>" +
        "<ul style='list-style-type: circle;'>" +
        "<li>Sloths are surprisingly really good at swimming.</li>" +
        "<li>Sloths are incredibly picky when it comes to pooping.</li>" +
        "<li>Sloths are endangered due to urbanization and deforestation.</li>" +
        "<li>The Sloth's conservation status is 'Vulnerable'. See links below for ways to help save the Sloths.</li>" +
        "</ul>" +
        "<p><strong>Support Sloth Conservation:</strong></p>" +
        "<ul style='list-style-type: square;'>" +
        "<li><a href='https://slothconservation.org/product-category/adopt-a-sloth/' style='color: #484538;'>Adopt a Sloth - TSCF</a></li>" +
        "<li><a href='https://happysloth.co' style='color: #484538;'>Buy Apparel & Save a Sloth</a></li>" +
        "</ul>" +
        "</div>" +
        "</html>");
        slothInfoPane.addHyperlinkListener(e -> {
        if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            try {
                Desktop.getDesktop().browse(e.getURL().toURI()); 
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
    });


    slothInfoPane.setBackground(rainforestinfoPanel.getBackground());
    slothInfoPane.setBounds(100, 70, 600, 300);  
    rainforestinfoPanel.add(slothInfoPane);


    rainforestFrame.getContentPane().removeAll();  
    rainforestFrame.add(rainforestinfoPanel, BorderLayout.CENTER);
    rainforestFrame.revalidate(); 
    rainforestFrame.repaint();   
  }






  


}