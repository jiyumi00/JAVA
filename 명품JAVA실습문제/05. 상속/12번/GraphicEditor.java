import java.util.Scanner;
public class GraphicEditor{
	Scanner scanner=new Scanner(System.in);
	int option;
	int shapeType;
	public void insert(){
		System.out.print("Line(1), Rect(2), Circle(3)>>");
		shapeType=scanner.nextInt();
		
		Shape shape;
		switch(shapeType){
			case 1:
				shape=new Line();
				
				break;
			case 2:
				shape=new Rect();
				break;
			case 3:
				shape=new Circle();
				break;
			case 4:
				System.out.println("없는 모양입니다");
				return;
		}
	}
	public void delete(){
		
	}
	public void view(){
		
		
	}
	
	public void run(){
		System.out.println("그래픽 에디터 beauty을 실행합니다");
		
		while(true){
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
			option=scanner.nextInt();
			
			switch(option){
				case 1:
					insert();
					break;
				case 2:
					delete();
					break;
				case 3:
					view();
					break;
				case 4:
					System.out.println("beauty을 종료합니다");
					return;
				default: 
					System.out.println("없는 옵션입니다");
			}
		}
	}
	public static void main(String[]args){
		GraphicEditor ge=new GraphicEditor();
		ge.run();
		
	}
}