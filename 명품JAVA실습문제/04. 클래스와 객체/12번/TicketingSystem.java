import java.util.Scanner;
class Reservation{
	Scanner scanner=new Scanner(System.in);
	
	String name;
	private Seat seat[];
	private String seatType[]={"S","A","B"};
	int menu,type,num;
	boolean check;
	
	public Reservation(){
		seat=new Seat[3];
		for(int i=0;i<seat.length;i++){
			seat[i]=new Seat();
		}
	}
	
	public void reserve(){
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		type=scanner.nextInt();
		if(type==1 || type==2 || type==3){
			System.out.print(seatType[type-1]+">> ");
			seat[type-1].show();
			
			System.out.print("이름>>");
			name=scanner.next();
			System.out.print("번호>>");
			num=scanner.nextInt();
			if((seat[type-1].get(num)).equals("---")){
				seat[type-1].set(name,num);
			}
			else{
				System.out.println("이미 있는 좌석입니다");
			}
		}
		else{
			System.out.println("좌석을 잘못 입력하였습니다");
			return;
		}
		
	}
	
	public void view(){
		for(int i=0;i<seat.length;i++){
			System.out.print(seatType[i]+">> ");
			seat[i].show();
		}
		System.out.println("<<<조회를 완료하였습니다>>>");
	}
	
	public void cancel(){
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		type=scanner.nextInt();
		if(type==1 || type==2 || type==3){
			System.out.print(seatType[type-1]+">> ");
			seat[type-1].show();
			
			System.out.print("이름>>");
			name=scanner.next();
			
			check=seat[type-1].reSet(name);
			if(check==true){
				System.out.println("<<<취소를 완료하였습니다>>>");
			}
			else{
				System.out.println("예약된 이름이 없습니다");
			}
			
		}
		else{
			System.out.println("좌석을 잘못 입력하였습니다");
			return;
		}
	}
	
	public void run(){
		while(true){
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			menu=scanner.nextInt();
			
			if(menu==1){
				reserve();
			}
			else if(menu==2){
				view();
			}
			else if(menu==3){
				cancel();
			}
			else if(menu==4){
				break;
			}
			else{
				System.out.println("없는 메뉴입니다");
			}
			
		}
	}
	
}

public class TicketingSystem{
	public static void main(String[]args){
		System.out.println("명품콘서트홀 예약 시스템입니다");
		Reservation reservation=new Reservation();
		reservation.run();
	}
}