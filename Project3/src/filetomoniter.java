import java.io.*;
import java.util.*;

public class filetomoniter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("nameList.txt");
		Reader r= new FileReader(file);
		BufferedReader br=new BufferedReader(r);
		
		////////////////////////
		ArrayList<String> name_arr=new ArrayList<String>();
		HashMap<String, Integer> map=new HashMap<String,Integer>();
		String name;
		while((name=br.readLine())!=null)
		{
			name_arr.add(name);
		}
		
		for(int i=0;i<name_arr.size();i++)
		{
			map.put(name_arr.get(i), 0);
		}
		
		for(int i=0;i<name_arr.size();i++)
		{
			int cnt=map.get(name_arr.get(i));
			cnt++;
			map.put(name_arr.get(i), cnt);
		}
		/////////////////////////////
		
		
		PrintStream ps=new PrintStream(System.out);
		for(String key : map.keySet())
		{
			ps.println(key+ " : "+ map.get(key));
		}
	}

}
