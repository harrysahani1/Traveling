/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * 
 * @author harry sahani
 */
public class About extends JFrame implements ActionListener{
    About(){
        setBounds(400,100,500,600);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel about = new JLabel("About");
        about.setBounds(200,10,200,40);
        about.setFont(new Font("ARIAL", Font.BOLD,25));
        about.setForeground(Color.black);
        add(about);
        
        
        String txt = "About Project \n"+
                " \n"+
                "The objective of The project Trevel Booking System is to develop a system that automates the process and activity of a trevel and the purpose is to design a system using which one can perform all operations releted to treveling. \n\n "+
                "This application will help in accessing the information releted to the trevel to the particular destination with great ease. The users can track the information releted to their tours with great ease through this application. The trevel agency information can also be obtained through this application.\n\n"+
                "Advantages of  Project \n\n"+
                "Gives accurate information \n"+
                "Simplifies the manual work \n"+
                "Its minimizes the documentation related work \n"+
                "Provides up to date information \n"+
                "Friendly ecviorment by providing warning messages \n"+
                "Travels details can be provided \n"+
                "Booking Confimation notification";
        
        TextArea area = new TextArea(txt, 10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,350);
        add(area);
        
        
        JButton back = new JButton("Back");
        back.setBackground(Color.white);
        back.setForeground(new Color(1,1,102));
        back.setFont(new Font("ARIAL", Font.BOLD,12));
        back.setBounds(190,470,100,30);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    public static void main(String[] args) {
        new About();
    }
    
}
