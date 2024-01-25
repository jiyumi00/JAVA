import java.util.*;
import java.io.*;
public class Main{
	Scanner scanner=new Scanner(System.in);
	Vector<String> vec=new Vector<String>();
	File file=null;
	BufferedReader br=null;
	String fileName,searchWord;
	boolean find=false;
	public void read(){
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("대상 파일명 입력>> ");
		fileName=scanner.next();
		
		try{
			file=new File(fileName);
			br=new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"utf-8"));
			String s;
			
			while((s=br.readLine())!=null){
				vec.add(s);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	public void search(){
		while(true){
			System.out.print("검색할 단어나 문장>> ");
			searchWord=scanner.next();
			find=false;
			if(searchWord.equals("그만")){
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			for(int i=0;i<vec.size();i++){
				if(vec.get(i).contains(searchWord)){
					find=true;
					System.out.println(vec.get(i));
				}
			}
			if(find==false){
				System.out.println("해당 단어가 없습니다");
			}
		}
	}
	public static void main(String[]args){
		Main main=new Main();
		main.read();
		main.search();
	}
}