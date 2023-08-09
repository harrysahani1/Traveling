
package project;
import java.awt.Image;
import javax.swing.*;

public class Splash extends JFrame implements Runnable{
    Thread thread;
    Splash(){
//        setSize(1200,600);
//        setLocation(100,50);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image1.jpg"));
        Image img2 =img1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        add(img);
        setVisible(true); 
        thread = new Thread(this);
        thread.start();
    }
    public  void run(){
        try {
            Thread.sleep(5000);
//            new Login();
            setVisible(false);
            new Login();
        } catch (Exception e) {
        }
        
    
    }
    public static void main(String[] args) {
       Splash frame = new Splash();
       int x=1;
       for(int i=1; i<500; x+=8,i+=6 ){
           frame.setLocation(750-(x+i)/2,400-(i/2));
           frame.setSize(x+i,i);
           try {
               Thread.sleep(10);
               
           } catch (Exception e) {
           }
       }
        
    }
}
