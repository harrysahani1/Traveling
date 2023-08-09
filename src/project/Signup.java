/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author harry sahani
 */
public class Signup  extends JFrame implements ActionListener{
    JButton submit,back;
    JTextField txt,txt1,txt2,txt3;
    Choice security;
    
    Signup(){
        setBounds(300,100,900,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image9.jpg"));
        Image img2 =img1.getImage().getScaledInstance(900, 550, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,900,550);
        add(img);
        
        JLabel username = new JLabel("USERNAME :-");
        username.setBounds(300,70,125,25);
        username.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(username);
        txt = new JTextField();
        txt.setBounds(400,70,180,25);
        txt.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt);
        
        JLabel name = new JLabel("NAME :-");
        name.setBounds(300,110,125,25);
        name.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(name);
        txt1 = new JTextField();
        txt1.setBounds(400,110,180,25);
        txt1.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt1);
        
        JLabel password = new JLabel("PASSWORD :-");
        password.setBounds(300,150,125,25);
        password.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(password);
        txt2 = new JTextField();
        txt2.setBounds(400,150,180,25);
        txt2.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt2);
        
       
        JLabel sec = new JLabel("SECURITY :-");
        sec.setBounds(300,190,100,25);
        sec.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(sec);
        
        security = new Choice();
        security.add("Your date of birth time");
        security.add("Your fav superhero");
        security.add("Your fav place");
        security.add("Your fav book");
        security.add("Your fav movie");
        security.setBounds(400,190,180,25);
        img.add(security);
        
        
        JLabel ans = new JLabel("ANSWER :-");
        ans.setBounds(300,230,125,25);
        ans.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(ans);
        txt3 = new JTextField();
        txt3.setBounds(400,230,180,25);
        txt3.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt3);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.white);
        submit.setForeground(new Color(133,193,233));
        submit.setFont(new Font("ARIAL", Font.BOLD,12));
        submit.setBounds(320,290,100,30);
        submit.addActionListener(this);
        img.add(submit);
        
        back = new JButton("Back");
        back.setBackground(Color.white);
        back.setForeground(new Color(133,193,233));
        back.setFont(new Font("ARIAL", Font.BOLD,12));
        back.setBounds(470,290,100,30);
        back.addActionListener(this);
        img.add(back); 
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String username = txt.getText();
            String name = txt1.getText();
            String password = txt2.getText();
            String question = security.getSelectedItem();
            String ans = txt3.getText();
            
            String query = "insert into signup values( '"+username+"','"+name+"','"+password+"','"+question+"','"+ans+"')";
            
            try {
                Conn c= new Conn();
                c.st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Account created successfull");
                setVisible(false);
                new Login();
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }else if(ae.getSource()==back){
            setVisible(false);
            new Login();
        }
        
    }
    
    public static void main(String[] args) {
        new Signup();
    }
    
}
