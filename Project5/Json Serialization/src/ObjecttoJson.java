import java.io.*;
import java.util.*;
import com.google.gson.*;
import java.net.*;

public class ObjecttoJson {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Student> student1_arr=new ArrayList<>();
		ArrayList<Student> student2_arr=new ArrayList<>();
		ArrayList<Student> student3_arr=new ArrayList<>();
		
		Student student1=new Student("inje",2023);
		Student student2=new Student("inje",2022);
		Student student3=new Student("inje",2023);
				
		student1_arr.add(student1);
		student2_arr.add(student2);
		student3_arr.add(student3);
		
		Persons person1=new Persons("jiyun",23,"masan",student1_arr);
		Persons person2=new Persons("sangsub",27,"changwon",student2_arr);
		Persons person3=new Persons("sahi",23,"kimha",student3_arr);
		
			
		ArrayList<Persons> person=new ArrayList<>();
		person.add(person1);
		person.add(person2);
		person.add(person3);
		//person.add(person4);
		
		Gson gson=new Gson();
		String json=gson.toJson(person);
		
		//System.out.println(json);student1_arr.add(student1);
		
		/////////////////////
		
		Socket socket=new Socket("localhost",9001); 
		BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		out.write(json);
		out.flush();
		
		socket.close();
	}
}
