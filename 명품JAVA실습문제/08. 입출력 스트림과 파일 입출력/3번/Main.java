import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		File file=null;
		BufferedReader fin=null;
		try{
			file=new File("c:\\windows\\system.ini");
			fin=new BufferedReader(new FileReader(file));

			String s;
			while((s=fin.readLine())!=null){
				System.out.println(s.toUpperCase());
			}
			fin.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}