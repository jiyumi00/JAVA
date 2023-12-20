import java.io.*;
import java.net.*;

public class ServerThread extends Thread{
	
	private Socket socket;
	private String address;
	private BufferedReader in;
	private PrintStream keyOut;
	
	public ServerThread(Socket socket) throws Exception
	{
		this.socket=socket;
		this.in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		this.keyOut=new PrintStream(System.out);
		this.address=socket.getPortAddress().toString();
	}
	public void run()
	{
		try
		{
			System.out.println("["+address+"님이 접속하였습니다]");
			String message="";
			while(!(message=in.readLine()).equals("bye"))
			{
				
				keyOut.println(this.address+": "+message);
			}
			System.out.println("["+address+"님이 퇴장하였습니다]");
			socket.close();
		}
		catch(Exception e) {}
	}
}