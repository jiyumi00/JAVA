import java.util.Scanner;
public class Main2{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		String str;
		while(true){
			str=scanner.nextLine();
			
			if(str.equals("그만")){
				System.out.println("종료합니다...");
				break;
			}
			String []token=str.split(" ");
			
			System.out.println("어절 개수는 "+token.length);
		}
		scanner.close();
	}
}