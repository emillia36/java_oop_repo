package java2;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter your firstname");
  String firstname=sc.next();
  System.out.println("Enter your last name");
  String lastname=sc.next();
  System.out.println("Full name : "+firstname+lastname);
	}

}

