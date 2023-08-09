
package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.sql.*;

/**
 *
 * @author harry sahani
 */

public class ForgetPassword extends JFrame implements ActionListener{
    JTextField txt,txt1,txt2,txt3,txt4;
    JButton search, retrieve,back;

    public ForgetPassword() {
        setBounds(350,150,800,400);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image4.jpg"));
        Image img2 =img1.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(550,70,800,400);
        add(img);
        
        JLabel username = new JLabel("USERNAME  :-");
        username.setBounds(40,20,125,25);
        username.setFont(new Font("ARIAL", Font.BOLD,12));
        username.setForeground(Color.white);
        img.add(username);
        txt = new JTextField();
        txt.setBounds(180,20,150,25);
        txt.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt);
        
        
        search = new JButton("Search");
        search.setBounds(350,20,100,25);
        search.setBackground(new Color(133,145,170));
        search.setForeground(Color.white);
        search.setFont(new Font("ARIAL", Font.BOLD,12));
        search.setBorder(new LineBorder(new Color(133,145,170)));
        search.addActionListener(this);
        img.add(search);
        
        JLabel name = new JLabel("NAME  :-");
        name.setBounds(40,60,125,25);
        name.setFont(new Font("ARIAL", Font.BOLD,12));
        name.setForeground(Color.white);
        img.add(name);
        txt1 = new JTextField();
        txt1.setBounds(180,60,150,25);
        txt1.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt1);
        
        JLabel security = new JLabel("SECURITY QUESTION  :-");
        security.setBounds(40,100,125,25);
        security.setFont(new Font("ARIAL", Font.BOLD,12));
        security.setForeground(Color.white);
        img.add(security);
        txt2 = new JTextField();
        txt2.setBounds(180,100,150,25);
        txt2.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt2);
        
        JLabel answer = new JLabel("ANSWER  :-");
        answer.setBounds(40,140,125,25);
        answer.setFont(new Font("ARIAL", Font.BOLD,12));
        answer.setForeground(Color.white);
        img.add(answer);
        txt3 = new JTextField();
        txt3.setBounds(180,140,150,25);
        txt3.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt3);
        
        retrieve = new JButton("Retrieve");
        retrieve.setBounds(350,140,100,25);
        retrieve.setBackground(new Color(133,145,170));
        retrieve.setForeground(Color.white);
        retrieve.setFont(new Font("ARIAL", Font.BOLD,12));
        retrieve.setBorder(new LineBorder(new Color(133,145,170)));
        retrieve.addActionListener(this);
        img.add(retrieve);
        
        
        JLabel password = new JLabel("PASSWORD  :-");
        password.setBounds(40,180,125,25);
        password.setFont(new Font("ARIAL", Font.BOLD,12));
        password.setForeground(Color.white);
        img.add(password);
        txt4 = new JTextField();
        txt4.setBounds(180,180,150,25);
        txt4.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt4);
        
        
        back = new JButton("Back");
        back.setBounds(150,230,100,25);
        back.setBackground(new Color(133,145,170));
        back.setForeground(Color.white);
        back.setFont(new Font("ARIAL", Font.BOLD,12));
        back.setBorder(new LineBorder(new Color(133,145,170)));
        back.addActionListener(this);
        img.add(back);
        
        
        setVisible(true);
        
    }
    
    
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==search){
           try {
               String query ="Select * from signup where username = '"+txt.getText()+"'";
               Conn c= new Conn();
               ResultSet rs = c.st.executeQuery(query);
               while (rs.next()) {
                   txt1.setText(rs.getString("name"));
                   txt2.setText(rs.getString("security"));    
               }   
           } catch (Exception e) {
               e.printStackTrace();
           }
           
       }else if(ae.getSource()==retrieve){
           try {
               String query ="Select * from signup where answer = '"+txt3.getText()+"' AND username = '"+txt.getText()+"' ";
               Conn c= new Conn();
               ResultSet rs = c.st.executeQuery(query);
               while (rs.next()) {
                   txt4.setText(rs.getString("password"));    
               }   
           } catch (Exception e) {
               e.printStackTrace();
           }
           
       }else {
           setVisible(false);
           new Login();       }
       
       
   }
    public static void main(String[] args) {
        new ForgetPassword();
    }
    
    
}
