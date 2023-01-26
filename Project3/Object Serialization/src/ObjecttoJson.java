import com.google.gson.*;
import java.io.*;
import java.util.ArrayList;

class Student{
	String name;
	String password;
	String email;
	int age;
	public Student(String name, String password, String email, int age) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", password=" + password + ", email=" + email + ", age=" + age + "]";
	}
}

public class ObjecttoJson {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Gson gson=new Gson();
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("ObjecttoJson.json"));
		
		Student student=new Student("Á¤ÁöÀ±","0078","json@naver.com",23);
		Student student2=new Student("±èÇö¹Î","1234","gson@naver.com",23);
		
		ArrayList <Student> list=new ArrayList<Student>();
		list.add(student);
		list.add(student2);
				
		String studentjson=gson.toJson(list);
		
		bw.write(studentjson);
		
		bw.close();
		
		
	}

}
