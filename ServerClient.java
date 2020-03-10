import java.io.*;
	import java.net.*;
	
public class ServerClient {
	
	  public static void main(String[] args) throws IOException  {
		ServerSocket sersock = new ServerSocket(3000);
	      System.out.println("Server  ready for chatting");
	      System.out.println("The ip clients can connecct to is: " +Inet4Address.getLocalHost().getHostAddress());
	      System.out.println("Note: you have to allow java past the firewall, else it wont work apart from local");
	      Socket sock = sersock.accept( );                          
	                              // reading from keyboard (keyRead object)
	      BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
		                      // sending to client (pwrite object)
	      OutputStream ostream = sock.getOutputStream(); 
	      PrintWriter pwrite = new PrintWriter(ostream, true);

	                              // receiving from server ( receiveRead  object)
	      InputStream istream = sock.getInputStream();
	      BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

	      String receiveMessage, sendMessage;               
	      while(true) {
	        if((receiveMessage = receiveRead.readLine()) != null)  
	        {
	           System.out.println(receiveMessage);         
	        }         
	        sendMessage = keyRead.readLine(); 
	        pwrite.println(sendMessage);             
	        pwrite.flush();
	      }
	      
	    }                    
	}                        

