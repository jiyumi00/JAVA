import java.io.*;
import java.net.*;
import java.util.*;

public class Server{
	
	public static void main(String[]args) throws Exception{
		
		
		ServerSocket serverSocket=new ServerSocket(4000);
		ServerSocket serverSocket_file=new ServerSocket(5000);
		
		
		
		System.out.println("connect wait...");
		ArrayList<Socket> socketArr=new ArrayList<Socket>(); 
		
		
		FileManager fileThread=new FileManager(serverSocket_file);////
		fileThread.start();
		
		
		while(true)
		{
			Socket socket=serverSocket.accept();
			
			ServerThread thread=new ServerThread(socket,socketArr);
			thread.start();
			
		}
		
		
		
		
		
	}
	
}