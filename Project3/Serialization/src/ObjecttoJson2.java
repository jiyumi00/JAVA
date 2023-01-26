import com.google.gson.*;

import java.io.*;
import java.util.ArrayList;


public class ObjecttoJson2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\E334\\Desktop\\person.txt"));
		
		ArrayList<String> person_arr=new ArrayList<String>();
		
		ArrayList<Person> arr=new ArrayList<Person>();
		String str;
		
		while((str=reader.readLine())!=null)
		{
			person_arr.add(str);
			
		}
	
		for(int i=0;i<person_arr.size();i+=3)
		{
			Person person=new Person(person_arr.get(i),Integer.parseInt(person_arr.get(i+1)),person_arr.get(i+2));
			arr.add(person);
		}
		
	
		BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\E334\\Desktop\\personjson.json"));
		
		
		String personJson=gson.toJson(arr);
		
		writer.write(personJson);
		reader.close();
		writer.close();
		
	}

}
