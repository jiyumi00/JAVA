import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.0.11",1000);

        InputStream in = socket.getInputStream();
        FileOutputStream fileOut = new FileOutputStream("test2.jpg");

        byte[] data = new byte[1024*8];
        int size;

        while((size=in.read(data))!=-1) {
            fileOut.write(data,0,size);
            fileOut.flush();
        }

        socket.close();

    }
}