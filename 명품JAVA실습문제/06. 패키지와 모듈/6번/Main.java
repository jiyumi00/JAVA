import java.util.Calendar;
import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	Scanner scanner=new Scanner(System.in);
	String startEnter,endEnter;
	int startSecond,endSecond,second,goalSecond=10,min=60,winIndex;
	Player []player;
	ArrayList<Integer>grades=new ArrayList<>();
	
	public void viewResult(){
		for(int i=0;i<player.length;i++){
			System.out.print(player[i].getName()+"의 결과 "+player[i].getSecond()+", ");
			grades.add(Math.abs(player[i].getSecond()-goalSecond));
		}
		for(int i=0;i<grades.size();i++){
			if(min>grades.get(i)){
				min=grades.get(i);
				winIndex=i;
			}
		}
		System.out.print("승자는 "+player[winIndex].getName());
	}
	public void play(){
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		
		for(int i=0;i<player.length;i++){
			startSecond=0;
			endSecond=0;
			
			System.out.print(player[i].getName()+" 시작 <Enter>키>>");
			startEnter=scanner.nextLine();
			
			Calendar start=Calendar.getInstance();
			startSecond=start.get(Calendar.SECOND);
			System.out.println("   현재 초 시간 = "+startSecond);
			
			System.out.print("10초 예상 후 <Enter>키>>");
			endEnter=scanner.nextLine();
			
			Calendar end=Calendar.getInstance();
			endSecond=end.get(Calendar.SECOND);
			System.out.println("   현재 초 시간 = "+endSecond);
			
			if(startSecond<=endSecond){
				second=endSecond-startSecond;
			}
			else{
				second=(60-startSecond)+endSecond;
			}
			player[i].setSecond(second);
		}
		viewResult();
	}
	public void setPlayer(){
		player=new Player[3];
	
		player[0]=new Player("황기태");
		player[1]=new Player("이재문");
		player[2]=new Player("정지윤");
	}
	public static void main(String[]args){
		Main main=new Main();
		main.setPlayer();
		main.play();
	}
}