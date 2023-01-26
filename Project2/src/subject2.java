import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

public class subject2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("강아지.jpg");
		InputStream in =new FileInputStream(file);//읽기
		BufferedInputStream bis=new BufferedInputStream(in);
		
		OutputStream os =new FileOutputStream("강아지 복사.jpg");//쓰기
		BufferedOutputStream bos=new BufferedOutputStream(os);
		byte[] buffer=new byte[1024*1024];
	
		try {
			
			int inputData;
			long start=System.currentTimeMillis(); ///
			while((inputData=bis.read(buffer))!=-1)
			{
				bos.write(buffer,0,inputData);
				
			}
			long end=System.currentTimeMillis();
			System.out.print("복사 성공! 총 걸린 시간은 ");
			System.out.println(end-start);
			in.close();
			os.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 읽는 데 오류 발생");
		}
	}

}
