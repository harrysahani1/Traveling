
package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class Package extends JFrame{
    
    Package(){
        
        
        
        setBounds(300,100,900,600);
        
        String[] Package1={"GOLD PACKAGE","7 Days 6 Nights","Airport Assistance","Transport from Airport to hotel","Full Day City and Shopping Tour","Daily Buffet","Full day 3 island Cruise","24x7 Service","Book Now","Summer Special","Rs 25000/-"};
        String[] Package2={"SILVER PACKAGE","5 days 4 Nights","Welcome Drink","Transport from Airport to hotel","Half Day City and Shopping Tour","Daily Buffet","Full day 1 island Cruise","24x7 Service","Book now","Winter Special","Rs 15000/-"};
        String[] Package3={"BROWN PACKAGE","2 Days 1 Nights","Welcome Drink","Transport from Airport to hotel","Daily Buffet","Free Wifi","Full day 1 island Cruise","24x7 Service","Book now","Monsoon Special","Rs 10000/-"};
        
        JTabbedPane jt= new JTabbedPane();
        
        JPanel p1 = createPackage(Package1);
        jt.addTab("Package1", null, p1);
        
        JPanel p2 = createPackage(Package2);
        jt.addTab("Package2", null, p2);
        
        JPanel p3 = createPackage(Package3);
        jt.addTab("Package3", null, p3);
        add(jt);
        
        setVisible(true);
        
        
    }
    public JPanel createPackage(String[] pack){
         JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(135,206,235));
        
        JLabel  jl = new JLabel(pack[0]);
        jl.setBounds(30,20,300,30);
        jl.setForeground(Color.BLUE);
        jl.setFont(new Font("raleway", Font.BOLD,30));
        p1.add(jl);
       
        
        JLabel  jl1 = new JLabel(pack[1]);
        jl1.setBounds(30,60,250,30);
        jl1.setForeground(Color.black);
        jl1.setFont(new Font("raleway", Font.PLAIN,18));
        p1.add(jl1);
        
        JLabel  jl2 = new JLabel(pack[2]);
        jl2.setBounds(30,100,250,30);
        jl2.setForeground(Color.black);
        jl2.setFont(new Font("raleway", Font.PLAIN,18));
        p1.add(jl2);
        
        JLabel  jl3 = new JLabel(pack[3]);
        jl3.setBounds(30,150,350,30);
        jl3.setForeground(Color.black);
        jl3.setFont(new Font("raleway", Font.PLAIN,18));
        p1.add(jl3);
        
        JLabel  jl4 = new JLabel(pack[4]);
        jl4.setBounds(30,200,350,30);
        jl4.setForeground(Color.black);
        jl4.setFont(new Font("raleway", Font.PLAIN,18));
        p1.add(jl4);
        
        JLabel  jl5 = new JLabel(pack[5]);
        jl5.setBounds(30,250,250,30);
        jl5.setForeground(Color.black);
        jl5.setFont(new Font("raleway", Font.PLAIN,18));
        p1.add(jl5);
        
        JLabel  jl6 = new JLabel(pack[6]);
        jl6.setBounds(30,300,350,30);
        jl6.setForeground(Color.black);
        jl6.setFont(new Font("raleway", Font.PLAIN,18));
        p1.add(jl6);
        
        JLabel  jl7 = new JLabel(pack[7]);
        jl7.setBounds(30,350,250,30);
        jl7.setForeground(Color.black);
        jl7.setFont(new Font("raleway", Font.PLAIN,18));
        p1.add(jl7);
        
        JLabel  jl8 = new JLabel(pack[8]);
        jl8.setBounds(30,400,250,30);
        jl8.setForeground(Color.red);
        jl8.setFont(new Font("raleway", Font.PLAIN,18));
        p1.add(jl8);
        
        JLabel  jl9 = new JLabel(pack[9]);
        jl9.setBounds(60,450,250,30);
        jl9.setForeground(Color.black);
        jl9.setFont(new Font("raleway", Font.PLAIN,18));
        p1.add(jl9);
        
        JLabel  jl10= new JLabel(pack[10]);
        jl10.setBounds(160,500,250,30);
        jl10.setForeground(Color.red);
        jl10.setFont(new Font("raleway", Font.BOLD,18));
        p1.add(jl10);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image12.jpg"));
        Image img2 =img1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,900,600);
        p1.add(img);
        
        
        
        return p1;
    }
    
    public static void main(String[] args) {
        new Package();
    }
    
}
