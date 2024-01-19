import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);

		File file=new File("C:\\Users\\user\\Desktop\\Java\\명품JAVA실습문제\\08. 입출력 스트림과 파일 입출력\\1번\\phone.txt");
		FileReader fin=null;
		try{
			fin=new FileReader(file);
			int c;
			while((c=fin.read())!=-1){
				System.out.print((char)c);
			}
			fin.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}