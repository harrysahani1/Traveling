
package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.sql.*;
import javax.swing.JButton;


public class ViewPackage extends JFrame implements ActionListener{
    JButton back;
    ViewPackage(String username){
        
        setBounds(300,100,820,550);
        setLayout(null);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image9.jpg"));
        Image img2 =img1.getImage().getScaledInstance(820, 550, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,820,550);
        add(img);
        
        JLabel  text = new JLabel("VIEW PACKAGE DETAILS");
        text.setBounds(300,10,350,30);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("ARIAL", Font.BOLD,20));
        img.add(text);
        
        
        JLabel  lusername = new JLabel("username");
        lusername.setBounds(90,60,150,30);
        lusername.setForeground(Color.white);
        lusername.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(lusername);
        
        JLabel username1 = new JLabel();
        username1.setBounds(300,60,150,30);
        username1.setFont(new Font("ARIAL", Font.BOLD,12));
        username1.setForeground(Color.white);
        img.add(username1);
        
        
        JLabel  pack = new JLabel("Package");
        pack.setBounds(90,100,150,30);
        pack.setForeground(Color.white);
        pack.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(pack);
        
        JLabel pack1 = new JLabel();
        pack1.setBounds(300,100,150,30);
        pack1.setFont(new Font("ARIAL", Font.BOLD,12));
        pack1.setForeground(Color.white);
        img.add(pack1);
        
        JLabel  total = new JLabel("Total Persons");
        total.setBounds(90,140,150,30);
        total.setForeground(Color.white);
        total.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(total);
        
        JLabel total1 = new JLabel();
        total1.setBounds(300,140,150,30);
        total1.setFont(new Font("ARIAL", Font.BOLD,12));
        total1.setForeground(Color.white);
        img.add(total1);
        
        JLabel  id = new JLabel("ID");
        id.setBounds(90,180,150,30);
        id.setForeground(Color.white);
        id.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(id);
        
        JLabel id1 = new JLabel();
        id1.setBounds(300,180,150,30);
        id1.setFont(new Font("ARIAL", Font.BOLD,12));
        id1.setForeground(Color.white);
        img.add(id1);
        
        JLabel  number = new JLabel("Number");
        number.setBounds(90,220,150,30);
        number.setForeground(Color.white);
        number.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(number);
        
        JLabel number1 = new JLabel();
        number1.setBounds(300,220,150,30);
        number1.setFont(new Font("ARIAL", Font.BOLD,12));
        number1.setForeground(Color.white);
        img.add(number1);
        
        JLabel  phone = new JLabel("Phone");
        phone.setBounds(90,260,150,30);
        phone.setForeground(Color.white);
        phone.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(phone);
        
        JLabel phone1 = new JLabel();
        phone1.setBounds(300,260,150,30);
        phone1.setFont(new Font("ARIAL", Font.BOLD,12));
        phone1.setForeground(Color.white);
        img.add(phone1);
        
        JLabel  price = new JLabel("Price");
        price.setBounds(90,300,150,30);
        price.setForeground(Color.white);
        price.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(price);
        
        JLabel price1 = new JLabel();
        price1.setBounds(300,300,150,30);
        price1.setFont(new Font("ARIAL", Font.BOLD,12));
        price1.setForeground(Color.white);
        img.add(price1);
        
        
        back = new JButton("Back");
        back.setBackground(Color.white);
        back.setForeground(new Color(1,1,102));
        back.setFont(new Font("ARIAL", Font.BOLD,12));
        back.setBounds(200,400,100,30);
        back.addActionListener(this);
        img.add(back);
        
        try {
            Conn c= new Conn();
            String query ="Select * from bookpack where username = '"+username+"'";
            ResultSet rs = c.st.executeQuery(query);
            while(rs.next()){
 
            username1.setText(rs.getString("username"));
            pack1.setText(rs.getString("Package"));
            total1.setText(rs.getString("total_person"));
            id1.setText(rs.getString("id"));
            number1.setText(rs.getString("number"));
            phone1.setText(rs.getString("phone"));
            price1.setText(rs.getString("amount"));
                           
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        
        setVisible(false);
        
    }
    public static void main(String[] args) {
        new ViewPackage("Abhi12345");
    }
}
