import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

public class subject2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("������.jpg");
		InputStream in =new FileInputStream(file);//�б�
		BufferedInputStream bis=new BufferedInputStream(in);
		
		OutputStream os =new FileOutputStream("������ ����.jpg");//����
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
			System.out.print("���� ����! �� �ɸ� �ð��� ");
			System.out.println(end-start);
			in.close();
			os.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("���� �д� �� ���� �߻�");
		}
	}

}
