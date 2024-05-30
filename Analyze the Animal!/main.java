import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.BorderFactory;


public class main {
    public static void main(String[] args) {
        JFrame introPage = new JFrame();
        introPage.setSize(1000, 1000);
        introPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        introPage.setLayout(new BorderLayout());

        JPanel intro = new JPanel();
        intro.setPreferredSize(new Dimension(introPage.getWidth(), introPage.getHeight()));
        intro.setBackground(Color.decode("#013d01"));
        intro.setLayout(null);  
        introPage.add(intro, BorderLayout.CENTER);

        ImageIcon homebackgroundIcon = new ImageIcon("homebackground.png");
        JLabel homebackgroundLabel = new JLabel(homebackgroundIcon);
        homebackgroundLabel.setBounds(0, 0, homebackgroundIcon.getIconWidth(), homebackgroundIcon.getIconHeight());
        intro.add(homebackgroundLabel);

        JLabel welcomeText = new JLabel(
            "<html>" +
            "<div style='padding: 20px; text-align: center; background-color: #013d01; color: #E4F9F5; border-radius: 30px;'>" +
            "<strong>Welcome to 'Analyze the Animal!'</strong><br>" +
            "<small style='font-size: 12px;'>(This game takes after 'Where's Waldo?')</small><br><br>" +
            "<ul style='text-align: left; list-style-type: disc; margin-left: 30px;'>" +  
            "<li>In this game, find the specified endangered animal among the background.</li>" +
            "<li>Once you click on the correct animal, you will see a screen with information about the endangered animal and ways to help.</li>" +
            "</ul>" +
            "<div style='text-align: left; margin-left: 30px;'>There are 5 levels, Good Luck!</div>" +
            "</div>" +
            "</html>"
        );
        
        welcomeText.setForeground(new Color(0x615538));
        welcomeText.setFont(new Font("Rockwell", Font.PLAIN, 18));
        welcomeText.setBounds(50, 270, 900, 200); 
        Border welcomeBorder = BorderFactory.createLineBorder(Color.WHITE, 3, true);
        welcomeText.setBorder(welcomeBorder);
        intro.add(welcomeText);

        JButton startButton = new JButton("Start Finding!");
        startButton.setFont(new Font("Rockwell", Font.PLAIN, 30));
        startButton.setBounds(200, 600, 500, 80);
        startButton.setOpaque(true);
        startButton.setContentAreaFilled(true);
        startButton.setBorderPainted(false);
        startButton.setBackground(Color.decode("#013d01"));
        startButton.setForeground(Color.WHITE);
        startButton.setBorderPainted(true);
        Border lineBorder = BorderFactory.createLineBorder(Color.WHITE, 3);
        startButton.setBorder(lineBorder);
        intro.add(startButton);

        intro.setComponentZOrder(homebackgroundLabel, intro.getComponentCount() - 1); 
        intro.setComponentZOrder(welcomeText, 0); 
        intro.setComponentZOrder(startButton, 0); 

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                safari s = new safari();
            }
        });

        introPage.setVisible(true);  
    }
}



     // safari - jungle - antartcica - rainforrest - ocean