package java2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc=new Scanner(System.in);
	 boolean flag=false;
	 do {
	 System.out.println("Enter First num");
	 int num1=sc.nextInt();
	 System.out.println("Enter Second num");
	 int num2=sc.nextInt();
	 System.out.println("Enter + or - or * or /");
	 String condition=sc.next();
	  switch (condition) {
	  case"+" :System.out.println(num1+num2);break;
	  case"-" :System.out.println(num1-num2);break;
	  case"*" :System.out.println(num1*num2);break;
	  case"/" :System.out.println(num1/num2);break;
	  default :
	  System.out.println("Invalid input");
	  }}while (flag=true);
	 
	}

}
