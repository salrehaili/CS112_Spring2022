public class Circle{
	private double radius;
	private static int numberOfObjects=0;
	
	public Circle(){
		this.radius=1;
		numberOfObjects++;
	}

	public Circle(double newRadius){
		this.radius=newRadius;
		numberOfObjects++;
	}
	public double getArea(){
		return radius * radius * Math.PI;
	}
	public double getPermieter(){
		return 2 * radius * Math.PI;
	}
	public void setRadius(double newRadius){
		this.radius=newRadius;
	}
	public double getRadius(){
		return this.radius;
	}
	public static int getNumberOfObjects(){
		return numberOfObjects;
	}
}