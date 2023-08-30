package Array;

import java.util.Scanner;

public class ArrayExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of row : ");
int row= sc.nextInt();
System.out.println("Enter the number of coulmn");
int col=sc.nextInt();
int[][] A=new int[row][col];
for(int i=0;i<col;i++) {
	for(int j=0;j<col;j++) {
		System.out.println("Enter a value : ");
		A[i][j]=sc.nextInt();
		
	}
}
System.out.println("Display data array");
for(int i=0;i<A.length;i++) {
	for(int j=0;j<A[i].length;j++) {     //A.length=the number of row
		System.out.println(A[i][j]+"");   //A[i].length=
		System.out.println();
	}
}
}

}
