public class Student{
	private String name;
	private String major;
	private int number;
	private double grade;
	
	public Student(String name,String major,int number, double grade){
		this.name=name;
		this.major=major;
		this.number=number;
		this.grade=grade;
	}
	public String getName(){
		return name;
	}
	public String getMajor(){
		return major;
	}
	public int getNumber(){
		return number;
	}
	public double getGrade(){
		return grade;
	}
	public boolean findName(String name){
		if(name.equals(this.name)){
			return true;
		}
		else{
			return false;
		}
	}
	public void getInfo(String name){
		if(name.equals(this.name)){
			String numberStr=Integer.toString(number);
			String gradeStr=Double.toString(grade);
			
			System.out.println(name+", "+major+", "+numberStr+", "+gradeStr);
		}
	}
	
}