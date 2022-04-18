public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
	private int age;
	
	ComparableCircle(double radius){
		super(radius);
	}

	public int compareTo(ComparableCircle o)
	{
		if(this.getArea()>o.getArea())
			return 1;
		else if(this.getArea() == o.getArea())
			return 0;
		else
			return -1;
	}
}