import java.io.*;
import java.net.*;

public class TCPServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ServerSocket listener=new ServerSocket(9001);
		System.out.println("wait...");
		
		Socket socket=listener.accept();
		System.out.println("[connect success]");
		
		BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			String inputMessage=in.readLine();
			
			if(inputMessage.equalsIgnoreCase("bye"))
			{
				System.out.println("exit");
				break;
			}
			System.out.println("Client : "+ inputMessage); 
			
			System.out.print("Send >> ");
			String outputMessage=reader.readLine(); 
			out.write(outputMessage + '\n');
			out.flush();
		}
		socket.close();
		listener.close();
		
	}

}
