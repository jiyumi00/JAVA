import java.net.*;
import java.io.*;

public class Server{
	
	public static void main(String[]args) throws Exception{
		
		ServerSocket serversocket = new ServerSocket(80);
        Socket socket = serversocket.accept();

		
		FileInputStream fileIn=new FileInputStream("test00.jpg");
        //BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        OutputStream out = socket.getOutputStream();

        //String message;
		byte[]data=new byte[1024*8];
		int size;
		
		while((size=fileIn.read(data))!=-1)
		{
			out.write(data,0,size);
			out.flush();
		}
		
		
		
        /*while(!(message=in.readLine()).equals((""))){
            System.out.println(message);
        }
		*/
        
		//String body="안녕하세요";
        out.write("HTTP/1.1 200 ok\r\n".getBytes());
		out.write("Content-Type: image/jpeg; charset=utf-8\r\n".getBytes());
		String contentLength = "Content-Length: "+body.length()+"\r\n\r\n";
		
		
        //out.write(contentLength.getBytes());
        //out.write(body.getBytes("utf-8"));
		
        socket.close();
    }
		
}
