import java.net.*;
import java.io.*;
import com.google.gson.Gson;
import java.util.*;

public class Server2{
	
	public static void main(String[]args) throws Exception{
		
		ServerSocket serversocket = new ServerSocket(80);
        Socket socket = serversocket.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        OutputStream out = socket.getOutputStream();
		
	
		Person person = new Person();
         person.name="정지윤";
         person.age=20;
         person.address="김해";
		 person.gender="여자";

         ArrayList<Student> students = new ArrayList<>();
         Student  student = new Student();
         student.name="마여고";
         student.graduated=2018;
         students.add(student);

         Student student2 = new Student();
         student2.name="인제대";
         student2.graduated=2023;
         students.add(student2);

         person.schools=students;



         Gson gson = new Gson();
         String jsonString = gson.toJson(person);
		
		//out.write(jsonString.getBytes());
		
		String body=jsonString;
		
        out.write("HTTP/1.1 200 ok\r\n".getBytes());
        out.write("Content-Type: text/plain; charset=utf-8\r\n".getBytes());
		String contentLength = "Content-Length: "+body.length()+"\r\n\r\n";
	
		
		out.write(contentLength.getBytes());
        out.write(body.getBytes("utf-8"));
		
        socket.close();
    }
		
}
