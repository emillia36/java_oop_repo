package Abstraction;

public class salary extends Employee{
	double Salary;

	salary(String name, String address, int number, double Salary) {
		super(name, address, number);
		
		salary(Salary);
		this.Salary=Salary;
		// TODO Auto-generated constructor stub
	}
	
	public void setsalary(double Salary) {
		if (Salary>=0.0) {
			this.Salary=Salary;
		}
	}
	public double getSalary() {
		return this.Salary;
	}
	@Override
	public double ComputePay() {
		// TODO Auto-generated method stub
		System.out.println("Employee name :");
		double result=Salary/52;
		return result;
	}

	
	

}
