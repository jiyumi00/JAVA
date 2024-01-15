public class Person{
	private String name;
	private int []num;
	
	public Person(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public boolean result(){
		num=new int[3];
		
		num[0]=(int)(Math.random()*3+1);
		num[1]=(int)(Math.random()*3+1);
		num[2]=(int)(Math.random()*3+1);
	
		for(int i=0;i<num.length;i++){
			System.out.print("   "+num[i]+" ");
		}
		if(num[0]==num[1] && num[1]==num[2]){
			return true;
		}
		else{
			return false;
		}
		
	}
}