import java.io.*;
import java.net.*;

public class TCPServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ServerSocket listener=null;
		//Socket socket=null;
		try
		{
			ServerSocket listener=new ServerSocket(9000); //서버소켓 생성
			System.out.println("wait...");
			Socket socket=listener.accept(); //클라이언트로부터 접속대기
			System.out.println("[connect success]");
			
			BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String inputMessage=in.readLine(); // 클라이언트로부터 한 줄 읽기
			System.out.println("Client : "+inputMessage);
			
			//out.write(inputMessage);
			//  out.flush();
			
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
