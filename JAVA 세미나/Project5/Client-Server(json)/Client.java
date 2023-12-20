import java.io.*;
import java.util.*;
import com.google.gson.*;
import java.net.*;

public class Client {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Student> student1_arr=new ArrayList<>();
		ArrayList<Student> student2_arr=new ArrayList<>();
		ArrayList<Student> student3_arr=new ArrayList<>();
		
		Student student1=new Student("인제대",2023);
		Student student2=new Student("인제대",2022);
		Student student3=new Student("인제대",2023);
				
		student1_arr.add(student1);
		student2_arr.add(student2);
		student3_arr.add(student3);
		
		Person person1=new Person("정지윤",23,"마산",student1_arr);
		Person person2=new Person("이상섭",27,"창원",student2_arr);
		Person person3=new Person("정세희",23,"김해",student3_arr);
		
			
		ArrayList<Person> person=new ArrayList<>();
		person.add(person1);
		person.add(person2);
		person.add(person3);
	
		
		Persons personObject=new Persons();
		personObject.persons=person;

		Gson gson=new Gson();
		String json=gson.toJson(personObject);



















		///////////////////////////////////////////////////////////////////
		/* 
		Socket socket=new Socket("localhost",9001); 
		// writer로 내보내는데 서버로 보내지는건 됨.. 서버에서 받고 client로 보내는건 안됨
		// printStream 쓸때는 println으로 보내서 한줄을 보내는거라서 한줄씩 주고받는거라 문제가 생기지 않음..
		// writer도 한줄로 보내서 서버가 받기 성공 근데 왜 서버에서 client로 한줄로 보내기가 안되는가?? char[]로 넣어서 보내봤는데도 작동안함


		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); 
		//PrintStream out=new PrintStream(socket.getOutputStream());
		
	
		
		out.write(json,0,json.length());  //json문자열으로 보내기
		out.flush();
		//out.println(json);
		//out.flush();

		BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String outPutMessage=in.readLine(); //server로 부터 받기 <error>  
		System.out.println("Server >> "+ outPutMessage); */
		
		socket.close();
	}
}
