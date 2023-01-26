import java.io.*;

public class subject1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file=new File("강아지.jpg");
		InputStream in =new FileInputStream(file); //읽기
		OutputStream os =new FileOutputStream("강아지복사.jpg");//쓰기
		
		try {
			
			int inputData;
			long start=System.currentTimeMillis(); ///
			while((inputData=in.read())!=-1)
			{
				os.write(inputData);
				
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
