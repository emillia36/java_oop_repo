package Abstraction;

public abstract class Employee {
private String name;
public String address;
private int number;
Employee(String name,String address,int number){
	this.name=name;
	this.address=address;
	this.number=number;
}
public abstract double ComputePay();
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public String getaddress() {
	return address;
}
public int getnumber() {
	return number;
}

}
