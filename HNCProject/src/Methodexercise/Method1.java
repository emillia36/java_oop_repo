package Methodexercise;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter a number");
   int num=sc.nextInt();
   multiplication(num);
	}
public static void multiplication(int num) {
	for(int i=1;i<=12;i++) {
		System.out.println(num+"*"+ i +" = "+(num*i));
	}
}
}
