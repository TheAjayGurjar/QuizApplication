import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener {
 
    Score(String name, int score) {
        setBounds(400, 150, 600, 250);
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Thankyou " + name + " for playing :");
        heading.setBounds(325, 30, 250, 30);
        heading.setFont(new Font("Arial Black", Font.ITALIC, 15));
        heading.setForeground(new Color(0, 102, 102) );
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 90, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.ITALIC, 26));
        lblscore.setForeground(new Color(255, 255, 0) );
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(380, 150, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        // new Score("User", 0);
        System.out.println("Hope you enjoyed the quiz.");
        System.out.println("Made with love by The Ajay Gurjar.");
    }

}
