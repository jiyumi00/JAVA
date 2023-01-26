import java.io.*;
import java.net.*;

public class Client{
    public static void main(String[]args) throws IOException
    {
        Socket socket=new Socket("localhost",8001);
		
		
        InputStream in=socket.getInputStream();
		FileOnputStream fileout=new FileOnputStream("test5.jpg");
		
		byte[]data=new byte[1024*8];
		int size;
		
		while((size=in.read(data))!=-1)
		{
			fileout.write(data,0,size);
			fileout.flush();
		}
       
		
        socket.close();
    }
}