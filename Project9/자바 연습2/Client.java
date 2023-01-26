import java.io.*;
import java.net.*;

public class Client{
	
	public static void main(String[]args)throws Exception {
		
		Socket socket=new Socket("localhost",80);
		
		PrintStream out=new PrintStream(socket.getOutputStream());
		InputStream in=socket.getInputStream();
		
		out.println("GET / HTTP/1.1");
		out.println("");
		
		
		byte[]data=new byte[1024];
		
		int size=in.read(data);
		System.out.println(new String(data,0,size));
		
		socket.close();
	}
	
}