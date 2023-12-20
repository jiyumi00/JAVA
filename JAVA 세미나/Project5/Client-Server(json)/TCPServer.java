import java.net.*;
import java.io.*;
import com.google.gson.*;
public class TCPServer {

	public static void main(String[] args) throws IOException {
		
		    ServerSocket serverSocket = new ServerSocket(9001); 
			System.out.println("connect wait...");
			
			Socket socket=serverSocket.accept();
			System.out.println("[connect success]");
			
			BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			
			String inputMessage=in.readLine();//json파일 받기
			System.out.println("Persons : "+ inputMessage);  
			
	
			out.write(inputMessage);
			out.flush();
			
			socket.close();
			serverSocket.close();
			in.close();
			out.close();
		
	}

}
