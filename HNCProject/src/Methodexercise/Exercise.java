package Methodexercise;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    boolean condition=true;
   do { System.out.println("Enter hour");
    int hr=sc.nextInt();
    System.out.println("Enter minute");
    int min=sc.nextInt();
    System.out.println("Enter second");
    int sec=sc.nextInt();
    if((hr<=12)&&(min<=60)&&(sec<=60)) {
    	
    	condition=false;
    }
    else {
    	System.out.println("Enter the format(12:59:59)");
    	
    }
    long totaltime=hms_to_secs(hr,min,sec);
    System.out.println("Total second is:"+totaltime);
   
    
	} while(!condition);}
public static long hms_to_secs(int hr,int min,int sec) {
	int hrs=hr*3600;
	int minute=min*60;
	int totalsec=hrs+minute+sec;
	return totalsec;
}
}
