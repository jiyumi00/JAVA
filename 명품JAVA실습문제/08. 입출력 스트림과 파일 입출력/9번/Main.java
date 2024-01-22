import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[]args){
		
		File file=null;
		File subFiles[]=null;
		int fileCnt=0;
		String fileName;
		try{
			file=new File("c:\\Temp");
			subFiles=file.listFiles();
			
			for(int i=0;i<subFiles.length;i++){
				fileName=subFiles[i].getName();
				int index=fileName.lastIndexOf(".txt");
				if(index!=-1){
					subFiles[i].delete();
					fileCnt++;
					System.out.println(subFiles[i].getPath()+" 삭제");
				}
			}
			System.out.println("총 "+fileCnt+"개의 .txt파일을 삭제하였습니다");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}