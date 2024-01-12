class Circle{
	private int x,y,radius;
	public Circle(int x,int y,int radius){
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	public String toString(){
		return "Circle("+x+","+y+")반지름"+radius;
	}
	public boolean equals(Object obj){
		Circle circle=(Circle)obj;
		if(circle.x==x &&circle.y==y){
			return true;
		}
		else return false;
	}
}