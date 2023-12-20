public class TV{
	String name;
	int year;
	int size;
	
	public TV(String name,int year,int size){
		this.name=name;
		this.year=year;
		this.size=size;
	}
	public void show(){
		System.out.print(name+"에서 만든 "+year+"년형 "+size+"인치 TV");
	}
}