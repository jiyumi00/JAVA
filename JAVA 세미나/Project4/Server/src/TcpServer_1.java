import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket=null;
		Socket socket=null;
		try
		{
			serverSocket=new ServerSocket(9002);
			socket=serverSocket.accept();
			
			InputStream in=socket.getInputStream();
			OutputStream out=socket.getOutputStream();
			
			byte arr[]=new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
			String str="Hello, Client";
			
			out.write(str.getBytes());
			
			socket.close();
			serverSocket.close();
			
		}
		catch(Exception e)
		{
			
		}
	}

}
