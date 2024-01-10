class Point3D extends Point{
	private int z;
	public Point3D(int x,int y,int z){
		super(x,y);
		this.z=z;
	}
	public int getZ(){
		return z;
	}
	public void moveUp(){
		z++;
	}
	public void moveDown(){
		z--;
	}
	public void move(int x,int y,int z){
		move(x,y);
		this.z=z;
	}
	public String toString(){
		return "("+getX()+","+getY()+","+getZ()+")의 점";
	}
}