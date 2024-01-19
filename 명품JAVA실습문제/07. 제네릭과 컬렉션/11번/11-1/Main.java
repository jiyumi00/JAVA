import java.util.*;
public class Main{
	Scanner scanner=new Scanner(System.in);
	Vector<Nation> nations=new Vector<Nation>();
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
			
			for(int i=0;i<nations.size();i++){
				if(nations.get(i).getCountry().equals(country)){
					isExist=true;
					System.out.println(country+"는 이미 있습니다!");
					break;
				}
			}
			if(isExist==false){
				Nation nation=new Nation(country,capital);
				nations.add(nation);
			}
		}
	}
	public void quiz(){
		
		while(true){
			int index=(int)(Math.random()*nations.size());
			System.out.print(nations.get(index).getCountry()+"의 수도는? ");
			answer=scanner.next();
			
			if(answer.equals("그만")) break;
			if(answer.equals(nations.get(index).getCapital())){
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