import java.io.*;
import java.net.*;

public class TCPClient {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			Socket socket=new Socket("192.168.0.17",9000);
			
			BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			System.out.println("보내기>> ");
			String outputMessage=reader.readLine(); //키보드에서 문자 보내기
			
			out.write(outputMessage);
			out.flush();
			
			String inputMessage=in.readLine();
			System.out.println("Server : "+inputMessage);
			
			socket.close();
			in.close();
			out.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
