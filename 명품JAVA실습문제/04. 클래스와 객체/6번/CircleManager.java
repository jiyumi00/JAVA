import java.util.Scanner;
public class CircleManager{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		Circle c[]=new Circle[3];
		for(int i=0;i<c.length;i++){
			System.out.print("x, y, radius >>");
			double x=scanner.nextDouble();
			double y=scanner.nextDouble();
			int radius=scanner.nextInt();
			c[i]=new Circle(x,y,radius);
		}
		int max=0;
		int index=0;
		for(int i=0;i<c.length;i++) {
			if(max<c[i].getRadius()){
				max=c[i].getRadius();
				index=i;
			}
		}
		c[index].show();
		scanner.close();
	}
}