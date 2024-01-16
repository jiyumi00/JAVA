import java.util.*;

public class Main{
	public static void main(String[]args){
		Vector<Integer> v=new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(100);
		v.add(-1);
		
		v.add(2,3);
		
		Iterator<Integer> it=v.iterator();
		while(it.hasNext()){
			int n=it.next();
			System.out.println(n);
		}
		
	}
}