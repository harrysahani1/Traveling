
package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Payment extends JFrame implements ActionListener{
    JButton payment,back;
    
    Payment(){
        setBounds(350,100,800,600);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image21.jpg"));
        Image img2 =img1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,800,600);
        add(img);
        
        
        payment = new JButton("Pay");
        payment.setBackground(Color.white);
        payment.setForeground(new Color(1,1,102));
        payment.setFont(new Font("ARIAL", Font.BOLD,12));
        payment.setBounds(250,400,100,30);
        payment.addActionListener(this);
        img.add(payment);
        
        back = new JButton("Back");
        back.setBackground(Color.white);
        back.setForeground(new Color(1,1,102));
        back.setFont(new Font("ARIAL", Font.BOLD,12));
        back.setBounds(500,400,100,30);
        back.addActionListener(this);
        img.add(back);
        
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == payment){
            setVisible(false);
            new Gpay();
        }else{
            setVisible(false);
        }
        
    }
    
    
    public static void main(String[] args) {
        new Payment();
    }
    
}
