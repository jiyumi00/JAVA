import java.util.*;
public class Main{
	Scanner scanner=new Scanner(System.in);
	HashMap<String,Double> manage;
	String name;
	double grade,scholarshipGrade;
	
	public void inputStudent(){
		manage=new HashMap<String,Double>();
		
		System.out.println("미래장학금관리시스템입니다.");
		for(int i=0;i<5;i++){
			System.out.print("이름과 학점>> ");
			name=scanner.next();
			grade=scanner.nextDouble();
			manage.put(name,grade);
		}
	}
	public void selectStudent(){
		System.out.print("장학생 선발 학점 기준 입력>> ");
		scholarshipGrade=scanner.nextDouble();
		System.out.print("장학생 명단 : ");
		
		Set<String> keys=manage.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()){
			name=it.next();
			grade=manage.get(name);
			
			if(grade>=scholarshipGrade){
				System.out.print(name+" ");
			}
		}
	}
	public static void main(String[]args){
		Main main=new Main();
		
		main.inputStudent();
		main.selectStudent();
	}
}