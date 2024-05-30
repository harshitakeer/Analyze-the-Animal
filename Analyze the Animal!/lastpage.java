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



public class lastpage extends main{
  JFrame lastpageFrame = new JFrame();

  public lastpage(){

    JFrame lastPage = new JFrame();
    lastPage.setSize(1000, 1000);
    lastPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    lastPage.setLayout(new BorderLayout());

    JPanel last = new JPanel();
    last.setPreferredSize(new Dimension(lastPage.getWidth(), lastPage.getHeight()));
    last.setBackground(Color.decode("#c95d9c"));
    last.setLayout(null); 
    lastPage.add(last, BorderLayout.CENTER);

    ImageIcon lastpagebackgroundIcon = new ImageIcon("lastpagebackground.png");
    JLabel lastpagebackgroundLabel = new JLabel(lastpagebackgroundIcon);
    lastpagebackgroundLabel.setBounds(0, 0, lastpagebackgroundIcon.getIconWidth(), lastpagebackgroundIcon.getIconHeight());
    last.add(lastpagebackgroundLabel);
    
    JLabel leavingText = new JLabel(
        "<html>" +
        "<div style='padding: 20px; text-align: center; background-color: #c95d9c; color: #E4F9F5; border-radius: 30px;'>" +
        "<strong>Congrats! You completed all five levels of 'Analyze the Animal!'</strong><br>" +
        "<ul style='text-align: left; list-style-type: disc; margin-left: 30px;'>" +  
        "<li>We hope you learned more about endangered animals and found ways to help.</li>" +
        "<li>We also hope you had fun playing this game!</li>" +
        "</ul>" +
        "<div style='text-align: left; margin-left: 30px;'>Would you like to go back...</div>" +
        "</div>" +
        "</html>"
    );
    
    leavingText.setForeground(new Color(0x615538));
    leavingText.setFont(new Font("Rockwell", Font.PLAIN, 18));
    leavingText.setBounds(120, 270, 700, 190);  
    Border welcomeBorder = BorderFactory.createLineBorder(Color.WHITE, 3, true);
    leavingText.setBorder(welcomeBorder);
    last.add(leavingText);

    JButton restartButton = new JButton("Restart?");
    restartButton.setFont(new Font("Rockwell", Font.PLAIN, 30));
    restartButton.setBounds(200, 600, 500, 80);
    restartButton.setOpaque(true);
    restartButton.setContentAreaFilled(true);
    restartButton.setBorderPainted(false);
    restartButton.setBackground(Color.decode("#c95d9c"));
    restartButton.setForeground(Color.WHITE);
    restartButton.setBorderPainted(true);
    Border lineBorder = BorderFactory.createLineBorder(Color.WHITE, 3);
    restartButton.setBorder(lineBorder);
    last.add(restartButton);

    last.setComponentZOrder(lastpagebackgroundLabel, last.getComponentCount() - 1); 
    last.setComponentZOrder(leavingText, 0); 
    last.setComponentZOrder(restartButton, 0); 

    restartButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            safari s = new safari();
        }
    });

    lastPage.setVisible(true);  
}
}







  


