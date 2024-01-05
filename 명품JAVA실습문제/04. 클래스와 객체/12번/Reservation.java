import java.util.Scanner;
public class Reservation{
	Scanner scanner=new Scanner(System.in);
	
	int menu,type,num;
	String name;
	boolean find=false;
	
	SeatA[] seatA=new SeatA[10];
	SeatB[] seatB=new SeatB[10];
	SeatS[] seatS=new SeatS[10];
	
	//조회하기
	public void view(int type){
		if(type==1){
			System.out.print("S>> ");
		}
		else if(type==2){
			System.out.print("A>> ");
		}
		else if(type==3){
			System.out.print("B>> ");
		}
		else{
			System.out.println("없는 좌석입니다");
			return;
		}
		for(int i=0;i<10;i++){
			if(type==1){
				System.out.print(seatS[i].getName());
			}
			else if(type==2){
				System.out.print(seatA[i].getName());
			}
			else{
				System.out.print(seatB[i].getName());
			}
			System.out.print(" ");
		}
		System.out.println();
	}
	
	//예약하기
	public void save(){
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		type=scanner.nextInt();
		view(type);

		switch(type){
			case 1:
				System.out.print("이름>>");
				name=scanner.next();
				System.out.print("번호>>");
				num=scanner.nextInt();
				if((seatS[num-1].getName()).equals("---")){
					seatS[num-1].setName(name);
				}
				else{
					System.out.println("이미 있는 좌석입니다");
				}
				break;
			case 2:
				System.out.print("이름>>");
				name=scanner.next();
				System.out.print("번호>>");
				num=scanner.nextInt();
				if((seatA[num-1].getName()).equals("---")){
					seatA[num-1].setName(name);
				}
				else{
					System.out.println("이미 있는 좌석입니다");
				}
				break;
			case 3:
				System.out.print("이름>>");
				name=scanner.next();
				System.out.print("번호>>");
				num=scanner.nextInt();
				if((seatB[num-1].getName()).equals("---")){
					seatB[num-1].setName(name);
				}
				else{
					System.out.println("이미 있는 좌석입니다");
				}
				break;
		}
	}
	
	
	//취소하기
	public void cancel(){
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		find=false;
		type=scanner.nextInt();
		
		//타입별 조회하기
		view(type);
		switch(type){
			case 1:
				System.out.print("이름>>");
				name=scanner.next();
				for(int i=0;i<10;i++){
					if(name.equals(seatS[i].getName())){
						seatS[i].setName("---");
						find=true;
					}
				}
				if(find==false){
					System.out.println("예약된 이름이 없습니다");
				}
				break;
			case 2:
				System.out.print("이름>>");
				name=scanner.next();
				for(int i=0;i<10;i++){
					if(name.equals(seatA[i].getName())){
						seatA[i].setName("---");
						find=true;
					}
				}
				if(find==false){
					System.out.println("예약된 이름이 없습니다");
				}
				break;
			case 3:
				System.out.print("이름>>");
				name=scanner.next();
				for(int i=0;i<10;i++){
					if(name.equals(seatB[i].getName())){
						seatB[i].setName("---");
						find=true;
					}
				}
				if(find==false){
					System.out.println("예약된 이름이 없습니다");
				}
				break;
			default:
				System.out.println("없는 좌석입니다");
		}
	}
	//끝내기
	public void run(){
		System.out.println("명품콘서트홀 예약 시스템입니다");
		for(int i=0;i<10;i++){
			seatA[i]=new SeatA();
			seatB[i]=new SeatB();
			seatS[i]=new SeatS();
		}
		while(true){
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			menu=scanner.nextInt();
			
			if(menu==1){
				save();
			}
			else if(menu==2){
				view(1);
				view(2);
				view(3);
				System.out.println("<<조회를 완료하였습니다.>>");
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
	
	public static void main(String[]args){
		Reservation reservation=new Reservation();
		reservation.run();
	}
}