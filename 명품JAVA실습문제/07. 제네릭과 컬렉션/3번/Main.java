import java.util.*;
public class Main{
	Scanner scanner=new Scanner(System.in);
	
	HashMap<String,Integer> nations=new HashMap<String,Integer>();
	String countryName,searchName;
	int personCnt,searchCnt;
	
	public void saveCountry(){
		System.out.println("나라 이름과 인구를 입력하세요. (예: Korea 5000)");
		while(true){
			System.out.print("나라 이름, 인구 >>");
			countryName=scanner.next();
			if(countryName.equals("그만")) break;
			personCnt=scanner.nextInt();
		
			nations.put(countryName,personCnt);
		}
	}
	public void search(){
		while(true){
			System.out.print("인구 검색 >>");
			searchName=scanner.next();
			if(searchName.equals("그만")) break;
			
			Integer searchCnt=nations.get(searchName);
			if(searchCnt==null){
				System.out.println(searchName+" 나라는 없습니다.");
			}
			else{
				System.out.println(searchName+"의 인구는 "+searchCnt);
			}
		}
	}
	public static void main(String[]args){
		Main main=new Main();
		main.saveCountry();
		main.search();
	}
}