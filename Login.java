import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// using frame class by inheritence to create a frame
public class Login extends JFrame  implements ActionListener {

    JButton submit, rules, quit, signin;
    String userName, userPassword;
    JTextField tfname,tfpassword;
    
    

    // constructor for editting frame
    Login(){

        // selecting whole frame as container and giving it color
        getContentPane().setBackground(Color.lightGray);

        //making default layout null
        setLayout(null);

        // getting image on the frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quizIcon.jpg"));
        JLabel image = new JLabel(i1);
        add(image);

        // place image in right layout
        image.setBounds(0, 0, 600, 500);

        // Adding heading
        JLabel heading = new JLabel("SIMPLE JAVA QUIZ");
        heading.setBounds(650, 40, 500, 45);
        heading.setFont(new Font("Arial Black", Font.ITALIC, 45));
        heading.setForeground(new Color(0, 102, 102) );
        add(heading);

        // Adding USERname
        JLabel name = new JLabel("Enter Your UserName :");
        name.setBounds(650, 150, 300, 20);
        name.setFont(new Font("Arial Black", Font.ITALIC, 15));
        name.setForeground(new Color(30, 144, 254) );
        add(name);

        tfname = new JTextField();
        tfname.setBounds(650, 175, 300, 20);
        tfname.setFont(new Font("Arial Black", Font.BOLD, 10));
        add(tfname);
        userName = tfname.getText();

        // Adding USERpassword
        JLabel password = new JLabel("Enter Your Password :");
        password.setBounds(650, 200, 300, 20);
        password.setFont(new Font("Arial Black", Font.ITALIC, 15));
        password.setForeground(new Color(30, 144, 254) );
        add(password);

        tfpassword = new JTextField();
        tfpassword.setBounds(650, 225, 300, 20);
        tfpassword.setFont(new Font("Arial Black", Font.BOLD, 10));
        add(tfpassword);
        

        // Adding submit Button
        submit = new JButton("LogIn");
        submit.setBounds(650,250,120,25);
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        // Adding rules Button
        rules = new JButton("Rules");
        rules.setBounds(830,250,120,25);
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        // Adding quit Button
        quit = new JButton("Quit");
        quit.setBounds(650,280,120,25);
        quit.setBackground(Color.RED);
        quit.setForeground(Color.WHITE);
        quit.addActionListener(this);
        add(quit);

        // Adding rules Button
        signin = new JButton("SignUp");
        signin.setBounds(830,280,120,25);
        signin.setBackground(Color.red);
        signin.setForeground(Color.WHITE);
        signin.addActionListener(this);
        add(signin);


        // makes frame visile
        setVisible(true);

        // gives size to frame
        setSize(1200, 500);

        // positions relative to origin i.e leftmost corner
        setLocation(200, 200);

    }
    public static void main(String[] args) {
       new Login();
    }
    
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()==quit) {
            setVisible(false);
       } else if (e.getSource()==rules) {
            setVisible(false);
            new Rules();
       } else if(e.getSource()==submit){
            userPassword = tfpassword.getText();
            userName = tfname.getText();
            
            Boolean a = checkUser(userName, userPassword);
            System.out.println(a);
            if(a){
                setVisible(false);
                new Quiz(userName);
            }else{
                new SignUp();
            }
            
            
       } else if(e.getSource()==signin){
        setVisible(false);
        new SignUp();
       }
    }

    public boolean checkUser(String userName, String userPassword){
        
        System.out.println(SignUp.userPassword);
        if((this.userName.equals(SignUp.userName) )&&(this.userPassword.equals(SignUp.userPassword))){
            
            return true;
        }
        return false;
    }


}