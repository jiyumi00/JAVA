import java.util.*;
import java.io.*;
public class Main{
	Scanner scanner=new Scanner(System.in);
	String file1,file2;
	FileInputStream fin1,fin2=null;
	
	public boolean compare(FileInputStream fin1,FileInputStream fin2) throws IOException{
		boolean check=true;
		
		byte buf1[]=new byte[1024];
		byte buf2[]=new byte[1024];
		
		int c1=0,c2;
		while(true){
			c1=fin1.read(buf1,0,buf1.length);
			c2=fin2.read(buf2,0,buf2.length);
			
			if(c1==-1) break;
			
			if(c1!=c2){
				check=false;
			}
			for(int i=0;i<c1;i++){
				if(buf1[i]!=buf2[i]) check=false;
			}
			
		}
		return check;
	}
	public void run(){
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다");
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		file1=scanner.next();
		System.out.print("두번째 파일 이름을 입력하세요>>");
		file2=scanner.next();
		
		try{
			fin1=new FileInputStream(file1);
			fin2=new FileInputStream(file2);
	
			if(compare(fin1,fin2)){
				System.out.println("파일이 같습니다");
			}
			else{
				System.out.println("파일이 다릅니다");
			}
			fin1.close();
			fin2.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void main(String[]args){
		
		Main main=new Main();
		main.run();
		
	}
}