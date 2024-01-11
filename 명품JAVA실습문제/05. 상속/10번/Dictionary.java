class Dictionary extends PairMap{
	private int top=0;
	private int size;

	public Dictionary(int size){
		this.size=size;
		keyArray=new String[size];
		valueArray=new String[size];
	}
	public String get(String key){
	   for(int i=0;i<size;i++){
		   if(key.equals(keyArray[i])){
			   return valueArray[i]; 
		   }
	   }
	   return null;
	}
	public void put(String key,String value){

		if(top==size){
			System.out.println("배열이 꽉 찼습니다");
			return;
		}
		for(int i=0;i<size;i++){
			if(key.equals(keyArray[i])){
				valueArray[i]=value;
				return;
			}
		}
		keyArray[top]=key;
		valueArray[top]=value;
		top++;
	}
	public String delete(String key){
		for(int i=0;i<size;i++){
			if(key.equals(keyArray[i])){
				valueArray[i]="null";
				keyArray[i]="null";
				return "null";
			}
		}
		return "해당 키 없음";
	}
	public int length(){
		return top;
	}
}