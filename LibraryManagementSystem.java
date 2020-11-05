package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LibraryManagementSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public LibraryManagementSystem() {
		
                setSize(512, 218);
                setLayout(null);
                setLocation(20,20);

		l1 = new JLabel("");
                b1 = new JButton("Next");
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
		b1.setSize(150, 50);		
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/lib.jpg"));
                Image i3 = i1.getImage().getScaledInstance(512, 218,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
 		l1.setBounds(0, 0, 512, 218);
                
                l1.add(b1);
		add(l1);
                
                b1.addActionListener(this);
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login_user().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                LibraryManagementSystem window = new LibraryManagementSystem();
                window.setVisible(true);			
	}
}
