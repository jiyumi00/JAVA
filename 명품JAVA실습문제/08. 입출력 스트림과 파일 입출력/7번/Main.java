import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[]args){
		int c;
		long n=0,total;
		
		System.out.println("a.jpg를 b.jpg로 복사합니다");
		File file=new File("a.jpg");
		File newFile=new File("b.jpg");
		try{
			FileInputStream fi=new FileInputStream(file);
			FileOutputStream fo=new FileOutputStream(newFile);
			
			total=file.length();
		
			while((c=fi.read())!=-1){
				fo.write((byte)c);
				n++;
				if(n==total/10){
					System.out.print("*");
					n=0;
				}
			}
			fi.close();
			fo.close();
			
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}