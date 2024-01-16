import java.util.*;
public class Main{
	Scanner scanner=new Scanner(System.in);
	String str,input;
	int index;
	StringBuffer sb;
	
	public void interpret(String input){
		String []tokens=input.split("!");
		
		if(tokens.length!=2 || tokens[0].length()==0 || tokens[1].length()==0){
			System.out.println("잘못된 명령입니다");
		}
		else{
			index=sb.indexOf(tokens[0]);
			if(sb.indexOf(tokens[0])==-1){
				System.out.println("찾을 수 없습니다");
			}
			else{
				sb.replace(index,index+tokens[0].length(),tokens[1]);
				System.out.println(sb.toString());
			}
		}
		
	}
	public void run(){
		System.out.print(">>");
		str=scanner.nextLine();
		sb=new StringBuffer(str);
		
		while(true){
			System.out.print("명령: ");
			input=scanner.next();
			if(input.equals("그만")){
				break;
			}
			interpret(input);
		}
	}
	public static void main(String[]args){
		Main main=new Main();
		main.run();
	}
}