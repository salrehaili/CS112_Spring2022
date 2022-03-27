
public class test{
	public static void main(String[] args) {
		Circle circle1 = new Circle(1);
		System.out.println(circle1.getArea());
		System.out.println("The number of objects is : " + circle1.getNumberOfObjects());

		Circle circle2 = new Circle(25);
		System.out.println(circle2.getArea());
		System.out.println("The number of objects is : " + circle2.getNumberOfObjects());

		Circle circle3 = new Circle(125);
		System.out.println(circle3.getArea());

		System.out.println("The number of objects is : " + circle3.getNumberOfObjects());

		
	}
}