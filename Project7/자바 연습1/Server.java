import java.io.*;
import java.net.*;
import java.util.*;

public class Server
{
	public static void main(String[]args) throws Exception
	{
		ServerSocket serverSocket=new ServerSocket(3000);
		ArrayList<Socket>clientList=new ArrayList<>();
		
		while(true){
			Socket socket=serverSocket.accept();
			
			ServerThread thread=new ServerThread(socket,clientList);
			thread.start();
			
		
		}
		
	}
	
}