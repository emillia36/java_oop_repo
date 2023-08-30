package Methodexercise;

import java.util.Scanner;

public class RecursiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array room");
int room=sc.nextInt();
int A[]=new int[room];
for(int i=0;i<room;i++) {
	System.out.println("Enter the value for room");
	A[i]=sc.nextInt();
	int totalsum=sum(A,A.length-1);
	System.out.println("The result of the sum is"+totalsum);
}
}
public static int sum(int A[],int b) {
	if(b==0) {
		return A[0];
		
	}
	else
		return A[b]+sum(A,b-1);
}	

}
