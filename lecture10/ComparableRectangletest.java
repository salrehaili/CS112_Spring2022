public class ComparableRectangletest{
	public static void main(String[] args)
	{
		ComparableRectangle c1 = new ComparableRectangle(2,1);
		ComparableRectangle c2 = new ComparableRectangle(1,2);
		System.out.println("c1 = "+ c1.getArea());
		System.out.println("c2 = "+ c2.getArea());

		System.out.println(c1.compareTo(c2));
	}
}