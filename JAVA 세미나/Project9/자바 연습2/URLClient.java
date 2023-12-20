import java.io.*;
import java.net.*;
import com.google.gson.Gson;
import java.util.*;

public class URLClient
{
	public static void main(String[]args)throws Exception{
		
		URL url=new URL("http://localhost");
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
		
		Gson gson=new Gson();
		
		Person person=gson.fromJson(reader,Person.class);
		
		
		for(Student student : person.schools)
		{
			System.out.println(student.name);
		}
		
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println(person.address);
		
		
		
	}	
}