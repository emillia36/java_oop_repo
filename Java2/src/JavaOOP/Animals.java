package JavaOOP;

 class Animals {
String color="white";
String name;
int age;
Animals(){
	System.out.println("animal is created");
}
Animals(String name,int age){
	this.name=name;
	this.age=age;
}

public void display() {
	System.out.println("diplay method of animal class");
}
}
 class Dog extends Animals{
	 String color="black";
	 Dog(){
		 super();
		 System.out.println("dog is created");
	 }
	 Dog(String name,int age){
		 
		 super(name,age);
		 this.color=color;
	 }
	 public void getAnimals() {
			System.out.println("name is"+name+""+"Age is "+age+"color is"+color);
		}
	 public void display() {
		 System.out.println("display method of dog class");
	 }
	 void printcolor() {
		 System.out.println(color);
		 System.out.println(super.color);
		 display();
		 super.display();
	 }}
	class testsuper{
		 public static void main (String args[]) {
			 Dog d=new Dog();
			 d.printcolor();
			 Dog d1=new Dog();
			 d1.getAnimals();
		 }
	 


}
