import java.io.BufferedReader;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//for문으로 
public class subject2 {
	
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
			int num=0;
			List<String> name_arr=fileLineRead("nameList.txt");
			ArrayList<String> cnt=new ArrayList<String>();
			ArrayList<String> index=new ArrayList<String>();
			ArrayList<String> arr=new ArrayList<String>();
	
			for(int i=0;i<name_arr.size();i++) //0 
			{
				num=1;
				for(int j=i+1;j<name_arr.size();j++) //1...5,6
				{
					if(name_arr.get(i).equals(name_arr.get(j))) 
					{
						num++;//3
						//index.add(String.valueOf(j));//5
						arr.add(String.valueOf(j));
					}
							
				}
				
				for(int k=0;k<index.size();k++)
				{
					
				}
				//cnt.add(String.valueOf(num));
			}
				
			for(int i=0;i<name_arr.size();i++)
			{
				System.out.println(name_arr.get(i)+" : "+cnt.get(i)+" : "+index.get(i));
			}	
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			System.out.println("파일을 읽어오는 데 문제가 발생했습니다");
		}
	}

}
