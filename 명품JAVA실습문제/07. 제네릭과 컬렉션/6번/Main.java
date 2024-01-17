import java.util.*;
public class Main{
	Scanner scanner=new Scanner(System.in);
	Location []location;
	HashMap<String,Location> manage;
	String info,name,seachName;
	int latitude,longtitude;
	
	public void inputCity(){
		location=new Location[4];
		manage=new HashMap<String,Location>();
		
		System.out.println("도시,경도,위도를 입력하세요.");
		for(int i=0;i<4;i++){
			System.out.print(">> ");
			info=scanner.nextLine();
			
			StringTokenizer st=new StringTokenizer(info,", ");
			name=st.nextToken().trim();
			latitude=Integer.parseInt(st.nextToken().trim());
			longtitude=Integer.parseInt(st.nextToken().trim());
			
			location[i]=new Location(name,latitude,longtitude);
			manage.put(name,location[i]);
		}
	}
	public void viewCity(){
		System.out.println("-------------------------");
		Set<String>keys=manage.keySet();
		Iterator<String>it=keys.iterator();
		while(it.hasNext()){
			String key=it.next();
			Location cityInfo=manage.get(key);
			System.out.println(cityInfo.getAll());
		}
	}
	public void searchCity(){
		System.out.println("-------------------------");
		while(true){
			System.out.print("도시이름 >> ");
			seachName=scanner.next();
			
			if(seachName.equals("그만")) break;
			
			Location cityInfo=manage.get(seachName);
			if(cityInfo==null){
				System.out.println(seachName+"는 없습니다.");
			}
			else{
				System.out.println(cityInfo.getAll());
			}
		}
	}
	public static void main(String[]args){
		Main main=new Main();
		
		main.inputCity();
		main.viewCity();
		main.searchCity();
	}
}