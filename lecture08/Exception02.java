/*
 * Spring 2022
 * CS112-Programming II
 * Dr. Sameer M. Alrehaili
*/
//An example of handled exception of type ArithmeticException thrown by JVM
// "Last line" will be printed out and the flow of the code will continue.

class Exception02{
	public static void main(String[] args){
		try{
			int a=1/0;	
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		

		System.out.println("Last line");
	}
}