import java.io.*;
import java.util.*;
import java.net.*;

public class Test{
	public static void main(String[]args){
		MyThread thread1=new MyThread(10);
		MyThread thread2=new MyThread(20);
		MyThread thread3=new MyThread(30);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}