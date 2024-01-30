import java.io.*;
import java.util.*;
import java.net.*;

class MyThread extends Thread{
	
	private int n;
	
	public MyThread(int n){
		this.n=n;
	}
	public void run(){
		while(true){
			System.out.println(n);
			n++;
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {return;}
		}
	}
}