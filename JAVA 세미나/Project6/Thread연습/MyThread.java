import java.io.*;
import java.net.*;

public class MyThread extends Thread{
	private Socket socket;
	
	public MyThread(Socket socket){
		this.socket=socket;
	}
	public void run() //throws IOException
	{
		
		try
		{
			OutputStream out=socket.getOutputStream();
			FileInputStream fileIn=new FileInputStream("test2.jpg");
			
			byte data[]=new byte[1024*8];
			int size;
			while((size=fileIn.read(data))!=-1)
			{
				out.write(data,0,size);
				out.flush();
			}
			socket.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}