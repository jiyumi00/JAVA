import java.io.*;
import java.net.*;
import java.util.*;

public class FileManager extends Thread
{
	private ServerSocket serverSocket_file;
	
	public FileManager(ServerSocket serverSocket_file)throws Exception
	{
		
		this.serverSocket_file=serverSocket_file;
	}
	
	public void run()
	{
		try
		{
			while(true){
				Socket socket = serverSocket_file.accept();
			
				FileOutThread fileOutThread = new FileOutThread(socket);
				fileOutThread.start();
			}
			
		}
		catch(Exception e) {}
	}
	
}