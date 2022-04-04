/*
 * Spring 2022
 * CS112-Programming II
 * Dr. Sameer M. Alrehaili
*/
//Catching Multiple Exceptions
//Here is another example of how to handle multiple exceptions.
// "Last line" will be printed out and the flow of the code will continue.

class Exception03{
	public static void main(String[] args){
		String s=null;
		
		try{
			s.length();

		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println("Last line");
	 }
}