class MyPoint{
	private int x,y;
	MyPoint(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String toString(){
		return "Point("+x+","+y+")";
	}
	public boolean equals(Object obj){
		MyPoint mp=(MyPoint)obj;
		if(x==mp.x && y==mp.y) return true;
		else return false;
	}
}