package gui;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MessageBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//System.out.println("Enter username");
//String username=sc.nextLine();
//System.out.println("Enter Password : ");
//String pw=sc.next();
		String username="Admin";
		String pw="123!@#";
if(username.equals("Admin")&& pw.equals("123!@#"))
	JOptionPane.showMessageDialog(null, "login Successful");
else {
	JOptionPane.showMessageDialog(null, "Invalid login","Login error",JOptionPane.ERROR_MESSAGE);
JOptionPane.showMessageDialog(null, "Invalid login","Login error",JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null, "Invalid login","Login error",JOptionPane.PLAIN_MESSAGE);
JOptionPane.showMessageDialog(null, "Invalid login","Login error",JOptionPane.QUESTION_MESSAGE);

	}
int option=JOptionPane.showConfirmDialog(null,"Do another yes or no");
if(option==0)
	JOptionPane.showConfirmDialog(null,"Do you remove item?","Delete title",JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
	
	else if(option==1)
		JOptionPane.showMessageDialog(null,"NO");
	else if(option==2)
		JOptionPane.showMessageDialog(null,"Cancel");
int yes=JOptionPane.YES_OPTION;
int no=JOptionPane.NO_OPTION;
int cancel=JOptionPane.CANCEL_OPTION;
JOptionPane.showMessageDialog(null,yes+" "+no+" "+cancel);
String name=JOptionPane.showInputDialog(null,"Enter your name");
String age=JOptionPane.showInputDialog(null, "Enter your age", "Age title",JOptionPane.INFORMATION_MESSAGE);
if(name.equals("Admin")&& age==("34"))
	JOptionPane.showMessageDialog(null, "Login successfully");

}}
