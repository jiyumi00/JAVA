class Main{
	public static void main(String[]args){
		Shape donut=new Circle(10);
		donut.redraw();
		System.out.println("면적은 "+donut.getArea());
	}
}