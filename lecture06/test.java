public class test{
	public static void main(String[] args){
		Car c1 = new Car();
		System.out.println(c1.getYear());
	}
}

class Car{
	private String year;
	public String getYear(){
		return this.year;
	}
}