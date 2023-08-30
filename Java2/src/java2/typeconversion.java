package java2;

import java.util.Scanner;

public class typeconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a username");
String username=sc.nextLine();
System.out.println("Enter a password");
String password=sc.nextLine();
if(username.equals("mtdk")&& password.equals("mtdk36"))
{
	System.out.println("Correct username");
}else {
	System.out.println("Wrong");
}

	}

}
