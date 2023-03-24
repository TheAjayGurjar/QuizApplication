import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Rules extends JFrame implements ActionListener{

    JButton back;

    Rules(){
        getContentPane().setBackground(Color.lightGray);

        // Adding heading
        JLabel heading = new JLabel("RULES FOR THE QUIZ ARE :");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Arial Black", Font.ITALIC, 30));
        heading.setForeground(new Color(0, 102, 102) );
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(50, 90, 700, 350);
        rules.setFont(new Font("Arial Regular", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(50, 500, 120, 40);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setLayout(null);
        setVisible(true);
        setSize(800, 650);
        setLocation(350, 100);
    }

    // public static void main(String[] args) {
    //     new Rules();
    // }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==back){
        setVisible(false);
        new Login();
      }
    }
}
