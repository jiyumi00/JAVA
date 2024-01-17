import java.util.*;
public class Main{
	Scanner scanner=new Scanner(System.in);
	Student [] student;
	static ArrayList<Student> manage;
	String info,name,major,numberStr,gradeStr;
	double grade;
	int number;
	
	public void inputInfo(){
		student=new Student[4];
		manage=new ArrayList<Student>();
		
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요");
		for(int i=0;i<4;i++){
			System.out.print(">> ");
			info=scanner.nextLine();
			
			StringTokenizer st=new StringTokenizer(info,", ");
			name=st.nextToken().trim();
			major=st.nextToken().trim();
			numberStr=st.nextToken().trim();
			gradeStr=st.nextToken().trim();
			
			grade=Double.parseDouble(gradeStr);
			number=Integer.parseInt(numberStr);
			
			student[i]=new Student(name,major,number,grade);
			manage.add(student[i]);
		}
	}
	
	public void viewInfo(){
		for(int i=0;i<manage.size();i++){
			System.out.println("-------------------------");
			Student studentInfo=manage.get(i);
			System.out.println("이름:"+studentInfo.getName());
			System.out.println("학과:"+studentInfo.getMajor());
			System.out.println("학번:"+studentInfo.getNumber());
			System.out.println("학점평균:"+studentInfo.getGrade());
		}
	}
	
	public void searchInfo(){
		String searchName;
		boolean result;
		
		System.out.println("-------------------------");
		while(true){
			System.out.print("학생 이름 >> ");
			result=false;
			searchName=scanner.next();
			if(searchName.equals("그만")) break;
			
			for(int i=0;i<manage.size();i++){
				Student studentInfo=manage.get(i);
				result=studentInfo.findName(searchName);
				
				if(result==true){
					studentInfo.getInfo(searchName);
					break;
				}
			}
			if(result==false){
				System.out.println("해당 학생이 없습니다");
			}
			
		}
	}
	public static void main(String[]args){
		Main main=new Main();
		main.inputInfo();
		main.viewInfo();
		main.searchInfo();
	}
}