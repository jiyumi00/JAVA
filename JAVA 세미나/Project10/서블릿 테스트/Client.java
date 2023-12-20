import java.io.*;
import java.net.*;

public class Client
{
	public static void main(String[]args) throws Exception{
		
		URL url=new URL("http://localhost/first/Test");
		
		InputStream in=url.openStream();
		
		byte []data=new byte[1024];
		int size;
		
		
		while((size=in.read(data))!=-1)
		{
			System.out.println(new String(data,0,size,"utf-8"));
		}
	}
}