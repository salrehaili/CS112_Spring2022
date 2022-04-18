public class testComparableCircle{
	public static void main(String[] args){
		ComparableCircle c1= new ComparableCircle(3.0);
		ComparableCircle c2= new ComparableCircle(3.4);
		
		System.out.println(c1.compareTo(c2));
	}
}