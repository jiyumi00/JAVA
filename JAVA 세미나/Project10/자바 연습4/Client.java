import java.io.*;
import java.net.*;

public class Client
{
	public static void main(String[]args) throws Exception{
		
		Socket socket=new Socket("localhost",8000);
		
		OutputStream out=socket.getOutputStream();
		File file=new File("favicon.ico");
		FileInputStream fileIn=new FileInputStream(file);
		
		 
		//Client 헤더 
		out.write("POST / HTTP/1.1\r\n".getBytes());
		out.write("Connection: close\r\n".getBytes());
		out.write("Content-Type: image/jpeg\r\n".getBytes());
		out.write("Host: localhost \r\n".getBytes());
		String contentLength="Content-Length: "+file.length()+"\r\n\r\n"; //파일 사이즈만큼 
		out.write(contentLength.getBytes());
		out.flush();
		
		byte data[]=new byte[1024];
		int size;
		
		while((size=fileIn.read(data))!=-1) 
		{
			out.write(data,0,size);
			out.flush();
		}
		fileIn.close();
		
		
		InputStream in=socket.getInputStream();
		while((size=in.read(data))!=-1)
		{
			System.out.println(new String(data,0,size));
		}
		socket.close();
	}
}