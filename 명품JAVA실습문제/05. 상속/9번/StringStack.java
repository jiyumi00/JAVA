public class StringStack implements Stack{
	private String arr[];
	private int top;
	
	public StringStack(int size){
		arr=new String[size];
		top=0;
	}
	
	public int length(){
		return top;
	}
	public int capacity(){
		return arr.length;
	}
	public String pop(){
		if(top==0){
			return "비어있음";
		}
		else{
			String str=arr[top-1];
			top--;
			return str;
		}
	}
	public boolean push(String val){
		if(top==arr.length){
			return false;
		}
		else{
			arr[top]=val;
			top++;
			return true;
		}
	}
	
}