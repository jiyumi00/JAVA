public class Circle{
	private double x,y;
	private int radius;
	public Circle(double x, double y, int radius){
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public int getRadius(){
		return this.radius;
	}
	public void show(){
		System.out.println("가장 면적이 큰 원은 ("+x+","+y+")"+radius);
	}
	
}