
package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class Dashboard extends JFrame implements ActionListener{
    String username;
    JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkPackage,bookPackage,viewPackage,viewHotels,destination,bookHotels;
    JButton viewBookHotels,Payment,about,deletePersonalDetails;
    Dashboard(String username) {
        this.username= username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        
        JPanel jp= new JPanel();
        jp.setLayout(null);
        jp.setBackground(new Color(0,100,0));
        jp.setBounds(0,0,1600,65);
        add(jp);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image5.png"));
        Image img2 =img1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(8,5,50,50);
        jp.add(img);
        
        JLabel dashboard = new JLabel("Dashboard");
        dashboard.setBounds(80,10,300,40);
        dashboard.setFont(new Font("ARIAL", Font.BOLD,25));
        dashboard.setForeground(Color.white);
        jp.add(dashboard);
        
        JPanel jp2= new JPanel();
        jp2.setLayout(null);
        jp2.setBackground(new Color(0,100,0));
        jp2.setBounds(0,65,300,900);
        add(jp2);
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,40);
        addPersonalDetails.setBackground(new Color(0,100,0));
        addPersonalDetails.setForeground(Color.white);
        addPersonalDetails.setFont(new Font("ARIAL", Font.PLAIN,18));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        jp2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,50,300,40);
        updatePersonalDetails.setBackground(new Color(0,100,0));
        updatePersonalDetails.setForeground(Color.white);
        updatePersonalDetails.setFont(new Font("ARIAL", Font.PLAIN,18));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        jp2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0,100,300,40);
        viewPersonalDetails.setBackground(new Color(0,100,0));
        viewPersonalDetails.setForeground(Color.white);
        viewPersonalDetails.setFont(new Font("ARIAL", Font.PLAIN,18));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        jp2.add(viewPersonalDetails);
        
        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,150,300,40);
        deletePersonalDetails.setBackground(new Color(0,100,0));
        deletePersonalDetails.setForeground(Color.white);
        deletePersonalDetails.setFont(new Font("ARIAL", Font.PLAIN,18));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        deletePersonalDetails.addActionListener(this);
        jp2.add(deletePersonalDetails);
        
        checkPackage = new JButton("Check Package");
        checkPackage.setBounds(0,200,300,40);
        checkPackage.setBackground(new Color(0,100,0));
        checkPackage.setForeground(Color.white);
        checkPackage.setFont(new Font("ARIAL", Font.PLAIN,18));
        checkPackage.setMargin(new Insets(0,0,0,110));
        checkPackage.addActionListener(this);
        jp2.add(checkPackage);
        
        bookPackage = new JButton("Book Package");
        bookPackage.setBounds(0,250,300,40);
        bookPackage.setBackground(new Color(0,100,0));
        bookPackage.setForeground(Color.white);
        bookPackage.setFont(new Font("ARIAL", Font.PLAIN,18));
        bookPackage.setMargin(new Insets(0,0,0,110));
        bookPackage.addActionListener(this);
        jp2.add(bookPackage);
        
        viewPackage = new JButton("View Package");
        viewPackage.setBounds(0,300,300,40);
        viewPackage.setBackground(new Color(0,100,0));
        viewPackage.setForeground(Color.white);
        viewPackage.setFont(new Font("ARIAL", Font.PLAIN,18));
        viewPackage.setMargin(new Insets(0,0,0,110));
        viewPackage.addActionListener(this);
        jp2.add(viewPackage);
        
        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0,350,300,40);
        viewHotels.setBackground(new Color(0,100,0));
        viewHotels.setForeground(Color.white);
        viewHotels.setFont(new Font("ARIAL", Font.PLAIN,18));
        viewHotels.setMargin(new Insets(0,0,0,130));
        viewHotels.addActionListener(this);
        jp2.add(viewHotels);
        
        bookHotels = new JButton("Book Hotels");
        bookHotels.setBounds(0,400,300,40);
        bookHotels.setBackground(new Color(0,100,0));
        bookHotels.setForeground(Color.white);
        bookHotels.setFont(new Font("ARIAL", Font.PLAIN,18));
        bookHotels.setMargin(new Insets(0,0,0,130));
        bookHotels.addActionListener(this);
        jp2.add(bookHotels);
        
        viewBookHotels = new JButton("View Book Hotels");
        viewBookHotels.setBounds(0,450,300,40);
        viewBookHotels.setBackground(new Color(0,100,0));
        viewBookHotels.setForeground(Color.white);
        viewBookHotels.setFont(new Font("ARIAL", Font.PLAIN,18));
        viewBookHotels.setMargin(new Insets(0,0,0,90));
        viewBookHotels.addActionListener(this);
        jp2.add(viewBookHotels);
        
        destination = new JButton("Destination");
        destination.setBounds(0,500,300,40);
        destination.setBackground(new Color(0,100,0));
        destination.setForeground(Color.white);
        destination.setFont(new Font("ARIAL", Font.PLAIN,18));
        destination.setMargin(new Insets(0,0,0,140));
        destination.addActionListener(this);
        jp2.add(destination);
        
        Payment = new JButton("Payment");
        Payment.setBounds(0,550,300,40);
        Payment.setBackground(new Color(0,100,0));
        Payment.setForeground(Color.white);
        Payment.setFont(new Font("ARIAL", Font.PLAIN,18));
        Payment.setMargin(new Insets(0,0,0,140));
        Payment.addActionListener(this);
        jp2.add(Payment);
        
        
        about = new JButton("About");
        about.setBounds(0,600,300,40);
        about.setBackground(new Color(0,100,0));
        about.setForeground(Color.white);
        about.setFont(new Font("ARIAL", Font.PLAIN,18));
        about.setMargin(new Insets(0,0,0,140));
        about.addActionListener(this);
        jp2.add(about);
        
        ImageIcon img4=new ImageIcon(ClassLoader.getSystemResource("image/home.jpg"));
        Image img5 =img4.getImage().getScaledInstance(1500, 1000, Image.SCALE_DEFAULT);
        ImageIcon img6=new ImageIcon(img5);
        JLabel img7= new JLabel(img6);
        img7.setBounds(40,50,1500,1000);
        add(img7);
        
        
        JLabel dashboard1 = new JLabel("TRAVEL BOOKING SYSTEM");
        dashboard1.setBounds(450,70,1300,80);
        dashboard1.setFont(new Font("ARIAL", Font.PLAIN,55));
        dashboard1.setForeground(Color.white);
        img7.add(dashboard1);
        
        
        
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== addPersonalDetails ){
            new Add(username);
        }else if(ae.getSource()==viewPersonalDetails){
            new View(username);
        }else if(ae.getSource()==updatePersonalDetails){
            new Update(username);
        }else if (ae.getSource()==checkPackage){
            new Package();
        }else if(ae.getSource()==bookPackage){
            new Book(username);
        }else if(ae.getSource() == viewPackage ){
            new ViewPackage(username);
        }else if(ae.getSource() == viewHotels){
            new Hotel();
        }else if(ae.getSource() == destination){
            new Destination();
        }else if(ae.getSource()==bookHotels){
            new BookHotel(username);
        }else if(ae.getSource()== viewBookHotels){
            new ViewHotel(username);
        }else if(ae.getSource()==Payment){
            new Payment();
        }else if(ae.getSource()==about){
            new About();
        }else if(ae.getSource()==deletePersonalDetails){
            new Delete(username);
        }
        
        
    }
    
    
    public static void main(String[] args) {
        new Dashboard("");
    }
    
}
