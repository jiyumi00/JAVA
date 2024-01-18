import java.util.*;
public class Main{
	HashMap<String,Integer> pointManage;
	String name,searchName;
	int point;
	boolean find;
	Scanner scanner=new Scanner(System.in);
	
	public void inputPoint(String name,int point){
		find=pointManage.containsKey(name);
		
		if(find==true){
			pointManage.put(name,pointManage.get(name)+point);
		}
		else{
			pointManage.put(name,point);	
		}

	}
	public void view(){
		Set<String>keys=pointManage.keySet();
		Iterator<String>it=keys.iterator();
		
		while(it.hasNext()){
			name=it.next();
			point=pointManage.get(name);
			
			System.out.print("("+name+","+point+")");
		}
		System.out.println();
	}
	public void run(){
		System.out.println("** 포인트 관리 프로그램입니다 **");
		
		pointManage=new HashMap<String,Integer>();
		while(true){
			System.out.print("이름과 포인트 입력>> ");
			name=scanner.next();
			if(name.equals("그만")) break;
			point=scanner.nextInt();
			
			inputPoint(name,point);
			
			view();
		}
	}
	public static void main(String[]args){
		Main main=new Main();
		main.run();
	}
}