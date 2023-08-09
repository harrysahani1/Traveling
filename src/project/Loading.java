
package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;


public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    String username;
    
    
    public void run(){
        
        try {
           for(int i=0; i<=100; i++){
               int max = bar.getMaximum();
               int value = bar.getValue();
               
               if(value<max){
                   bar.setValue(bar.getValue()+1);
               }else{
                   setVisible(false);
                   new Dashboard(username);
               }
               Thread.sleep(50);
           } 
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    Loading(String username){
        this.username=username;
        t=new Thread(this);
        setBounds(350,100,800,500);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/loading.jpg"));
        Image img2 =img1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,800,500);
        add(img);
        
        JLabel text = new JLabel("TRAVEL BOOKING SYSTEM");
        text.setBounds(60,20,500,30);
        text.setForeground(Color.darkGray);
        text.setFont(new Font("raleway", Font.BOLD,35));
        add(text);
        
        bar = new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        img.add(bar);
        
        JLabel loading = new JLabel("Loading Please wait......");
        loading.setBounds(230,180,180,50);
        loading.setForeground(Color.red);
        loading.setFont(new Font("raleway", Font.BOLD,15));
        img.add(loading);
        
        JLabel user = new JLabel("Welcome  "+ username);
        user.setBounds(30,300,400,50);
        user.setForeground(Color.red);
        user.setFont(new Font("raleway", Font.BOLD,15));
        img.add(user);
        
        t.start();
        
        
        setVisible(true);
        
    }
    
    
    public static void main(String[] args) {
        new Loading("");
    }
    
}
