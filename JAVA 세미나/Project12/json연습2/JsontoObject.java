import java.io.*;
import java.net.*;
import java.util.*;

import com.google.gson.Gson;

public class JsontoObject{
	
	public static void main(String[]args)throws Exception
	{
		FileInputStream fileIn=new FileInputStream("car.txt");
		
		//String json="";
		StringBuilder json=new StringBuilder();
		
		byte[] data=new byte[1024];
		int size;
		while((size=fileIn.read(data))!=-1)
		{
			json.append(new String(data,0,size,"utf-8"));
			//json=json+(new String(data,0,size,"utf-8"));
		}
		
		Gson gson=new Gson();
		Car car=gson.fromJson(json.toString(),Car.class);
		System.out.println(car.maker);
		
		for(Part part : car.parts)
		{
			System.out.println(part.title);
		}
		
		for(int i=0;i<car.parts.size();i++)
		{
			System.out.println(car.parts.get(i).title);
			System.out.println(car.parts.get(i).price);
			System.out.println(car.parts.get(i).name);
		}
		
		
		
	}
}