import java.util.*;
import java.io.*;
public class Test{
	File file=new File("words.txt");
	FileReader fr=null;
	BufferedReader br=null;
	Scanner scanner=new Scanner(System.in);
	Vector<String>words=new Vector<String>();
	boolean find=false;
	String searchWord;
	
	public void save(){
		try{
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
			String str;
			while((str=br.readLine())!=null){
				words.add(str);
			}
			System.out.println("프로젝트 폴더 밑의 words.txt 파일을 읽었습니다...");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void search(){
		while(true){
			System.out.print("단어>>");
			searchWord=scanner.next();
			if(searchWord.equals("그만")){
				System.out.println("종료합니다...");
				break;
			}
			find=false;
			for(int i=0;i<words.size();i++){
				String word=words.get(i);
				if(word.length()<searchWord.length()) continue;

				if(word.substring(0,searchWord.length()).equals(searchWord)){
					find=true;
					System.out.println(word);
				}
				
			}
			if(find==false){
				System.out.println("발견할 수 없음");
			}
		}
	}
	public static void main(String[]args){
		Test test=new Test();
		test.save();
		test.search();
		
	}
}