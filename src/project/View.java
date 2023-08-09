
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


public class View extends JFrame implements ActionListener{
    JButton back;
    View(String username){
        setBounds(300,100,820,550);
        setLayout(null);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image9.jpg"));
        Image img2 =img1.getImage().getScaledInstance(820, 550, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,820,550);
        add(img);
        
        JLabel  lusername = new JLabel("username");
        lusername.setBounds(90,50,150,30);
        lusername.setForeground(Color.white);
        lusername.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(lusername);
        
        JLabel username1 = new JLabel();
        username1.setBounds(300,50,150,30);
        username1.setFont(new Font("ARIAL", Font.BOLD,12));
        username1.setForeground(Color.white);
        img.add(username1);
        
        
        JLabel  id = new JLabel("ID");
        id.setBounds(90,90,150,30);
        id.setForeground(Color.white);
        id.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(id);
        
        JLabel id1 = new JLabel();
        id1.setBounds(300,90,150,30);
        id1.setFont(new Font("ARIAL", Font.BOLD,12));
        id1.setForeground(Color.white);
        img.add(id1);
        
        JLabel  number = new JLabel("Number");
        number.setBounds(90,130,150,30);
        number.setForeground(Color.white);
        number.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(number);
        
        JLabel number1 = new JLabel();
        number1.setBounds(300,130,150,30);
        number1.setFont(new Font("ARIAL", Font.BOLD,12));
        number1.setForeground(Color.white);
        img.add(number1);
        
        JLabel  name = new JLabel("Name");
        name.setBounds(90,170,150,30);
        name.setForeground(Color.white);
        name.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(name);
        
        JLabel name1 = new JLabel();
        name1.setBounds(300,170,150,30);
        name1.setFont(new Font("ARIAL", Font.BOLD,12));
        name1.setForeground(Color.white);
        img.add(name1);
        
        JLabel  gender = new JLabel("Gender");
        gender.setBounds(90,210,150,30);
        gender.setForeground(Color.white);
        gender.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(gender);
        
        JLabel gender1 = new JLabel();
        gender1.setBounds(300,210,150,30);
        gender1.setFont(new Font("ARIAL", Font.BOLD,12));
        gender1.setForeground(Color.white);
        img.add(gender1);
        
        JLabel  country = new JLabel("Country");
        country.setBounds(90,250,150,30);
        country.setForeground(Color.white);
        country.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(country);
        
        JLabel country1 = new JLabel();
        country1.setBounds(300,250,150,30);
        country1.setFont(new Font("ARIAL", Font.BOLD,12));
        country1.setForeground(Color.white);
        img.add(country1);
        
        JLabel  address = new JLabel("Address");
        address.setBounds(90,290,150,30);
        address.setForeground(Color.white);
        address.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(address);
        
        JLabel address1 = new JLabel();
        address1.setBounds(300,290,150,30);
        address1.setFont(new Font("ARIAL", Font.BOLD,12));
        address1.setForeground(Color.white);
        img.add(address1);
        
        JLabel  email = new JLabel("Email");
        email.setBounds(90,330,150,30);
        email.setForeground(Color.white);
        email.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(email);
        
         JLabel email1 = new JLabel();
        email1.setBounds(300,330,150,30);
        email1.setFont(new Font("ARIAL", Font.BOLD,12));
        email1.setForeground(Color.white);
        img.add(email1);
        
        JLabel  phone = new JLabel("Phone_NO");
        phone.setBounds(90,370,150,30);
        phone.setForeground(Color.white);
        phone.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(phone);
        
        
        JLabel phone1 = new JLabel();
        phone1.setBounds(300,370,150,30);
        phone1.setFont(new Font("ARIAL", Font.BOLD,12));
        phone1.setForeground(Color.white);
        img.add(phone1);
        
        
        back = new JButton("Back");
        back.setBackground(Color.white);
        back.setForeground(new Color(1,1,102));
        back.setFont(new Font("ARIAL", Font.BOLD,12));
        back.setBounds(200,430,100,30);
        back.addActionListener(this);
        img.add(back);
        
        try {
            Conn c= new Conn();
            String query ="Select * from addperson where username = '"+username+"'";
            ResultSet rs = c.st.executeQuery(query);
            while(rs.next()){
 
            username1.setText(rs.getString("username"));
            id1.setText(rs.getString("id"));
            number1.setText(rs.getString("number"));
            name1.setText(rs.getString("name"));
            gender1.setText(rs.getString("gender"));
            country1.setText(rs.getString("country"));
            address1.setText(rs.getString("address"));
            email1.setText(rs.getString("email"));
            phone1.setText(rs.getString("phone"));
                           
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
        new View("Abhi12345");
    }
}
