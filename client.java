import java.io.*;
	import java.net.*;
import java.util.Scanner;
public class client {
	
	
	  public static void main(String[] args) throws Exception
	  {
		  Scanner sc = new Scanner(System.in);

	     System.out.println("Whats the ip you would like to connect to?");
	     @SuppressWarnings("resource")
		Socket sock = new Socket(sc.nextLine(), 3000);
	   
	                               // reading from keyboard (keyRead object)
	     BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
	                              // sending to client (pwrite object)
	     OutputStream ostream = sock.getOutputStream(); 
	     PrintWriter pwrite = new PrintWriter(ostream, true);

	                              // receiving from server ( receiveRead  object)
	     InputStream istream = sock.getInputStream();
	     BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

	     System.out.println("Start the chitchat, type and press Enter key");

	     String receiveMessage, sendMessage;               
	     while(true)
	     {
	        sendMessage = keyRead.readLine();  // keyboard reading
	        pwrite.println(sendMessage);       // sending to server
	        pwrite.flush();                    // flush the data
	        if((receiveMessage = receiveRead.readLine()) != null) //receive from server
	        {
	            System.out.println(receiveMessage); // displaying at DOS prompt
	        }  
	        sc.close();
	      }
	    }                    
	}                        

