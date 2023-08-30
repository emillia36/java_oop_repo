package java2;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=10,num2=5,result=0;
char code='-';
switch(code) {
case'+':result=num1+num2;break;
case'-':result=num1-num2;break;
case'*':result=num1*num2;break;
case'/':result=num1/num2;break;
default:System.out.println("Invalid input");
}
System.out.println("Result="+result);
	}

}
