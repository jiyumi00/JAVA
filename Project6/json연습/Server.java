import java.io.*;
import java.net.*;
import java.util.*;
import com.google.gson.Gson;
public class Server
{
    public static void main(String [] args) throws IOException {

        ServerSocket serverSocket=new ServerSocket(8000);
        System.out.println("connect wait....");

        Socket socket=serverSocket.accept();
        System.out.println("[connect sucess]");

        InputStream in=socket.getInputStream();
        byte[]data=new byte[1024];
        int size;
        StringBuilder builder=new StringBuilder();


        while((size=in.read(data))!=-1)
        {
            builder.append(new String(data,0,size,"utf-8"));
        }
        System.out.println(builder.toString());
        socket.close();
    }

}