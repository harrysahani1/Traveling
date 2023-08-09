

package project;

import java.awt.Choice;
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
import javax.swing.JTextField;

public class Book extends JFrame implements ActionListener{
    Choice cpackage;
    JTextField txt;
    String username;
    JLabel username1,pack,id1,num1,phone,total1;
    JButton CheckPackage, BookPackage, Back;
    Book(String username){
        this.username = username;
        
        setBounds(300,100,900,600);
        setLayout(null);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image15.jpg"));
        Image img2 =img1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,900,600);
        add(img);
        
        
        JLabel book = new JLabel("Book Package");
        book.setBounds(400,50,200,30);
        book.setFont(new Font("ARIAL", Font.BOLD,25));
        book.setForeground(new Color(255,0,0));
        img.add(book);
        
        JLabel lusername = new JLabel("username");
        lusername.setBounds(90,150,150,30);
        lusername.setForeground(Color.black);
        lusername.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(lusername);
        
        username1 = new JLabel();
        username1.setBounds(300,150,150,30);
        username1.setFont(new Font("ARIAL", Font.BOLD,12));
        username1.setForeground(Color.black);
        img.add(username1);
        
        
        pack = new JLabel("Selct Package");
        pack.setBounds(90,200,200,30);
        pack.setForeground(Color.black);
        pack.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(pack);
        
        cpackage = new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Brown Package");
        cpackage.setBounds(300,200,200,30);
        cpackage.setFont(new Font("ARIAL", Font.BOLD,12));
        cpackage.setForeground(Color.black);
        img.add(cpackage);
        
        
        JLabel  number1 = new JLabel("Total Person");
        number1.setBounds(90,250,150,30);
        number1.setForeground(Color.black);
        number1.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(number1);
        
        txt = new JTextField("1");
        txt.setBounds(300,250,150,30);
        txt.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt);
        
        
        
        
        JLabel  id = new JLabel("ID");
        id.setBounds(90,300,150,30);
        id.setForeground(Color.black);
        id.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(id);
        
        id1 = new JLabel();
        id1.setBounds(300,300,150,30);
        id1.setFont(new Font("ARIAL", Font.BOLD,12));
        id1.setForeground(Color.black);
        img.add(id1);
        
        JLabel  num = new JLabel("Number");
        num.setBounds(90,350,150,30);
        num.setForeground(Color.black);
        num.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(num);
        
        num1 = new JLabel();
        num1.setBounds(300,350,150,30);
        num1.setFont(new Font("ARIAL", Font.BOLD,12));
        num1.setForeground(Color.black);
        img.add(num1);
        
        
        JLabel  phone1 = new JLabel("Phone");
        phone1.setBounds(90,400,150,30);
        phone1.setForeground(Color.black);
        phone1.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(phone1);
        
        phone = new JLabel();
        phone.setBounds(300,400,150,30);
        phone.setFont(new Font("ARIAL", Font.BOLD,12));
        phone.setForeground(Color.black);
        img.add(phone);
        
        JLabel  total = new JLabel("Total Amount");
        total.setBounds(90,450,150,30);
        total.setForeground(Color.black);
        total.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(total);
        
        total1 = new JLabel();
        total1.setBounds(300,450,150,30);
        total1.setFont(new Font("ARIAL", Font.BOLD,12));
        total1.setForeground(Color.black);
        img.add(total1);
        
        
         try {
            Conn c= new Conn();
            String query ="Select * from addperson where username = '"+username+"'";
            ResultSet rs = c.st.executeQuery(query);
            while(rs.next()){
 
            username1.setText(rs.getString("username"));
            id1.setText(rs.getString("id"));
            num1.setText(rs.getString("number"));
            phone.setText(rs.getString("phone"));
                           
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        CheckPackage = new JButton("CheckPackage");
        CheckPackage.setBackground(Color.BLACK);
        CheckPackage.setForeground(new Color(133,193,233));
        CheckPackage.setFont(new Font("ARIAL", Font.BOLD,12));
        CheckPackage.setBounds(50,500,130,30);
        CheckPackage.addActionListener(this);
        img.add(CheckPackage);
        
        
        BookPackage = new JButton("BookPackage");
        BookPackage.setBackground(Color.BLACK);
        BookPackage.setForeground(new Color(133,193,233));
        BookPackage.setFont(new Font("ARIAL", Font.BOLD,12));
        BookPackage.setBounds(200,500,130,30);
        BookPackage.addActionListener(this);
        img.add(BookPackage);
        
        
        Back = new JButton("Back");
        Back.setBackground(Color.BLACK);
        Back.setForeground(new Color(133,193,233));
        Back.setFont(new Font("ARIAL", Font.BOLD,12));
        Back.setBounds(350,500,130,30);
        Back.addActionListener(this);
        img.add(Back);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==CheckPackage){
            String pack = cpackage.getSelectedItem();
            int cost = 0;
            if(pack.equals("Gold Package")){
                
                cost += 25000;
                
            }else if(pack.equals("Silver Package")){
                cost += 15000;
            }else{
                cost += 10000;
                
            }
            int persons = Integer.parseInt(txt.getText());
            cost *= persons;
            total1.setText("Rs " +cost);
            
            
            
        }else if(ae.getSource()== BookPackage){
            
            try {
                Conn c = new Conn();
                c.st.executeUpdate("insert into bookpack values ('"+username1.getText()+"','"+cpackage.getSelectedItem()+"','"+txt.getText()+"','"+id1.getText()+"','"+num1.getText()+"','"+phone.getText()+"','"+total1.getText()+"')");
                JOptionPane.showMessageDialog(null, "Package Booked Successfull");
                setVisible(false);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
        }else{
            setVisible(false);
        }
    }
    
    
    public static void main(String[] args) {
        new Book("Abhi12345");
    }
    
}
