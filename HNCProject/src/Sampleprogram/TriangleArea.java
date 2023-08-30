package Sampleprogram;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter base :");
 int base=sc.nextInt();
 System.out.println("Enter height");
 int height=sc.nextInt();
 int Area=(base*height)/2;
 System.out.println("Triangle Area:"+Area);
	}

}
