import java.io.*;
import java.net.*;
import com.google.gson.Gson;
import java.util.*;

public class Client
{
	public static void main(String[]args) throws Exception{
		
		URL url=new URL("http://192.168.0.14/car/GetCarSale?start=300&end=310");
		
		InputStream in=url.openStream();
		
		byte[] data=new byte[1024];
		int size;
		
		String json="";
		while((size=in.read(data))!=-1)
		{
			
			json=json+(new String(data,0,size,"utf-8"));
		}
		
		//System.out.println(json);
		
		Gson gson=new Gson();
		Car car=gson.fromJson(json,Car.class);
		
		/*ArrayList<Part> list=new ArrayList<Part>();
		for(Part part: car.parts)
		{
			if(!list.contains(part))
			{
				list.add(part);
			}
		}
		*/
		
	
		
		
		
		if(part.model.equals("마티즈"))
		{
			System.out.println(part.makeYear);
		}
		
		System.out.println(resultList.toString());
		
	}
	
}