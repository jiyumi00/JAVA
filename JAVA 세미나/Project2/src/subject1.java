import java.io.*;

public class subject1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file=new File("������.jpg");
		InputStream in =new FileInputStream(file); //�б�
		OutputStream os =new FileOutputStream("����������.jpg");//����
		
		try {
			
			int inputData;
			long start=System.currentTimeMillis(); ///
			while((inputData=in.read())!=-1)
			{
				os.write(inputData);
				
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
