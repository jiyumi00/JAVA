import java.util.Scanner;
public class Main{
	Scanner scanner=new Scanner(System.in);
	Person []person;
	String name;
	int cnt;

	public void play(){
		String input=scanner.nextLine();
		boolean end=false;
		while(true){
			for(int i=0;i<cnt;i++){
				System.out.print("["+person[i].getName()+"]:<Enter>");
				input=scanner.nextLine();
				if(person[i].result()){
					System.out.print(person[i].getName()+"님이 이겼습니다!");
					end=true;
					break;
				}
				else{
					System.out.println("아쉽군요!");
				}
				
			}
			if(end){
				break;
			}
		}
	}
	
	public void inputPlayer(){
		System.out.print("갬블링 게임에 참여할 선수 숫자>>");
		cnt=scanner.nextInt();
		
		person=new Person[cnt];
		
		for(int i=0;i<cnt;i++){
			System.out.print(i+1+"번째 선수 이름>>");
			name=scanner.next();
			person[i]=new Person(name);
		}
		
	}
	public static void main(String[]args){
		Main main=new Main();
		Scanner scanner=new Scanner(System.in);
		main.inputPlayer();
		main.play();
	}
}