import java.io.*;
import java.net.*;
import java.util.*;

public class FileInThread extends Thread
{
	private Socket socket_file;
	private InputStream in;
	private FileOutputStream fileOut;
	private MyListener client;
	
	public FileInThread(Socket socket_file,MyListener client)throws Exception
	{
		this.socket_file=socket_file;
		this.in=socket_file.getInputStream();
		this.fileOut=new FileOutputStream("testdown.jpg");
		this.client=client;
		
	}
	
	public void run() 
	{
		try
		{
			byte[]data=new byte[1024*8];
			int size;
			long fileSize=0;
			
			while((size=in.read(data))!=-1)
			{
				fileSize=fileSize+size;
				
				fileOut.write(data,0,size);
				fileOut.flush();
			}
			socket_file.close();
			client.abc(fileSize);
			
		}
		catch(Exception e){}
		
	}
	
}