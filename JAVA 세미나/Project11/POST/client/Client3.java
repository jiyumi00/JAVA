import java.io.*;
import java.net.*;

public class Client3
{
	
	public static void main(String[]args) throws Exception{
		
		String params=URLEncoder.encode("?id=1&name=정지윤","utf-8");
		URL url=new URL("http://localhost/second/Test3"+params);
		
		InputStream in=url.openStream();
		
		byte[]data=new byte[1024];
		int size;
		while((size=in.read(data))!=-1)
		{
			;
		}
	}
}