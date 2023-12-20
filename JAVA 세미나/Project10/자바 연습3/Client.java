import java.io.*;
import java.net.*;

public class Client{
	
	public static void main(String[]args)throws Exception{
		
		Socket socket=new Socket("localhost",9000);
		
		BufferedReader keyIn=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(socket.getOutputStream());
		
		String message="";
			
		while(!(message=keyIn.readLine()).equals("bye"))
		{
			out.println(message);
				
		}
		out.println(message);
		
		
		//socket.close();
		
	}
	
}