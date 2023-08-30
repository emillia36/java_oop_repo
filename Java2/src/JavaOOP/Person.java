package JavaOOP;

import java.util.Scanner;

public class Person {
String name;
int age;
	public Person() {
		name="Aung Aung";
		 age=30;
	}
public Person(String name,int age) {
	this.name=name;
	this.age=age;
}
public static void main(String[]args) {
	Person person1=new Person();
	System.out.println(person1.name+" "+person1.age);
	Person person2=new Person("Mg Mg",20);
	System.out.println(person2.name+" "+person2.age);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Student Name :");
	String stName=sc.nextLine();
	System.out.println("Enter Age");
	int stuAge =sc.nextInt();
	Person student=new Person(stName,stuAge);
	System.out.println(student.name+" "+student.age);
	}
}
