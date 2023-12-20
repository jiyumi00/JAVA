import java.io.*;
import java.net.*;

public class Server{
	
	public static void main(String[]args)throws Exception
	{
		ServerSocket serverSocket=new ServerSocket(8000);
		Socket socket=serverSocket.accept();
		
		
		InputStream in=socket.getInputStream();
		BufferedReader headerIn=new BufferedReader(new InputStreamReader(in));
		
		String str="";
		int fileSize=0;
		
		//request header 
		while(!(str=headerIn.readLine()).equals(""))
		{
			System.out.println(str);
			if(str.startsWith("Content-Length"))
			{
				System.out.println("content-length="+str.split(" ")[1]);
				fileSize=Integer.parseInt(str.split(" ")[1]);
			}
		}
		
		
		byte data[]=new byte[fileSize];
		int size;
		
		PrintStream fileOut=new PrintStream("aa.ico");
		size=in.read(data,0,fileSize); //여기서 문제 발생 
		
		
		System.out.println(size);
		fileOut.write(data,0,size);
		fileOut.flush();
		fileOut.close();
		
		System.out.println("file saved...");
		
		String jsonString="{\"success\":1}";
		OutputStream out=socket.getOutputStream();
		out.write("HTTP/1.1 200 OK \r\n".getBytes());
		out.write("Content-Type: application/json; charset=utf-8\r\n".getBytes());
		String contentLength="Content-Length: "+jsonString.length()+"\r\n\r\n";
		out.write(contentLength.getBytes());
		out.write(jsonString.getBytes());
		out.flush();
		
		socket.close();
	}
}