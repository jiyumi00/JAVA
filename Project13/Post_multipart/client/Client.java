import java.io.*;
import java.util.*;
import com.google.gson.Gson;

public class Client implements MultipartListener{
	public static void main(String[] args) throws Exception{
		Client client = new Client();
		
		Car car = new Car();
		car.maker = "기아";
		
		ArrayList<Part> parts = new ArrayList<>();
		
		Part part = new Part();
		part.title = "배터리";
		part.price = 1000;
		part.name = "이상섭";
		parts.add(part);
		
		part = new Part();
		part.title = "와이퍼";
		part.price = 2000;
		part.name = "Lee";
		parts.add(part);
		
		car.parts = parts;
		
		Gson gson = new Gson();
		String jsonString = gson.toJson(car);
		
		MultipartMaker maker = new MultipartMaker("http://localhost/third/Test", client);
		maker.addFormData("data", jsonString);
		maker.addBinaryData("file1", new FileInputStream("1.jpg"));
		maker.start();
	}
	
	public void onResult(InputStream in) throws Exception{
		byte[] data = new byte[1024*8];
		int size;
		
		while((size = in.read(data)) != -1){
			System.out.println(new String(data, 0, size, "utf-8"));
		}
	}
}