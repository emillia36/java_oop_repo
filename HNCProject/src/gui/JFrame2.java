package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     JFrame frame=new JFrame();
     frame.setVisible(true);
     frame.setSize(new Dimension(500,350));
     frame.setLocation(new Point(300,100));
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setBackground(Color.white);
     frame.setTitle("Window Page");
     frame.setLayout(new BorderLayout());
     frame.setIconImage(new ImageIcon("src/ic.jpg").getImage());
     frame.setLayout(new BorderLayout());
     
     JButton btnlogin=new JButton();
     btnlogin.setText("Login Button");
     btnlogin.setBackground(Color.blue);
     frame.add(btnlogin,BorderLayout.EAST);
     JButton btncancel=new JButton();
     btncancel.setText("Cancel Button");
     btncancel.setBackground(Color.blue);
     frame.add(btncancel,BorderLayout.NORTH);
     
     JTextField txtname=new JTextField();
     txtname.setText("Admin User");
     txtname.setColumns(10);
     txtname.setBackground(Color.red);
     frame.add(txtname,BorderLayout.WEST);
     
     JButton btnok=new JButton();
     btnok.setText("OK");
    
     btnok.setBackground(Color.gray);
     frame.add(btnok,BorderLayout.SOUTH);
     
     JButton btnclick=new JButton();
     btnclick.setText("Click Me");
   
     btnclick.setBackground(Color.CYAN);
     frame.add(btnclick,BorderLayout.CENTER);
  
	}

}
