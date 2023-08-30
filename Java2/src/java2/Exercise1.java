package java2;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=10,num2=5,code=2,result=0;
switch(code) {
          case 1:result=num1+num2;break;
        
          case 3:result=num1*num2;break;
          case 4:result=num1/num2;break;
          default:System.out.println("Invalid input");
}
System.out.println("Result="+result);
	}

}
