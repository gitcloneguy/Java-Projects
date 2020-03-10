import java.util.Scanner;
public class Col {
		public static void main(String args[]) {
			
			try(Scanner sc = new Scanner(System.in)) {
			int c=21;
			while(c==21) {
				 double x;
			      double y;
			    
				    System.out.println("Enter 1st number");

				    double num1 = sc.nextDouble();
				    System.out.println("enter 2nd number");
				    double num2 = sc.nextDouble();
			   
				    
				    x=num1;
				    y=num2;
				    double a=x+y;
				    double d=x/y;
				    double m=x*y;
				    double s=x-y;
				    double mod=x%y;
				    
				    
				    System.out.println("______________________________");
			    
			    
			    	System.out.println("The addition answer is "+a);
			        
			        System.out.println("The subtraction answer is "+s);
			        	        
			        System.out.println("The multplication answer is "+m);
			   
			        System.out.println("The Division answer is "+d);
			        if(mod==0) {
			        	System.out.println("There is no Remainder/Mod");
			        }
			        else {
			        	System.out.println("The Remainder/Mod is "+mod);
			        }
			 }
			}
		   catch(Exception e) {
			   System.out.println("That is an invalid imput/the number is too large.");
		   }
		  
		}
	}                                                                                                          

