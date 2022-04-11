public class Rectangles{
	public static void main(String[] args){
		ComparableRectangle o1 = new ComparableRectangle(2,3);
		ComparableRectangle o2 = new ComparableRectangle(4,3);

		System.out.println(o1.toString());
		System.out.println(o2.toString());		
		System.out.println(o2.compareTo(o1));
	}
}