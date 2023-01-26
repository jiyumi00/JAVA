import java.io.*;
import java.net.*;
public class TCPClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
	
		Socket socket=new Socket("192.168.182.12",9001);
		
		BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("Send >> ");
			String outputMessage=reader.readLine(); 
			
			if(outputMessage.equalsIgnoreCase("bye")) 
			{
				out.write(outputMessage); 
				out.flush();
				break;
			}
			
			out.write(outputMessage+'\n'); //
			out.flush();
			
			String inputMessage=in.readLine();
			System.out.println("Server : "+inputMessage);
		}
		socket.close();
		
	}

}
