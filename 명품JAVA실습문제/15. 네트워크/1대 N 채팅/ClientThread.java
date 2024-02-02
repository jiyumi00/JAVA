import java.io.*;
import java.net.*;
import java.util.*;

public class ClientThread extends Thread{

	private Socket socket;
	private BufferedReader in;
	
	public ClientThread(Socket socket) throws Exception //생성자로 던진다
	{
		this.in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		
	}
	public void run(){ //위에 타입을 따라야 한다 throws exception안됨
			
		try
		{
			while(true)
			{
				System.out.println(in.readLine());
				
			}
		}
		catch(Exception e)
		{
			
		}
	}
	

}