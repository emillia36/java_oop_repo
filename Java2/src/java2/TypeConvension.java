package java2;

import java.util.Scanner;

public class TypeConvension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		

	System.out.println("Enter username");
	
	String username=sc.nextLine();
	System.out.println("Enter password");
	String password=sc.nextLine();
	if(username.equals("aungaung")&& password.equals("123")) {
		System.out.println("Correct username");
	
	}
	else 
	{
		System.out.println("Username and password is not correct");
	}

}

}