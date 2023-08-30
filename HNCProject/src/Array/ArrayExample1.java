package Array;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String name[]= {"Su Su","Hla hla","Aye Aye","Mg Mg","Zin Zin"};
    int marks[]= {99,98,57,40,20};
    for(int i=0;i<name.length;i++) {
    	if (marks[i]>=50) {
    		System.out.println(name[i]+" : Pass");
    	
    	}
    	else
    		System.out.println(name[i]+" : Fail");
    }
    		
	}

}
