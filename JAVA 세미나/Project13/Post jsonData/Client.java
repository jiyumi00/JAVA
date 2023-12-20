import java.io.*;
import java.net.*;

public class Client implements MultipartListener
{
	
	public static void main(String[]args) throws Exception
	{
		
		Client client=new Client();
		
		MultipartMaker maker=new MultipartMaker("http://203.241.251.177/car/PutRepair",client);
		maker.addFormData("data","{\"carNumber\":\"123가0987\",\"centerID\":104,\"content\":\"지윤\"}");
		maker.start();
	}
	public void onResult(InputStream in) throws Exception
	{
		byte[] data=new byte[1024];
		int size;
		
		while((size=in.read(data))!=-1)
		{
			System.out.println(new String(data,0,size,"utf-8"));
		}
	}
}