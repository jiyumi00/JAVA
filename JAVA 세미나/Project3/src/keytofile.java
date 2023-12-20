import java.io.*;
import java.util.HashMap;

public class keytofile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Reader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		
		////////////////////////
		
		HashMap<String, Integer> map=new HashMap<String,Integer>();
		
		String nameList=br.readLine();
		String[] name_arr=nameList.split(" ");
	
		for(int i=0;i<name_arr.length;i++)
		{
			map.put(name_arr[i], 0);
		}
		
		for(int i=0;i<name_arr.length;i++)
		{
			int cnt=map.get(name_arr[i]);
			cnt++;
			map.put(name_arr[i], cnt);
		}
		/////////////////////////////
		
		File file1=new File("C:\\Users\\joung\\eclipse-workspace\\Stream\\output.txt");
		Writer w=new FileWriter(file1);
		BufferedWriter bw=new BufferedWriter(w);
		
		for(String key : map.keySet())
		{
			bw.write(key+ " : "+ map.get(key)+'\n');
		}
		System.out.println("파일에서 출력 성공");
		br.close();
		bw.close();
		
	}

}
