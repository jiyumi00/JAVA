import java.util.Scanner;
public class subject1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하시오:");
		int num=sc.nextInt();
		int sum=0;
		System.out.print("약수 : ");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+", ");
				sum+=i;
			}
			
		}
		System.out.println("\n약수의 합 : "+sum);
		sc.close();
	}
}
