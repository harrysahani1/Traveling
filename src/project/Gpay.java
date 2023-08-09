
package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;


public class Gpay extends JFrame implements ActionListener{
    
    Gpay(){
        setBounds(300,100,800,600);
        
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        
        try {
            pane.setPage("https://pay.google.com/about/");
            
        } catch (Exception e) {
            pane.setContentType("text/html");
            pane.setText("<html>Could not load error 404 </html>");
        }
        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);
        
        
        JButton back = new JButton("Back");
        back.setBackground(Color.white);
        back.setForeground(new Color(1,1,102));
        back.setFont(new Font("ARIAL", Font.BOLD,12));
        back.setBounds(650,20,100,30);
        back.addActionListener(this);
        pane.add(back);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Payment();
        
    }
    
    public static void main(String[] args) {
        new Gpay();
    }
    
}
