import java.io.*;
import java.net.*;
import java.util.*;

import com.google.gson.Gson;

public class ObjecttoJson{
	
	public static void main(String[]args)throws Exception
	{
		
		Car car=new Car();
		car.maker="현대";
		
		ArrayList<Part> parts=new ArrayList<>();
		
		Part part=new Part();
		part.title="밧데리";
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
		System.out.println(jsonString);
		
		FileOutputStream out=new FileOutputStream("car.txt");
		out.write(jsonString.getBytes("utf-8"));
		out.flush();
		
		
		out.close();
	}
	
	
	
	
}