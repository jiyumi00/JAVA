public class Player{
	private String name;
	private int second;
	
	public Player(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public int getSecond(){
		return second;
	}
	public void setSecond(int second){
		this.second=second;
	}
}