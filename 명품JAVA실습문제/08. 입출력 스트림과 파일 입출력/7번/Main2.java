import java.util.*;
import java.io.*;
public class Main2{
	public static void main(String[]args){
		int c;
		long n=0,total;
		byte[] buffer=new byte[1024];
		System.out.println("a.jpg를 b.jpg로 복사합니다");
		File file=new File("a.jpg");
		File newFile=new File("b.jpg");
		try{
			FileInputStream fi=new FileInputStream(file);
			BufferedInputStream bi=new BufferedInputStream(fi);
			FileOutputStream fo=new FileOutputStream(newFile);
			BufferedOutputStream bo=new BufferedOutputStream(fo);
			
			System.out.println(total);
			while((c=bi.read(buffer))!=-1){
				bo.write(buffer,0,c);
				n++;
				if(n==total/10){
					System.out.print("*");
					n=0;
				}
			}
			bi.close();
			bo.close();
			
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}