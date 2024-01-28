import java.io.*;
import java.util.*;
import java.net.*;
public class Server{
	public static void main(String[]args){
		
		File file=null;
		FileOutputStream fo=null;
		InputStream in=null;
		ServerSocket listener=null;
		Socket socket=null;
		try{
			listener=new ServerSocket(8888);
			System.out.println("연결을 기다리고 있습니다...");
			socket=listener.accept();
			System.out.println("연결 되었습니다");
			
			file=new File("배경사진.jpg");
			in=socket.getInputStream();
			fo=new FileOutputStream(file);
			
			int c;
			while((c=in.read())!=-1){
				fo.write((byte)c);
			}
			System.out.print(file.getName()+"을 받았습니다");
		}catch(IOException e){
			System.out.println(e.getMessage());
		}finally{
			try{
				listener.close();
				socket.close();
				in.close();
				fo.close();
			}catch(IOException e){
				System.out.println(e.getMessage());
			}
		}
		
	}
}