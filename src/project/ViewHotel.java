
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


public class ViewHotel extends JFrame implements ActionListener{
    JButton back;
    ViewHotel(String username){
        
        setBounds(300,80,900,600);
        setLayout(null);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image20.jpg"));
        Image img2 =img1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,900,600);
        add(img);
        
        JLabel  text = new JLabel("VIEW BOOK HOTEL DETAILS");
        text.setBounds(300,10,350,30);
        text.setForeground(Color.red);
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
        
        
        JLabel  pack = new JLabel("Hotel Name");
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
        
        JLabel  id = new JLabel("total Days");
        id.setBounds(90,180,150,30);
        id.setForeground(Color.white);
        id.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(id);
        
        JLabel id1 = new JLabel();
        id1.setBounds(300,180,150,30);
        id1.setFont(new Font("ARIAL", Font.BOLD,12));
        id1.setForeground(Color.white);
        img.add(id1);
        
        JLabel  number = new JLabel("AC/NON-AC");
        number.setBounds(90,220,150,30);
        number.setForeground(Color.white);
        number.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(number);
        
        JLabel number1 = new JLabel();
        number1.setBounds(300,220,150,30);
        number1.setFont(new Font("ARIAL", Font.BOLD,12));
        number1.setForeground(Color.white);
        img.add(number1);
        
        JLabel  phone = new JLabel("Food Include");
        phone.setBounds(90,260,150,30);
        phone.setForeground(Color.white);
        phone.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(phone);
        
        JLabel phone1 = new JLabel();
        phone1.setBounds(300,260,150,30);
        phone1.setFont(new Font("ARIAL", Font.BOLD,12));
        phone1.setForeground(Color.white);
        img.add(phone1);
        
        JLabel  price = new JLabel("ID");
        price.setBounds(90,300,150,30);
        price.setForeground(Color.white);
        price.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(price);
        
        JLabel price1 = new JLabel();
        price1.setBounds(300,300,150,30);
        price1.setFont(new Font("ARIAL", Font.BOLD,12));
        price1.setForeground(Color.white);
        img.add(price1);
        
        
        JLabel  num = new JLabel("Number");
        num.setBounds(90,340,150,30);
        num.setForeground(Color.white);
        num.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(num);
        
        JLabel num1 = new JLabel();
        num1.setBounds(300,340,150,30);
        num1.setFont(new Font("ARIAL", Font.BOLD,12));
        num1.setForeground(Color.white);
        img.add(num1);
        
        
        JLabel  mob = new JLabel("Phone");
        mob.setBounds(90,380,150,30);
        mob.setForeground(Color.white);
        mob.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(mob);
        
        JLabel mob1 = new JLabel();
        mob1.setBounds(300,380,150,30);
        mob1.setFont(new Font("ARIAL", Font.BOLD,12));
        mob1.setForeground(Color.white);
        img.add(mob1);
        
        
        JLabel  amount = new JLabel("Total Amount");
        amount.setBounds(90,420,150,30);
        amount.setForeground(Color.white);
        amount.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(amount);
        
        JLabel amount1 = new JLabel();
        amount1.setBounds(300,420,150,30);
        amount1.setFont(new Font("ARIAL", Font.BOLD,12));
        amount1.setForeground(Color.white);
        img.add(amount1);
        
        
        back = new JButton("Back");
        back.setBackground(Color.white);
        back.setForeground(new Color(1,1,102));
        back.setFont(new Font("ARIAL", Font.BOLD,12));
        back.setBounds(200,500,100,30);
        back.addActionListener(this);
        img.add(back);
        
        try {
            Conn c= new Conn();
            String query ="Select * from bookhotel where username = '"+username+"'";
            ResultSet rs = c.st.executeQuery(query);
            while(rs.next()){
 
            username1.setText(rs.getString("username"));
            pack1.setText(rs.getString("hotel"));
            total1.setText(rs.getString("total_person"));
            id1.setText(rs.getString("NO_days"));
            number1.setText(rs.getString("ac_non_ac"));
            phone1.setText(rs.getString("foodinclude"));
            price1.setText(rs.getString("id"));
            num1.setText(rs.getString("number"));
            mob1.setText(rs.getString("phone"));
            amount1.setText(rs.getString("amount"));
                           
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
        new ViewHotel("Abhi12345");
    }
}
