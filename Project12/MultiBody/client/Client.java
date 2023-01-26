import java.io.*;
import java.net.*;
import com.google.gson.Gson;
import java.util.*;

public class Client implements MultipartListener{
	
	public static void main(String[]args) throws Exception
	{
		Client client=new Client();
		
		Car car=new Car();
		car.maker="현대";
		
		ArrayList<Part>parts=new ArrayList<Part>();
		Part part=new Part();
		part.title="배터리";
		part.price=10000;
		part.name="정지윤";
		parts.add(part);
		
		part=new Part();
		part.title="핸들";
		part.price=20000;
		part.name="정세희";
		parts.add(part);
		
		car.parts=parts;
		
		Gson gson=new Gson();
		String jsonString=gson.toJson(car,Car.class);
		
		MultipartMaker maker= new MultipartMaker("http://localhost/third/Test",client);
		maker.addFormData("data","{\"name\":\"정지윤\",\"age\":23}");
		maker.addBinaryData("image1",new FileInputStream("2.jpg"));
		maker.addFormData("json",jsonString);
		
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