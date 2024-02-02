import java.io.*;
import java.net.*;
import java.util.*;

public class ServerThread extends Thread{
	private Socket socket;
	private BufferedReader in;
	//private PrintStream out; //run이 simple해진다 
	private String address;
	private ArrayList<Socket> clientList;
	
	public ServerThread(Socket socket,ArrayList<Socket>clientList) throws Exception //생성자로 던진다
	{
		this.socket=socket;
		this.in=new BufferedReader(new InputStreamReader(socket.getInputStream())); //소켓으로 부터 문자열 받기
		//this.out=new PrintStream(socket.getOutputStream());// 소켓으로 보내기
		this.address=socket.getInetAddress().toString();
		this.clientList=clientList;
		System.out.println(address +" is connected");
		this.clientList.add(socket);
		System.out.println("size= "+clientList.size());/////////
		
		
	}
	public void run(){ //위에 타입을 따라야 한다 throws exception안됨
			
		try
		{
			String message="";
			while(!(message=in.readLine()).equals("bye"))
			{
				System.out.println(this.address+": "+message); //서버로 
				
				broadCast(this.address+": "+message); //out.println(address+": "+message);
			
			}
			this.clientList.remove(this.socket);
			System.out.println(address +" is disconnected");
			
			System.out.println("size= "+clientList.size());////////////
			
			this.socket.close();
		}
		catch(Exception e) {}
	}
	
	private void broadCast(String message) throws Exception{
		
		for(Socket socket : this.clientList)
		{
			if(this.socket!=socket)
			{
				PrintStream out=new PrintStream(socket.getOutputStream());
				out.println(message);
			}
			
		}
	}
}