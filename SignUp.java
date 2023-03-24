import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SignUp extends JFrame implements ActionListener{

    JButton submit,back;
    // private ArrayList<String> usernames = new ArrayList<>();
    // private ArrayList<String> userpasswords = new ArrayList<>;
    static String userName, userPassword;
    JTextField tfname,tfpassword;

    // public String getusername(){
    //     return userName;
    // }
    // public String getUserpassword(){
    //     return userPassword;
    // }

    SignUp() {

        setBounds(400, 150, 600, 250);
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);

        JLabel heading = new JLabel("ENTER YOUR DETAILS :");
        heading.setBounds(20, 10, 250, 30);
        heading.setFont(new Font("Arial Black", Font.ITALIC, 15));
        heading.setForeground(new Color(0, 102, 102) );
        add(heading);

        // Adding USERname
        JLabel name = new JLabel("Enter Your UserName :");
        name.setBounds(20, 50, 300, 20);
        name.setFont(new Font("Arial Black", Font.ITALIC, 10));
        name.setForeground(new Color(30, 144, 254) );
        add(name);

        tfname = new JTextField();
        tfname.setBounds(20, 80, 300, 20);
        tfname.setFont(new Font("Arial Black", Font.BOLD, 8));
        add(tfname);

        // Adding USERpassword
        JLabel password = new JLabel("Enter Your Password :");
        password.setBounds(20, 110, 300, 20);
        password.setFont(new Font("Arial Black", Font.ITALIC, 10));
        password.setForeground(new Color(30, 144, 254) );
        add(password);

        tfpassword = new JTextField();
        tfpassword.setBounds(20, 140, 300, 20);
        tfpassword.setFont(new Font("Arial Black", Font.BOLD, 8));
        add(tfpassword);

        // Adding submit Button
        submit = new JButton("SignUp");
        submit.setBounds(20,170,100,25);
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        // Adding back Button
        back = new JButton("Back");
        back.setBounds(160,170,100,25);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }
    public static void main(String[] args) {
        //new SignUp();
        
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){
            
            userName = tfname.getText();
            userPassword = tfpassword.getText();
            
        } else if (e.getSource()==back) {
            setVisible(false);
            new Login();
            System.out.println(userName);
        }

    }

    
}
