/*
 * Spring 2022
 * CS112-Programming II
 * Dr. Sameer M. Alrehaili
*/
//An example of not handled exception of type ArithmeticException thrown by JVM
// "Last line" will not be printed as the program terminates abnormally.

class Exception01{
	public static void main(String[] args){
		int a=1/0;

		System.out.println("Last line");
	}
}