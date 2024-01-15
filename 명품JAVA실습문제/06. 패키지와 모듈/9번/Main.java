import java.util.Scanner;
public class Main{
	public static int option;
	public static int computerOption;
	public void result(){
		if(option==computerOption){
			System.out.println("무승부입니다");
		}
		else{
			if((option==1 && computerOption==2) || (option==2 && computerOption==3) ||(option==3 && computerOption==1)){
				System.out.println("컴퓨터가 이겼습니다");
			}
			else{
				System.out.println("철수가 이겼습니다");
			}
		}
		
	}
	public void print(){
		String view="";
		switch(computerOption){
			case 1:
				view="컴퓨터(가위)";
				break;
			case 2:
				view="컴퓨터(바위)";
				break;
			case 3:
				view="컴퓨터(보)";
				break;
		}
		view+=" : ";
		switch(option){
			case 1:
				view+="철수(가위)";
				break;
			case 2:
				view+="철수(바위)";
				break;
			case 3:
				view+="철수(보)";
				break;
		}
		System.out.println(view);
	
	}
	public static void main(String[]args){
		Main main=new Main();
		Scanner scanner=new Scanner(System.in);
	
		while(true){
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			option=scanner.nextInt();
			computerOption=(int)(Math.random()*3+1);
			
			if(option==4){
				break;
			}
			main.print();
			main.result();
			
		}
	}
}