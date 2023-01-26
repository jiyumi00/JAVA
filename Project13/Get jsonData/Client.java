import java.io.*;
import java.net.*;
import com.google.gson.Gson;

public class Client
{
	public static void main(String[]args) throws Exception{
		
		URL url=new URL("http://192.168.0.14/car/GetCarList");
		
		InputStream in=url.openStream();
		
		byte[] data=new byte[1024];
		int size;
		String json="";
		while((size=in.read(data))!=-1)
		{
			
			json=json+(new String(data,0,size,"utf-8"));
		}
		
		//System.out.println(json);
		Gson gson=new Gson();
		
		Total total=gson.fromJson(json,Total.class);
		
		
		for(Car car: total.kinds){
			System.out.println(car.registerDate);
		}
		
		//현대자동차
		
		int hyundaiCount=0;
		int GenesisCount=0;
		int usaCount=0;
		int koreaCount=0;
		
		for(Car car: total.kinds)
		{
			switch(car.area)
			{
				case "미국" : usaCount++; break;
				case "한국" : koreaCount++; break;
				
			}
			
			switch(car.maker)
			{
				case "현대자동차" : hyundaiCount++; break;
				case "제네시스" : GenesisCount++; break;
			}
		
		}
		
		System.out.println("현대자동차 : "+hyundaiCount+", 제네시스 : "+GenesisCount);
		System.out.println("미국 : "+usaCount+", 한국 : "+koreaCount);
		
		
	}
	
}