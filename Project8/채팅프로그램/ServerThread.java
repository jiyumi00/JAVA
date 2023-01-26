import java.io.*;
import java.net.*;
import java.util.*;

public class ServerThread extends Thread{
	
	private Socket socket;
	private BufferedReader in;
	private PrintStream out;
	private ArrayList<Socket>socketArr;//
	private String address;
	
	public ServerThread(Socket socket,ArrayList<Socket>socketArr)throws Exception//
	{
		this.socket=socket;
		this.in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		this.out=new PrintStream(socket.getOutputStream());
		this.socketArr=socketArr;
		this.address=socket.getInetAddress().toString();
		
		System.out.println("["+this.address+"님이 접속하였습니다]"); //connect success
		
		this.socketArr.add(socket);//
		System.out.println("size= "+socketArr.size());
	}
	
	public void run()
	{
		try
		{
			
			String message="";
			while(!(message=in.readLine()).equals("bye"))
			{
				System.out.println(this.address+": "+message);//서버로 출력	
				
				broadCast(this.address+": "+message); //out.println(this.address+": "+message); //서버로 보내는 
				 
			}
			
			this.socketArr.remove(this.socket);
			System.out.println("["+this.address+"님이 퇴장하였습니다]"); //connect success
			this.socket.close();
		}
		catch(Exception e)
		{
		}
	}
	public void broadCast(String message) throws Exception
	{
		for(Socket socket : this.socketArr)
		{
			PrintStream out=new PrintStream(socket.getOutputStream());
			
			if(this.socket!=socket)
			{
				//PrintStream out=new PrintStream(socket.getOutputStream());
				out.println(message);
			}
			
		}
	}
}