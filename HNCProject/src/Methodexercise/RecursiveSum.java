package Methodexercise;

import java.util.Scanner;

public class RecursiveSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter sum number : ");
    int num=sc.nextInt();
    System.out.println("total = "+ Sum(num));
	}
public static int Sum(int n) {
	if(n==1)
		return 1;
	else
	return n+ Sum(n-1);
}
}
