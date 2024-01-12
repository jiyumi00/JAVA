import java.util.Scanner;
import java.util.StringTokenizer;
public class Main1{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		String str;
		int tokenCnt;
		while(true){
			str=scanner.nextLine();
			if(str.equals("그만")){
				System.out.println("종료합니다...");
				break;
			}
			StringTokenizer st=new StringTokenizer(str," ");
			tokenCnt=st.countTokens();
			System.out.println("어절 개수는 "+tokenCnt);
		}
		scanner.close();
	}
}