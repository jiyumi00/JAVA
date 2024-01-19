import java.util.*;
public class Main{
	Scanner scanner=new Scanner(System.in);
	HashMap<String,String> nations=new HashMap<String,String>();
	int option;
	String country, capital,answer;
	boolean isExist;
	public void input(){
		
		System.out.println("현재 "+nations.size()+"개 나라와 수도가 입력되어 있습니다.");
		
		while(true){
			System.out.print("나라와 수도 입력"+(nations.size()+1)+">> ");
			isExist=false;
			country=scanner.next();
			if(country.equals("그만")) break;
			capital=scanner.next();
			
			
			if(nations.containsKey(country)){
				System.out.println(country+"는 이미 있습니다!");
			}
			else{
				nations.put(country,capital);
			}
		}
	}
	public void quiz(){
		Set<String>keys=nations.keySet();
		Object[]array=keys.toArray();
	
		while(true){
			int index=(int)(Math.random()*array.length);
			String randomCountry=(String)array[index];
			System.out.print(randomCountry+"의 수도는? ");
			answer=scanner.next();
			
			if(answer.equals("그만")) break;
			if(answer.equals(nations.get(randomCountry))){
				System.out.println("정답!!");
			}
			else{
				System.out.println("아닙니다!!");
			}
		} 
		
	} 
	public void run(){
		while(true){
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			option=scanner.nextInt();
			
			switch(option){
				case 1:
					input();
					break;
				
				case 2:
					quiz();
					break;
				
				case 3:
					System.out.print("게임을 종료합니다");
					return;
					
				default:
					System.out.println("해당 옵션은 없습니다. 다시 입력해주세요");
					break;
			}
			
		}
	}
	public static void main(String[]args){
		Main main=new Main();
		
		System.out.println("*** 수도 맞추기 게임을 시작합니다. ***");
		main.run();
	}
}