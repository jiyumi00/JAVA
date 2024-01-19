import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		String phoneInfo;
		
		File file=new File("./phone.txt");
		FileWriter fout=null;
		
		try{
			fout=new FileWriter(file);
			System.out.println("전화번호 입력 프로그램입니다.");
			while(true){
				System.out.print("이름 전화번호 >> ");
				phoneInfo=scanner.nextLine();
				if(phoneInfo.equals("그만")){
					break;
				}
				fout.write(phoneInfo,0,phoneInfo.length());
				fout.write("\r\n",0,2);
			}
			fout.close();
			System.out.print(file.getName()+"에 저장하였습니다");
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}