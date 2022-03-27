package lecture08;

public class TestCircleWithRadiusException {
	public static void main(String[] args) {
		  try {
			  new CircleWithRadiusException(5);
			  new CircleWithRadiusException(-5);
			  new CircleWithRadiusException(0);
		  }
		  catch (InvalidRadiusException ex) {
			  System.out.println(ex);
		 }
		
		 System.out.println("Number of objects created: " + CircleWithRadiusException.getNumberOfObjects());
		 } 

}
