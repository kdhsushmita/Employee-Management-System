package EmployeeManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener { 
    
    Splash() {
        
        getContentPane().setBackground(Color.WHITE);  //getcontentPane allows accessing whole frame
        setLayout(null); //no following any custom layout
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM"); //component
        heading.setBounds(80, 30, 1200, 60); 
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);
        add(heading);//adding component in frame
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg")); //for adding icons
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);//scaling img
        ImageIcon i3 = new ImageIcon(i2); //converting into imageicon
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image); //directly i3 lai add garna mildaina so using JLabel
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        
        setSize(1170, 650); //length & width of frame
        setLocation(200, 50); //bydefault loc top left huncha , this to set location(dist from left,dist from top)
        setVisible(true);//need to set true because by default false huncha
        
        //infinite while loop
        while(true) {
            heading.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                
            }
            
            heading.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                
            }
        }
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false); //closing current frame 
        new Login();
    }
    
    public static void main(String args[]) {
        new Splash();
    }
}