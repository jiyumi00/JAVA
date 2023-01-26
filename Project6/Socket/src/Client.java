import java.io.*;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket=null;
		try
		{
			socket=new Socket("192.168.0.17",9000); //ip번호, port번호
			System.out.println("server connect!");
			
			InputStream in=socket.getInputStream();
			OutputStream out=socket.getOutputStream();
			
			String str="Hello";
			out.write(str.getBytes());
			
			byte arr[]=new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
			
			
			socket.close();
			
		}
		catch(Exception e)
		{
			
		}
	}

}
