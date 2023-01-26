import java.io.*;
import java.net.*;
import java.util.*;

public class ClientThread extends Thread
{
	private BufferedReader in;
	
	
	public ClientThread(Socket socket)throws Exception
	{
		
		this.in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
	}
	
	public void run()
	{
		try
		{
			while(true)
			{
				System.out.println(in.readLine());
			}
			
			
		}
		catch(Exception e){}
		
	}
	
}