
package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Login extends JFrame implements ActionListener{
    JButton login,signup,forget;
    JTextField txt,txt1;
    Login(){

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/login1.jpg"));
        Image img2 =img1.getImage().getScaledInstance(1600, 1000, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,1600,1000);
        add(img);
        
        JLabel user = new JLabel("USERNAME  :- ");
        user.setBounds(500,200,300,30);
        user.setFont(new Font("ARIAL", Font.BOLD,15));
        img.add(user);
        
        txt = new JTextField();
        txt.setBounds(650,200,200,30);
        txt.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt);
        
        
        JLabel pass = new JLabel("PASSWORD  :- ");
        pass.setBounds(500,240,300,30);
        pass.setFont(new Font("ARIAL", Font.BOLD,15));
        img.add(pass);
        
        txt1 = new JTextField();
        txt1.setBounds(650,240,200,30);
        txt1.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt1);
        
        login = new JButton("Login");
        login.setBounds(550,300,100,30);
        login.setBackground(new Color(133,145,170));
        login.setForeground(Color.white);
        login.setFont(new Font("ARIAL", Font.BOLD,12));
        login.setBorder(new LineBorder(new Color(133,145,170)));
        login.addActionListener(this);
        img.add(login);
        
        signup = new JButton("Signup");
        signup.setBounds(700,300,100,30);
        signup.setBackground(new Color(133,145,170));
        signup.setForeground(Color.white);
        signup.setFont(new Font("ARIAL", Font.BOLD,12));
        signup.setBorder(new LineBorder(new Color(133,145,170)));
        signup.addActionListener(this);
        img.add(signup);
        
        forget = new JButton("Forget Password");
        forget.setBounds(620,350,120,30);
        forget.setBackground(new Color(133,145,170));
        forget.setForeground(Color.white);
        forget.setFont(new Font("ARIAL", Font.BOLD,12));
        forget.setBorder(new LineBorder(new Color(133,145,170)));
        forget.addActionListener(this);
        img.add(forget); 
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()== login){
            try {
                String username = txt.getText();
                String password = txt1.getText();
                
               String query ="Select * from signup where password = '"+password+"' AND username = '"+username+"' ";
               Conn c= new Conn();
               ResultSet rs = c.st.executeQuery(query);
               if(rs.next()){
                   setVisible(false);
                   new Loading(username);
               }else{
                   JOptionPane.showMessageDialog(null, "Username or password is incorrect");
               }
               
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }else if(ae.getSource()==signup){
            setVisible(false);
            new Signup();
        }else{
            setVisible(false);
            new ForgetPassword();
        }
        
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
