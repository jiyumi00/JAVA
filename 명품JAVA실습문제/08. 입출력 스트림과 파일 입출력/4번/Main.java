import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		
		File file=null;
		BufferedReader br=null;
		int i=1;
		try{
			file=new File("c:\\windows\\system.ini");
			br=new BufferedReader(new FileReader(file));
			
			String s;
			while((s=br.readLine())!=null){
				System.out.println(i+": "+s);
				i++;
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}