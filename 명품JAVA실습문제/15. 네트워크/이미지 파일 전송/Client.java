import java.io.*;
import java.util.*;
import java.net.*;
public class Client{
	public static void main(String[]args){
		
		FileInputStream fi=null;
		OutputStream out=null;
		File file=null;
		Socket clientSocket=null;
		try{
			clientSocket=new Socket("localhost",8888);
			System.out.println("배경 사진 보내기");
			
			file=new File("C:\\Users\\user\\Desktop\\지유미\\배경사진\\커피한잔.jpg");
			fi=new FileInputStream(file);
			out=clientSocket.getOutputStream();
			
			long n=0;
			long total=file.length();
			int c,time=0;
			while((c=fi.read())!=-1){
				out.write((byte)c);
				n++;
				if(n==total/10){
					time++;
					System.out.println("... "+time*10+"%");
					n=0;
				}
			}
			System.out.println("사진 전송을 완료하였습니다");
			
		}catch(IOException e){
			System.out.println(e.getMessage());
		}finally{
			try{
				clientSocket.close();
				out.close();
				fi.close();
			}catch(IOException e){
				System.out.println(e.getMessage());
			}
		}
	}
}