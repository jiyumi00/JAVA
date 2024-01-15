import java.util.Scanner;
public class Main{
	Scanner scanner=new Scanner(System.in);
	Person []person=new Person[2];
	String name;

	public void play(){
		String input=scanner.nextLine();
		while(true){
			System.out.print("["+person[0].getName()+"]:<Enter>");
			input=scanner.nextLine();
			if(person[0].result()){
				System.out.print(person[0].getName()+"님이 이겼습니다!");
				break;
			}
			else{
				System.out.println("아쉽군요!");
			}
			System.out.print("["+person[1].getName()+"]:<Enter>");
			input=scanner.nextLine();
			if(person[1].result()){
				System.out.print(person[1].getName()+"님이 이겼습니다!");
				break;
			}
			else{
				System.out.println("아쉽군요!");
			}
		}
	}
	
	public void inputPlayer(){
		System.out.print("1번째 선수 이름>>");
		name=scanner.next();
		person[0]=new Person(name);
		
		System.out.print("2번째 선수 이름>>");
		name=scanner.next();
		person[1]=new Person(name);
		
	}
	public static void main(String[]args){
		Main main=new Main();
		Scanner scanner=new Scanner(System.in);
		main.inputPlayer();
		main.play();
	}
}