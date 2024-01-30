import java.io.*;
import java.net.*;
import java.util.*;

public class Client implements MyListener{ //client라는 리스너가 정의해줄께
	
	public static void main(String[]args) throws Exception{
		
		
		Socket socket=new Socket("localhost",4000);
		Socket socket_file=new Socket("localhost",5000);
		
		BufferedReader keyIn=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(socket.getOutputStream());
		
		
		ClientThread thread=new ClientThread(socket); 
		thread.start();
		
		
		String message="";
		while(!(message=keyIn.readLine()).equals("bye")){//bye를 입력할때까지
			
			if(message.equals("down"))
			{
				MyListener client=new Client();
				
				FileInThread thread2=new FileInThread(socket_file,client); //파일 받는 스레드
				thread2.start();
			}
			
			out.println(message); // 서버로 보내기
		}
		out.println(message);
		
		
		socket.close();
		
			
	}
	public void abc(long size) //event listener //반드시 구현해야한다
	{
		
		System.out.println("complete...."+size);
	}
	
}

