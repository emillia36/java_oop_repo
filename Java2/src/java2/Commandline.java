package java2;

public class Commandline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name=args[0];
int fnum=Integer.parseInt(args[0]);
int snum=Integer.parseInt(args[1]);
int sum=fnum+snum;

System.out.println("the first num is"+fnum);
System.out.println("the second num is "+snum);
System.out.println("the sum number is "+sum);
	}

}

