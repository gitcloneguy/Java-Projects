package journal;


import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ActualJournal {
	
	
	public static String setPass() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Set password");
		String password = encode(sc.nextLine());
		
		sc.close();
		return password;
	}
	
	public static String encode(String Password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		
		MessageDigest digest = MessageDigest.getInstance("SHA-512");
		  digest.reset(); 
		  digest.update(Password.getBytes("utf8"));
		  return Password = String.format("%064x", new BigInteger(1, digest.digest()));
		 	
	} 
	
	
	
	public static void login(String password) throws InterruptedException, NoSuchAlgorithmException, UnsupportedEncodingException {
		int tries = 0;

		Scanner sc = new Scanner(System.in);
		while(tries<5) {

			System.out.println("Enter password");
			String user = sc.nextLine();
			String userImput = encode(user);

			
			if(!userImput.equals(password)) {
				
				tries++;
			}
			
			if(userImput.equals(password)) {
				
				System.out.println("Correct Password");
				
				break;
				
			}
			
			else if(tries<5) {
				
				System.out.println("incorrect, try again. you have "+tries +"/5 incorrect entries");
			}
			
			else {
				System.out.println("you had 5/5 incorrect attempts. you must wait 5 seconds in order to try again.");
				tries=0;
				TimeUnit.SECONDS.sleep(5);
				
			}
		}
		sc.close();
	}
	
	

	public static void main(String []args) throws NoSuchAlgorithmException, UnsupportedEncodingException, InterruptedException {

		Scanner sc = new Scanner(System.in);
		
		String password = setPass();
		

		
		
		
		
			
			System.out.println("The journal will now lock.");
			
			
			login(password);
			
			
			
		
		
		sc.close();
	}
	

}
