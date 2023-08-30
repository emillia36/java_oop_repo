package java2;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		
	do {
		System.out.println("Enter first value :");
		int a=sc.nextInt();
		System.out.println("Enter second value: ");
		int b=sc.nextInt();
		
		System.out.println("Enter '+' or'-' or '*' or '/' ");
		String condition=sc.next();
switch(condition) {
case"+":
	System.out.println("Sum of two number"+(a+b));break;
	
case"-":
	System.out.println("Sub of two number"+(a-b));break;
case"*":
	System.out.println("multi of two number"+(a*b));break;
case"/":
	System.out.println("divi of two number"+(a/b));
break;
default:
	System.out.println("Invalid input");
	flag=true;
}}
while(flag=true);
	}

}
