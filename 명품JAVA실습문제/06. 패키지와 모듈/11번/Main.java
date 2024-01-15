import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Main main=new Main();
		Scanner scanner=new Scanner(System.in);
	
		String str;
		String input; 
		
		System.out.print(">>");
		str=scanner.nextLint();
		
		while(true){
			System.out.print("명령: ");
			input=scanner.next();
		
			if(input.equals("그만"){
				break;
			}
			
		}
		
	}
}