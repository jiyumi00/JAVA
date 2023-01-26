import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//hashmap으로 
public class subject3 {
	public static List<String> fileLineRead(String text) throws IOException
	{
		ArrayList<String> nameList=new ArrayList<String>();
		//String[] name_arr=new String[nameList.size()];
		BufferedReader br=new BufferedReader(new FileReader(new File(text)));
		String name;
		while((name=br.readLine())!=null)
		{
			nameList.add(name);
		}
		br.close();
		
		return nameList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
			List<String> name_arr=fileLineRead("nameList.txt");
			
			HashMap<String, Integer> map=new HashMap<String,Integer>();
			
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
			
			for(String name : map.keySet())
			{
				System.out.println(name+ " : "+ map.get(name));
			}
		
			
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			System.out.println("파일을 읽어오는 데 문제가 발생했습니다");
		}
	}

}
