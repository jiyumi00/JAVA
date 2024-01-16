import java.util.*;
public class Main{
	Scanner scanner=new Scanner(System.in);
	ArrayList<Character> gradeList=new ArrayList<Character>();
	char grade;
	double average,sum=0;
	
	public double printAverage(){
		for(int i=0;i<6;i++){
			switch(gradeList.get(i)){
				case 'A':
					sum+=4.0;
					break;
				case 'B':
					sum+=3.0;
					break;
				case 'C':
					sum+=2.0;
					break;
				case 'D':
					sum+=1.0;
					break;
				case 'F' :
					sum+=0;
					break;
			}
		}
		return sum/gradeList.size();
	}
	public void inputGrade(){
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		
		for(int i=0;i<6;i++){
			grade=scanner.next().charAt(0);
			gradeList.add(grade);
		}
	}
	public static void main(String[]args){
		Main main=new Main();
		main.inputGrade();
		System.out.print(main.printAverage());
		
	}
}