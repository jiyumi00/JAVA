import java.util.Scanner;
public class MonthSchedule{
	Scanner input=new Scanner(System.in);
	private int dayNum,option,date;
	boolean state=true;
	Day day[];
	
	public MonthSchedule(int dayNum){
		this.dayNum=dayNum;
		day=new Day[dayNum];
		for(int i=0;i<day.length;i++){
			day[i]=new Day();
		}
	}
	public void input(){
		System.out.print("날짜(1~30)?");
		date=input.nextInt();
		System.out.print("할일(빈칸없이 입력)?");
		String work=input.next();
		
		day[date-1].set(work);
	}
	public void view(){
		System.out.print("날짜(1~30)?");
		date=input.nextInt();
		System.out.print(date+"일의 할 일은 ");
		day[date-1].show();
	}
	public void finish(){
		System.out.println("프로그램을 종료합니다");
		state=false;
	}
	public void run(){
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while(state){
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)>>");
			option= input.nextInt();
			switch(option){
				case 1:
					input();
					break;
				case 2:
					view();
					break;
				case 3:
					finish();
					break;
				default:
					System.out.println("다시 입력해주세요");
			}
			System.out.println();
		}
	}
	public static void main(String[]args){
		MonthSchedule april=new MonthSchedule(30);
		april.run();
	}
}