class Rect implements Shape{
	private int width,height;
	public Rect(int width,int height){
		this.width=width;
		this.height=height;
	}
	public void draw(){
		System.out.println(width+"*"+height+"크기의 사각형 입니다");
	}
	public double getArea(){
		return width*height;
	}
}