package JavaOOP;

public class vehicle {
protected String brand="ford";
	public void honk() {
		System.out.println("Tuut,tuut!");
	}
}
	class Car extends  vehicle{
		private String modelName="Mustang";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car myCar=new Car();
        myCar.honk();
        System.out.println(myCar.brand+""+myCar.modelName);
	}}
