import java.io.*;
import java.net.URL;
public class subject3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		URL url=new URL("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		
		InputStream in=url.openStream();
		OutputStream os=new FileOutputStream("google.png");
		
		byte []buffer=new byte[1024*8];
		 
		int inputData;
		while((inputData=in.read(buffer))!=-1)
		{
			os.write(buffer,0,inputData);
			
		}
		in.close();
		os.close();
		
		System.out.println("웹에서 파일 복사 성공");
	}
}
