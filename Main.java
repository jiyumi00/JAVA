import java.util.Scanner;
public class Main{
	public static void main(String[]args)throws Exception{
		
		int n,x,a;
		Scanner input=new Scanner(System.in);
		
		n=input.nextInt();
		x=input.nextInt();
		
		for(int i=0;i<n;i++){
			a=input.nextInt();
			if(a<x){
				System.out.print(a+" ");
			}
		}
		
	}
}