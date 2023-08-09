
package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.JOptionPane;


public class Add extends JFrame implements ActionListener{
    JLabel username1,name1;
    JComboBox comboid;
    JTextField txt,txt1,txt2,txt3,txt4;
    JRadioButton rmale,rfmale;
    JButton add,back;
    
    Add(String username){
        setBounds(300,100,820,550);
        setLayout(null);
//        getContentPane().setBackground(Color.white);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image6.jpg"));
        Image img2 =img1.getImage().getScaledInstance(820, 550, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,820,550);
        add(img);
        
        
        JLabel  lusername = new JLabel("Username");
        lusername.setBounds(30,50,150,30);
        lusername.setForeground(Color.white);
        lusername.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(lusername);
        
        username1 = new JLabel();
        username1.setBounds(150,50,150,30);
        username1.setFont(new Font("ARIAL", Font.BOLD,12));
        username1.setForeground(Color.white);
        img.add(username1);
        
        JLabel  id = new JLabel("ID");
        id.setBounds(30,90,150,30);
        id.setForeground(Color.white);
        id.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(id);
        
        comboid = new JComboBox(new String[] {"Addhar Card","Passport","Driving Licence","Pan Card"});
        comboid.setBackground( Color.white);
        comboid.setBounds(150,90,150,30);
        img.add(comboid);
        
        JLabel  number = new JLabel("Number");
        number.setBounds(30,130,150,30);
        number.setForeground(Color.white);
        number.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(number);
        
        txt = new JTextField();
        txt.setBounds(150,130,150,30);
        txt.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt);
        
        JLabel  name = new JLabel("Name");
        name.setBounds(30,170,150,30);
        name.setForeground(Color.white);
        name.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(name);
        
        name1 = new JLabel();
        name1.setBounds(150,170,150,30);
        name1.setFont(new Font("ARIAL", Font.BOLD,12));
        name1.setForeground(Color.white);
        img.add(name1);
        
        JLabel  gender = new JLabel("Gender");
        gender.setBounds(30,210,150,30);
        gender.setForeground(Color.white);
        gender.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(gender);
        
        rmale = new JRadioButton("Male");
        rmale.setBounds(150,210,70,25);
        img.add(rmale);
        rfmale = new JRadioButton("Female");
        rfmale.setBounds(240,210,70,25);
        img.add(rfmale);
        
        ButtonGroup bd= new ButtonGroup();
        bd.add(rmale);
        bd.add(rfmale);
        
        JLabel  country = new JLabel("Country");
        country.setBounds(30,250,150,30);
        country.setForeground(Color.white);
        country.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(country);
        
        txt1 = new JTextField();
        txt1.setBounds(150,250,150,30);
        txt1.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt1);
        
        JLabel  address = new JLabel("Address");
        address.setBounds(30,290,150,30);
        address.setForeground(Color.white);
        address.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(address);
        
        txt2 = new JTextField();
        txt2.setBounds(150,290,150,30);
        txt2.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt2); 
        
        
        JLabel  email = new JLabel("Email");
        email.setBounds(30,330,150,30);
        email.setForeground(Color.white);
        email.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(email);
        
        txt3 = new JTextField();
        txt3.setBounds(150,330,150,30);
        txt3.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt3);
        
        JLabel  phone = new JLabel("Phone_NO");
        phone.setBounds(30,370,150,30);
        phone.setForeground(Color.white);
        phone.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(phone);
        
        txt4 = new JTextField();
        txt4.setBounds(150,370,150,30);
        txt4.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt4);
        
        add = new JButton("Add");
        add.setBackground(Color.white);
        add.setForeground(new Color(133,193,233));
        add.setFont(new Font("ARIAL", Font.BOLD,12));
        add.setBounds(70,430,100,30);
        add.addActionListener(this);
        img.add(add);
        
        back = new JButton("Back");
        back.setBackground(Color.white);
        back.setForeground(new Color(133,193,233));
        back.setFont(new Font("ARIAL", Font.BOLD,12));
        back.setBounds(220,430,100,30);
        back.addActionListener(this);
        img.add(back);
        
        
        ImageIcon img4=new ImageIcon(ClassLoader.getSystemResource("image/image8.png"));
        Image img5 =img4.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon img6=new ImageIcon(img5);
        JLabel img7= new JLabel(img6);
        img7.setBounds(350,70,400,300);
        img.add(img7);
        
        
        try {
            Conn c =new Conn();
            ResultSet rs = c.st.executeQuery("select * from signup where username='"+username+"' ");
            while(rs.next()){
                username1.setText(rs.getString("username"));
                name1.setText(rs.getString("name"));
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String username= username1.getText();
            String id = (String) comboid.getSelectedItem();
            String number = txt.getText();
            String name = name1.getText();
            String gender =null;
            if(rmale.isSelected()){
                gender="Male";
            }else{
                gender="Female";
            }
            String country = txt1.getText();
            String address = txt2.getText();
            String email = txt3.getText();
            String phone = txt4.getText();
            
            try {
                Conn c= new Conn();
                String query ="insert into addperson values( '"+username+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+email+"','"+phone+"')";
                c.st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Customer data Inserted successfull");
                setVisible(false);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
        }else {
            setVisible(false);
            
        }
        
    }
    
    public static void main(String[] args) {
        new Add("Abhi12345");
    }
    
}
