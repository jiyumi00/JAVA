class Seat{
	private String seat[];
	
	public Seat(){
		seat=new String[10]; 
		for(int i=0;i<seat.length;i++){
			seat[i]="---";
		}
	}
	
	public String get(int num){
		return seat[num-1];
	}
	public void show(){ 
		for(int i=0;i<seat.length;i++){
			System.out.print(seat[i]+" ");
		}
		System.out.println();
	}

	public void set(String name,int num){
		seat[num-1]=name;
	}
	
	public boolean reSet(String name){
		for(int i=0;i<seat.length;i++){
			if(name.equals(seat[i])){
				seat[i]="---";
				return true;
			}
		}
		return false;
	}
}