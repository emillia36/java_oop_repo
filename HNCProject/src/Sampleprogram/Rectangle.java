package Sampleprogram;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scwidth=new Scanner(System.in);
 System.out.println("Enter width:");
 int width=scwidth.nextInt();
 
 Scanner scheight=new Scanner(System.in);
 System.out.println("Enter height:");
 int height=scheight.nextInt();

 int area=width*height;
 System.out.println("Area of traingle ="+ area);
	}

}
