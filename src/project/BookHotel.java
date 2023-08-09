

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

public class BookHotel extends JFrame implements ActionListener{
    Choice chotel, cac,cfood;
    JTextField txt,txt1;
    String username;
    JLabel username1,pack,id1,num1,phone,total1;
    JButton CheckPrice, Book, Back;
    BookHotel(String username){
        this.username = username;
        
        setBounds(250,20,1000,800);
        setLayout(null);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image19.jpg"));
        Image img2 =img1.getImage().getScaledInstance(1000, 800, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,1000,800);
        add(img);
        
        
        JLabel book = new JLabel("Book Hotel");
        book.setBounds(400,30,200,30);
        book.setFont(new Font("ARIAL", Font.BOLD,25));
        book.setForeground(new Color(255,0,0));
        img.add(book);
        
        JLabel lusername = new JLabel("username");
        lusername.setBounds(90,100,150,30);
        lusername.setForeground(Color.black);
        lusername.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(lusername);
        
        username1 = new JLabel();
        username1.setBounds(300,100,150,30);
        username1.setFont(new Font("ARIAL", Font.BOLD,12));
        username1.setForeground(Color.black);
        img.add(username1);
        
        
        pack = new JLabel("Select Hotel");
        pack.setBounds(90,150,200,30);
        pack.setForeground(Color.black);
        pack.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(pack);
        
        chotel = new Choice(); 
        chotel.setBounds(300,150,200,30);
        chotel.setFont(new Font("ARIAL", Font.BOLD,12));
        chotel.setForeground(Color.black);
        img.add(chotel);
        
        try {
               Conn c= new Conn();
               ResultSet rs = c.st.executeQuery("Select * from bhotel");
               while (rs.next()) {
                   chotel.add(rs.getString("name" ));  
               }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel  number1 = new JLabel("Total Person");
        number1.setBounds(90,200,150,30);
        number1.setForeground(Color.black);
        number1.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(number1);
        
        txt = new JTextField("1");
        txt.setBounds(300,200,150,30);
        txt.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt);
        
        
        JLabel  days = new JLabel("No. of Days");
        days.setBounds(90,250,150,30);
        days.setForeground(Color.black);
        days.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(days);
        
        txt1 = new JTextField("1");
        txt1.setBounds(300,250,150,30);
        txt1.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt1);
        
        
        JLabel  ac = new JLabel("AC/NON-AC");
        ac.setBounds(90,300,150,30);
        ac.setForeground(Color.black);
        ac.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(ac);
        
        cac = new Choice(); 
        cac.add("AC");
        cac.add("NON-AC");
        cac.setBounds(300,300,200,30);
        cac.setFont(new Font("ARIAL", Font.BOLD,12));
        cac.setForeground(Color.black);
        img.add(cac);
        
        JLabel  food = new JLabel("Food Included");
        food.setBounds(90,350,150,30);
        food.setForeground(Color.black);
        food.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(food);
        
        cfood = new Choice(); 
        cfood.add("YES");
        cfood.add("NO");
        cfood.setBounds(300,350,200,30);
        cfood.setFont(new Font("ARIAL", Font.BOLD,12));
        cfood.setForeground(Color.black);
        img.add(cfood);
        
        
        JLabel  id = new JLabel("ID");
        id.setBounds(90,400,150,30);
        id.setForeground(Color.black);
        id.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(id);
        
        id1 = new JLabel();
        id1.setBounds(300,400,150,30);
        id1.setFont(new Font("ARIAL", Font.BOLD,12));
        id1.setForeground(Color.black);
        img.add(id1);
        
        JLabel  num = new JLabel("Number");
        num.setBounds(90,450,150,30);
        num.setForeground(Color.black);
        num.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(num);
        
        num1 = new JLabel();
        num1.setBounds(300,450,150,30);
        num1.setFont(new Font("ARIAL", Font.BOLD,12));
        num1.setForeground(Color.black);
        img.add(num1);
        
        
        JLabel  phone1 = new JLabel("Phone");
        phone1.setBounds(90,500,150,30);
        phone1.setForeground(Color.black);
        phone1.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(phone1);
        
        phone = new JLabel();
        phone.setBounds(300,500,150,30);
        phone.setFont(new Font("ARIAL", Font.BOLD,12));
        phone.setForeground(Color.black);
        img.add(phone);
        
        JLabel  total = new JLabel("Total Amount");
        total.setBounds(90,550,150,30);
        total.setForeground(Color.black);
        total.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(total);
        
        total1 = new JLabel();
        total1.setBounds(300,550,150,30);
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
        
        CheckPrice = new JButton("ChecPrice");
        CheckPrice.setBackground(Color.BLACK);
        CheckPrice.setForeground(new Color(133,193,233));
        CheckPrice.setFont(new Font("ARIAL", Font.BOLD,12));
        CheckPrice.setBounds(50,600,130,30);
        CheckPrice.addActionListener(this);
        img.add(CheckPrice);
        
        
        Book = new JButton("Book");
        Book.setBackground(Color.BLACK);
        Book.setForeground(new Color(133,193,233));
        Book.setFont(new Font("ARIAL", Font.BOLD,12));
        Book.setBounds(200,600,130,30);
        Book.addActionListener(this);
        img.add(Book);
        
        
        Back = new JButton("Back");
        Back.setBackground(Color.BLACK);
        Back.setForeground(new Color(133,193,233));
        Back.setFont(new Font("ARIAL", Font.BOLD,12));
        Back.setBounds(350,600,130,30);
        Back.addActionListener(this);
        img.add(Back);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==CheckPrice){
            try {
            Conn c= new Conn();
            ResultSet rs = c.st.executeQuery("Select * from bhotel where name = '"+chotel.getSelectedItem()+"'");
            while(rs.next()){
                int cost = Integer.parseInt(rs.getNString("costperperson"));
                int room = Integer.parseInt(rs.getNString("acroom"));
                int food = Integer.parseInt(rs.getNString("foodinclude"));
                
                int persons = Integer.parseInt(txt.getText());
                int days = Integer.parseInt(txt1.getText());
                
                String acselect = cac.getSelectedItem();
                String foodselect = cfood.getSelectedItem();
                
                if(persons * days > 0){
                    int total =0;
                    total += acselect.equals("AC") ?   room :0;
                    total += foodselect.equals("YES") ?   food : 0;
                    total +=cost;
                    
                    total = total * persons * days;
                    total1.setText("Rs" +total);
                }else{
                    JOptionPane.showMessageDialog(null, "Please enter a valid number"); 
                    
                }
                
                
            }
            
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }else if(ae.getSource()== Book){
            
            try {
                Conn c = new Conn();
                c.st.executeUpdate("insert into bookhotel values ('"+username1.getText()+"','"+chotel.getSelectedItem()+"','"+txt.getText()+"','"+txt1.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+id1.getText()+"','"+num1.getText()+"','"+phone.getText()+"','"+total1.getText()+"')");
                JOptionPane.showMessageDialog(null, "Hotel Booked Successfull");
                setVisible(false);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
        }else{
            setVisible(false);
        }
    }
    
    
    public static void main(String[] args) {
        new BookHotel("Abhi12345");
    }
    
}
