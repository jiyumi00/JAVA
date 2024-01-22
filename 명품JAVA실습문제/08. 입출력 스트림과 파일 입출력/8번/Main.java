import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[]args){
		long maxFileLength=0;
		String maxFilePath="";
		File file=null;
		File subFiles[]=null;
		try{
			file=new File("c:\\");
			subFiles=file.listFiles();
			
			for(int i=0;i<subFiles.length;i++){
				if(maxFileLength<subFiles[i].length()){
					maxFileLength=subFiles[i].length();
					maxFilePath=subFiles[i].getPath();
				}
			}
			System.out.println("가장 큰 파일은 "+maxFilePath+" "+maxFileLength+"바이트");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}