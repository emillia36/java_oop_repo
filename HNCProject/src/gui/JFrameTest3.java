package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  JFrame frame=new JFrame();
  frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(new Dimension(500,350));
  frame.setLocation(new Point(300,100));
  frame.setTitle("GridLayout Page");
  frame.setIconImage(new ImageIcon("src/ic.jpg").getImage());
  frame.setLayout(new GridLayout());
  JButton btnlogin=new JButton();
  btnlogin.setText("Login Button");
  btnlogin.setBackground(Color.blue);
  frame.add(btnlogin);
  JButton btncancel=new JButton();
  btncancel.setText("Cancel Button");
  btncancel.setBackground(Color.red);
  frame.add(btncancel);
  JLabel lbl=new JLabel();
  lbl.setText("hello world");
  lbl.setForeground(Color.red);
  frame.add(lbl);
  JButton btnOk=new JButton();
  btnOk.setText("Ok");
  btnOk.setBackground(Color.blue);
  frame.add(btnOk);
	}

}
