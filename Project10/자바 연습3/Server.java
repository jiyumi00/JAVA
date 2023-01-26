import java.io.*;
import java.net.*;

public class Server{
	
	public static void main(String[]args) throws Exception{
		
		ServerSocket serverSocket=new ServerSocket(9000);
		System.out.println("connect wait...");
		
		while(true)
		{
			Socket socket=serverSocket.accept();
			ServerThread thread=new ServerThread(socket);
			thread.start();
		}
		
		
		
		//socket.close();
		
	}
}