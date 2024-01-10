class PositivePoint extends Point{
	protected void move(int x,int y) {
		if(x>=0 && y>=0){
			super.move(x,y);
		}
		else{
			return;
		}
	}
	public PositivePoint(){
		super(0,0);
	}
	public PositivePoint(int x,int y){
		super(x,y);
		if(x>=0 && y>=0){
			return;
		}
		else{
			move(0,0);
		}
	}
	public String toString(){
		return "("+getX()+","+getY()+")의 점";
	}
}