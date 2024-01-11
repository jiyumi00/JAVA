class Circle implements Shape{
	private int size;
	public Circle(int size){
		this.size=size;
	}
	public void draw(){
		System.out.println("반지름이 "+size+"인 원입니다");
	}
	public double getArea(){
		return size*size*PI;
	}
}