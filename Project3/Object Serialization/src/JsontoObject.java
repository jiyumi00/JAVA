import java.io.*;
import java.util.ArrayList;

import com.google.gson.*;


public class JsontoObject {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Gson gson=new Gson();
		
		BufferedReader br=new BufferedReader(new FileReader("ObjecttoJson.json"));
		String jsonStr=br.readLine();
		
		TypeToken<ArrayList<Student>> arr= new TypeToken<ArrayList<Student>>(){};
		
		
		Student student=gson.fromJson(jsonStr, Student.class);
		
		
		//Student°´Ã¼ toString() Ãâ·Â
		System.out.println(student);
		
	}

}
