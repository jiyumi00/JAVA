import java.io.*;
import java.util.*;
import com.google.gson.*;
import java.net.*;

public class TCPClient {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Gson gson=new Gson();
		String outputmessage="안녕";
		///////////////////////////////////////////////////////////////////
		
		Socket socket=new Socket("localhost",9001); 
		
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		
		out.write(outputmessage); //json파일 보내기
		out.flush();
		
		String inputMessage=in.readLine(); 
		System.out.println(inputMessage); 
		
		socket.close();
		in.close();
		out.close();
	}
}
