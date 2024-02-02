import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
	
	public static void main(String[]args) throws Exception
	{
		
		Socket socket=new Socket("localhost",3000);
		
		BufferedReader keyIn=new BufferedReader(new InputStreamReader(System.in));//키보드에서 읽기
		PrintStream out=new PrintStream(socket.getOutputStream()); 
		BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		
		ClientThread thread=new ClientThread(socket);
		thread.start();
		
	
		String message="";
		while(!(message=keyIn.readLine()).equals("bye"))
		{
			out.println(message);
			System.out.println(in.readLine());
		}
		out.println(message); //bye를 보내기
		socket.close();
		
	}
	
	
}