import java.io.*;
import java.net.*;
import com.google.gson.Gson;

public class Client2 implements MultipartListener
{
	
	public static void main(String[]args) throws Exception
	{
		
		Client client=new Client();
		
		Repair repair=new Repair();
		repair.carNumber="1234";
		repair.centerID="564";
		repair.content="지윤이 다시함";
		
		Gson gon=new Gson();
		String jsonString=gon.toJson(repair);
		
		MultipartMaker maker=new MultipartMaker("http://203.241.251.177/car/PutRepair",client);
		maker.addFormData("data",jsonString);
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