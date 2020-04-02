package uuuu;
import java.util.Scanner;
public class Tip {
		public static void main(String[] args) {
			

			
			try {
			Scanner sc = new Scanner(System.in); //summon scanner
			
			System.out.println("Enter Subtotal."); //asking user for subtotal
			
			double sub = sc.nextDouble(); // read/store in the double sub the subtotal that the user entered
			System.out.println("Enter tip amount (without percentage)");
			
			long startTime = System.nanoTime();
			
			double tip= sc.nextDouble(); //read/store in double tip the amount of tip
			double d=sub*tip/100; //calculate the tip by using formula subtotal*percentageDesired/100
			double j=d+sub; // calculate total after tip
			
			long endTime = System.nanoTime();
			long duration = (endTime - startTime);
			double seconds = (double)duration / 1_000_000_000.0;
			System.out.println(seconds);
			
			System.out.println("Tip is "+d +" And total is "+j +". computing tip took "+seconds +" second(s)");
			sc.close();
			
			
			}
			
			catch(Exception e) {
				System.out.println("That is an invalid imput/the number is too big."); 
			}
			
			
			
			
		}
}