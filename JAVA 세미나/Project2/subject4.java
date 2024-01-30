import java.io.*;
public class subject4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("nameList.txt");
		try {
			
			BufferedReader br=new BufferedReader(new FileReader(file));
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 불러오는 데 오류가 발생했습니다");
		}
	}

}
