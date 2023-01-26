import java.net.*;
import java.io.*;
import com.google.gson.*;
public class Server {

	public static void main(String[] args) throws IOException {
		
		    ServerSocket serverSocket = new ServerSocket(9001); 
			System.out.println("connect wait...");
			
			Socket socket=serverSocket.accept();
			System.out.println("[connect success]");
			
			BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//PrintStream out=new PrintStream(socket.getOutputStream());
			
			
			String json=in.readLine();//json문자열 받기
			System.out.println("Client >> "+ json);  
			
			//json추가하기 ////////////////////////////////////////////////////
			
			FileWriter fileout=new FileWriter("jsonout.txt");
			String jsonfile=json;
			fileout.write(jsonfile);
			fileout.flush();
			fileout.close();

			BufferedWriter out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); 
				
			out.write(json,0,json.length()); //json문자열 그대로 보내기 <error> 
			out.flush();
			 
			//out.println(json);
			//out.flush();
			
			
			socket.close();
			serverSocket.close();
		
	}

}
