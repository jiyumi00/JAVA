import java.util.*;
public class Main{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		int max=0;
		Vector<Integer> v=new Vector<Integer>();
		
		System.out.print("정수(-1이 입력될 때까지)>>");
		while(true){
			int num=scanner.nextInt();
			if(num==-1){
				break;
			}
			v.add(num);
		}
		for(int i=0;i<v.size();i++){
			if(max<v.get(i)){
				max=v.get(i);
			}
		}
		System.out.print("가장 큰 수는 "+max);
	}
}