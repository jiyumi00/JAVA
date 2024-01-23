import java.util.*;
import java.io.*;
public class Main{
	
	Scanner scanner=new Scanner(System.in);
	File file=null;
	FileInputStream fr=null;
	BufferedReader br=null;
	HashMap<String,String> phoneList;
	String str,searchName;
	public void save(){
		try{
			file=new File("c:\\Temp\\phone.txt");
			fr=new FileInputStream(file);
			br=new BufferedReader(new InputStreamReader(fr,"utf-8"));
			phoneList=new HashMap<String,String>();
			
			while((str=br.readLine())!=null){
				String []info=str.split(" ");
				String name=info[0];
				String phoneNumber=info[1];
				
				phoneList.put(name,phoneNumber);
			}
			System.out.println("총 "+phoneList.size()+"개의 전화번호를 읽었습니다.");
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	public void search(){
		while(true){
			System.out.print("이름>> ");
			searchName=scanner.next();
			if(searchName.equals("그만")) break;
			
			if(phoneList.containsKey(searchName)){
				System.out.println(phoneList.get(searchName));
			}
			else{
				System.out.println("찾는 이름이 없습니다.");
			}
		}
	}
	public static void main(String[]args){
		Main main=new Main();
		main.save();
		main.search();
	}
}