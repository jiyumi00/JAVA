import java.io.*;
import java.net.*;

public class Client2
{
	
	public static void main(String[]args) throws Exception{
		
		URL url=new URL("http://localhost/second/Test2");
		HttpURLConnection connection =(HttpURLConnection)url.openConnection();
		
		connection.setDoOutput(true);
		connection.setDoInput(true);
		connection.setRequestMethod("POST");
		
		connection.setRequestProperty("Content-Type","image/jpeg; charset=utf-8");
		
		//clinet에서 Server로 request의 body에 image을 보낸다
		OutputStream out=connection.getOutputStream();
		FileInputStream fileIn=new FileInputStream("강아지.jpg");
		
		byte[] data2=new byte[1024];
		int size2;
		
		while((size2=fileIn.read(data2))!=-1)
		{
			
			out.write(data2,0,size2); //꼭 byte로 보낸다
			out.flush();
		}
		fileIn.close();
		
		//Server에서 Client로 response의 body에 json으로 그대로 받는다 
		
		
		
		InputStream in=connection.getInputStream();
		byte[] data=new byte[1024];
		int size;
		
		while((size=in.read(data))!=-1)
		{
			System.out.println(new String(data,0,size,"utf-8"));
		}
		
		
	}
}