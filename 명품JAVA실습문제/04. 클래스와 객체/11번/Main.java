import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int num1,num2;
		char operator;
		System.out.print("두 정수와 연산자를 입력하시오>>");
		num1=input.nextInt();
		num2=input.nextInt();
		operator=input.next().charAt(0);
		
		switch(operator){
			case '+':
				Add add=new Add();
				add.setValue(num1,num2);
				System.out.print(add.calculate());
				break;
				
			case '-':
				Sub sub=new Sub();
				sub.setValue(num1,num2);
				System.out.print(sub.calculate());
				break;
			
			case '*':
				Mul mul=new Mul();
				mul.setValue(num1,num2);
				System.out.print(mul.calculate());
				break;
				
			case '/':
				Div div=new Div();
				div.setValue(num1,num2);
				System.out.print(div.calculate());
				break;
			
			default:
				System.out.println("error");
		}
	}
}