import java.net.*;
import java.io.*;

import java.io.*;
import java.net.*;

public class Server
{
    public static void main(String[]args) throws Exception
    {
        ServerSocket serverSocket=new ServerSocket(8001); 
		System.out.println("connect wait...");
		
		while(true){
			Socket socket=serverSocket.accept();
			System.out.println("[connect sucess]");
		
			MyThread myThread=new MyThread(socket);
			myThread.start();
		}
    }
}