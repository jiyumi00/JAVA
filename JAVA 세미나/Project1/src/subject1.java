import java.util.Scanner;
public class subject1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�:");
		int num=sc.nextInt();
		int sum=0;
		System.out.print("��� : ");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+", ");
				sum+=i;
			}
			
		}
		System.out.println("\n����� �� : "+sum);
		sc.close();
	}
}
