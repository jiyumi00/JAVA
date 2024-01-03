import java.util.Scanner;
public class DicApp{
	
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true){
			System.out.print("한글 단어?");
			String word=input.next();
			
			if(word.equals("그만")){
				break;
			}
			else{
				Dictionary dic=new Dictionary();
				System.out.println(dic.kor2Eng(word));
			}
		}
	}
}