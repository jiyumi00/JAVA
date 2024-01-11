class Oval implements Shape{
	private int width,height;
	public Oval(int width,int height){
		this.width=width;
		this.height=height;
	}
	public void draw(){
		System.out.println(width+"*"+height+"에 내접하는 타원입니다");
	}
	public double getArea(){
		return width*height*PI;
	}
}