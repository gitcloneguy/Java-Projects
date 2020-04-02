package main.src.main.java;
import java.util.*;
public class AdditionAndSubsctraction {

	public static void main(String[] args) {
		int score = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please select addition, substraction, division, or multiplication.");
		
		String sign = sc.nextLine();
		
		System.out.println("What would you like to be the max for the numbers? (I.e. x - x)");
		
		int max = sc.nextInt();
		
		System.out.println("how many questions would you like?");
	
			int q = sc.nextInt();
			long startTime = System.nanoTime();
			int[] answers = new int[q];
			
			if(sign.equals("multiplication")) {
				while(i!=q) {
					Random rd = new Random();
					
					int a = rd.nextInt(max);
					int b = rd.nextInt(max);
					int c = a * b;

					try {
					System.out.println("what is " +a +" × " +b +" =");
					answers[i] = c;
					
					if(sc.nextInt()==c) {
						score++;
					}
					}
					catch(Exception e) {
						System.out.println("Invalid imput, please re-run program");
					}
					
					
					i++;
					
				 }
			}
			
			if(sign.equals("division")) {
				while(i!=q) {
					Random rd = new Random();
					
					int a = rd.nextInt(max);
					int b = rd.nextInt(max);
					int c = a / b;

					try {
					System.out.println("what is " +a +" ÷ " +b +" =");
					answers[i] = c;
					
					if(sc.nextInt()==c) {
						score++;
					}
					}
					catch(Exception e) {
						System.out.println("Invalid imput, please re-run program");
					}
					
					
					i++;
					
				 }
			}
		
			
			if(sign.equals("substraction")) {
				
				while(i!=q) {
					Random rd = new Random();
					
					int a = rd.nextInt(max);
					int b = rd.nextInt(max);
					int c = a - b;

					try {
					System.out.println("what is " +a +" - " +b +" =");
					answers[i] = c;
					
					if(sc.nextInt()==c) {
						score++;
					}
					}
					catch(Exception e) {
						System.out.println("Invalid imput, please re-run program");
					}
					
					
					i++;
					
				 }
			}
			
			if(sign.equals("addition")) {

		while(i!=q) {
		Random rd = new Random();
		
		int a = rd.nextInt(max);
		int b = rd.nextInt(max);
		int c = a + b;

		try {
		System.out.println("what is " +a +" + " +b +" =");
		answers[i] = c;
		
		if(sc.nextInt()==c) {
			score++;
		}
		}
		catch(Exception e) {
			System.out.println("Invalid imput, please re-run program");
		}
		
		
		i++;
		
	 }
			}
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		double seconds = (double)duration / 1_000_000_000.0;
		
		System.out.println("You took " +seconds +" seconds to finish");
		System.out.println("your score is "+score +" / " +q);
		
		if(score!=q) {
			System.out.println("The correct answers, in order are: ");
		for(int x: answers) {
			System.out.println(x);
		}
		}
		
		sc.close();
		

	}

}
