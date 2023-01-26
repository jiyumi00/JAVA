import java.io.*;
import java.net.*;

public class Client
{
	
	public static void main(String[]args) throws Exception{
		
		URL url=new URL("http://localhost/second/Test");
		HttpURLConnection connection =(HttpURLConnection)url.openConnection();
		
		connection.setDoOutput(true);
		connection.setDoInput(true);
		connection.setRequestMethod("POST");
		
		connection.setRequestProperty("Content-Type","text/plain; charset=utf-8");
		
		//clinet에서 Server로 request의 body에 json을 보낸다
		OutputStream out=connection.getOutputStream();
		String jsonString="{\"name\":\"정지윤\"}";
		out.write(jsonString.getBytes("utf-8")); //꼭 byte로 보낸다
		out.flush();
		
		//Server에서 Client로 response의 body에 json으로 그대로 받는다 
		InputStream in=connection.getInputStream();
		byte []data=new byte[1024];
		int size;
		
		while((size=in.read(data))!=-1)
		{
			System.out.println(new String(data,0,size,"utf-8"));
		}
		
	}
}