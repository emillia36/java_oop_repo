package JavaOOP;

public class Student{
public Student() {
		System.out.println("Student Constractor");
	}
	
public Student(String name) {
	System.out.println("Name is "+name);
}
public static void main (String[] args) {
	
	Student st =new Student("Maung Maung");
	Student st1=new Student();
	Student st2 =new Student("Aung Aung");
}
}