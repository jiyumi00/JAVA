import java.net.*;
import java.io.*;
public class Server {

	public static void main(String[] args) throws IOException {
		
		    ServerSocket serverSocket = new ServerSocket(9001); 
			System.out.println("connect wait...");
			
			Socket socket=serverSocket.accept();
			System.out.println("[connect success]");
			
			BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String json=in.readLine();
			System.out.println("Client : "+ json); 
			socket.close();
			serverSocket.close();
		
	}

}
