package java2;

import java.util.Scanner;

public class JavaEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour=3600;
		int min=60;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a hours");
   int hours=sc.nextInt();
   System.out.println("Enter a minute");
   int minute=sc.nextInt();
   System.out.println("Enter a sec");
   int sec=sc.nextInt();
   int totalsec=hours*hour+minute*min+sec;
   System.out.println("Totalsec" +totalsec);
	}

}
