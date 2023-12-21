public class Grade{
	private int math;
	private int science;
	private int english;
	
	public int average(){
		return (math+science+english)/3;
	}
	public Grade(int math,int science,int english){
		this.math=math;
		this.science=science;
		this.english=english;
	}
}