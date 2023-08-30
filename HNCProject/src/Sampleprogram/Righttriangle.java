package Sampleprogram;

import java.util.Scanner;

public class Righttriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc_h=new Scanner(System.in);
System.out.println("Enter the hypotenuse:");
int h=sc_h.nextInt();
Scanner sc_p=new Scanner(System.in);
System.out.println("Enter the perpendicular:");
int p=sc_p.nextInt();
Scanner sc_b=new Scanner(System.in);
System.out.println("Enter the base:");
int b=sc_b.nextInt();
if (h*h==(p*p)+(b*b)) {
	
	System.out.println("Right triangle ");
	
}
else {
	System.out.println("Not Right Triangle");
}



	}

}
