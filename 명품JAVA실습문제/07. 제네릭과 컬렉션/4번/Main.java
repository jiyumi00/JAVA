import java.util.*;
public class Main{
	Scanner scanner=new Scanner(System.in);
	int rainfall,sum=0,average;
	Vector<Integer> rainfallList=new Vector<Integer>();
	
	public void view(){
		sum=0;
		for(int i=0;i<rainfallList.size();i++){
			System.out.print(rainfallList.get(i)+" ");
			sum+=rainfallList.get(i);
		}
		System.out.println();

		average=sum/rainfallList.size();
		System.out.println("현재 평균 "+average);
	}
	public void run(){
		while(true){
			System.out.print("강수량 입력 (0 입력시 종료)>>");
			rainfall=scanner.nextInt();
			if(rainfall==0) break;
			rainfallList.add(rainfall);
			
			view();
		}
	}
	public static void main(String[]args){
		Main main=new Main();
		main.run();
	}
}