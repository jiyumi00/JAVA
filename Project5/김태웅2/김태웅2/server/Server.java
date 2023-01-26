import java.net.*;
import java.io.*;

public class Server {
    public static void main(String [] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(1000);
         Socket socket = serverSocket.accept();

         System.out.println(socket.getInetAddress().toString());

         FileInputStream fileIn = new FileInputStream("test.jpg");
         OutputStream out = socket.getOutputStream();

         byte[] data = new byte[1024*8];
         int size;

         while((size=fileIn.read(data))!=-1) {
            out.write(data,0,size);
            out.flush();
         }

         socket.close();
    }
}