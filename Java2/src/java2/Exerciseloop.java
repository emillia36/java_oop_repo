package java2;

public class Exerciseloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
		      for(int a=1; a<=i; a++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
		    
		    
		    for(int i=1; i<=10; i++) {
		      for(int a=10; a>=i; a--) {
		        System.out.print("*");
		      }
		      System.out.println();
		    
			    }
			  
		    for(int i=1; i<=10; i++) {
			      for(int a=1; a<=i; a++) {
			        System.out.print(" ");
			      }
				      for(int a=10; a>=i; a--) {
					        System.out.print("*");
					      }
				      System.out.println();
				      }
		    for(int i=1; i<=10; i++) {
		        for(int a=10; a>=i; a--) {
		          System.out.print(" ");
		        }
		        for(int a=1; a<=i; a++) {
		          System.out.print("*");
		        }
		      
		        System.out.println();
		      
		      }
		    
	}

}
