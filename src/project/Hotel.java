
package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hotel extends JFrame implements Runnable{
    Thread t1;
    JLabel jl1, jl2, jl3,  jl4, jl5, jl6, jl7, jl8, jl9, jl10;
    
    JLabel[] label = new JLabel[]{jl1, jl2, jl3,  jl4, jl5, jl6, jl7, jl8, jl9, jl10};
    JLabel caption;
    public void run(){
        
        String[] text = new String[]{"Ritz-Carlton Hotel","Marriott","The Luxury Collection Hotels & Resorts","St Regis Hotels","Hyatt","Rosewood Hotels & Resorts","Aman Resorts","Four Seasons","RIver view hotel","Taj hotel"};
        try {
            for(int i=0; i<=9 ; i++){
                label[i].setVisible(true);
                caption.setText(text[i]);
                Thread.sleep(2000);
                label[i].setVisible(false);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    Hotel(){
        setBounds(400,100,800,600);
        
        caption = new JLabel();
        caption.setBounds(50,500,1000,70);
        caption.setForeground(Color.white);
        caption.setFont(new Font("ARIAL", Font.BOLD,20));
        add(caption);
        
        
        ImageIcon img1=null, img2=null, img3=null, img4=null, img5=null, img6=null, img7=null, img8=null, img9=null, img10=null;
        ImageIcon[] image = new ImageIcon[]{img1, img2, img3, img4, img5, img6, img7, img8, img9, img10};
        
        
        Image imgj1=null, imgj2=null, imgj3=null, imgj4=null, imgj5=null, imgj6=null, imgj7=null, imgj8=null, imgj9=null, imgj10=null;
        Image[] jimage = new Image[]{imgj1, imgj2, imgj3, imgj4, imgj5, imgj6, imgj7, imgj8, imgj9, imgj10};
        
        ImageIcon imgk1=null, imgk2=null, imgk3=null, imgk4=null, imgk5=null, imgk6=null, imgk7=null, imgk8=null, imgk9=null, imgk10=null;
        ImageIcon[] kimage = new ImageIcon[]{imgk1, imgk2, imgk3, imgk4, imgk5, imgk6, imgk7, imgk8, imgk9, imgk10};
        
        for(int i=0; i<=9 ; i++){
        
        image[i] =new ImageIcon(ClassLoader.getSystemResource("image/icon"+(i+1)+".jpg"));
        jimage[i] =image[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        kimage[i] =new ImageIcon(jimage[i]);
        label[i]= new JLabel(kimage[i]);
        label[i].setBounds(0,0,800,600);
        add(label[i]);
        
        }
        
        t1 = new Thread(this);
        t1.start();
        
        setVisible(true);
        
    }
    
    
    
    public static void main(String[] args) {
        new Hotel();
    }
    
}
