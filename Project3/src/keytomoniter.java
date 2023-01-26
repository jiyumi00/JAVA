import java.io.*;
import java.util.HashMap;
public class keytomoniter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
		
		OutputStreamWriter or=new OutputStreamWriter(System.out);
		
		PrintStream ps=new PrintStream(System.out);
		
		
		int num=Integer.parseInt(is.readLine());
		int sum=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				or.write(i+" ");;
				or.flush();
				sum+=i;
			}
			
		}
		ps.print("\nÇÕÀº "+sum);
		
		is.close();
		or.close();
		
		
	}
}
