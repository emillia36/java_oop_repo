package Vehicle;

public class Car{
	public String name;
	public int age;
	public Car() {
		//When super keyword is used,this constructor is called
	}
	public void getName(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println(name+" "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
