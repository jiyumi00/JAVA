import java.io.*;
import java.net.*;

public class Client2
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
	
	
		URL url2=new URL("http://localhost/first/Test2");
		
		InputStream fileIn=url2.openStream();
		OutputStream out=System.out;
		
		byte []data2=new byte[1024];
		int size2;
		
	
		while((size2=fileIn.read(data2))!=-1)
		{
			out.write(data2,0,size2);
			out.flush();
		}
	}
}