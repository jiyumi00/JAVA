import java.util.Scanner;
public class PhoneBook{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int num;
		String name,tel,searchName;
		boolean find=false;
		
		System.out.print("인원수>>");
		num=input.nextInt();
		
		Phone []phone=new Phone[num];
		
		for(int i=0;i<num;i++){
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			name=input.next();
			tel=input.next();
			phone[i]=new Phone(name,tel);
		}
		System.out.println("저장되었습니다...");
		
		while(true){
			find=false;
			System.out.print("검색할 이름>>");
			searchName=input.next();
			
			if(searchName.equals("그만")) break;
			
			for(int i=0;i<num;i++){
				if(searchName.equals(phone[i].getName())){
					find=true;
					System.out.println(searchName+"의 번호는 "+phone[i].getTel()+" 입니다");
				}
			}
			if(find==false) System.out.println(searchName+" 이 없습니다");
		}
	}
}