import java.util.*;

public class aaa{
	public static void main(String[] args){
		// Date D = new Date();
		// Child B = new Child();
		// B.print();
		// Random random1 = new Random(3);
		// System.out.print("The value of Random object is :: ");
		// for(int i =1;i<4;i++)
		// 	System.out.print(random1.nextInt(88) + " ");

		Child B = new Child();
		B.print();
		Date D = new Date();
		Random R = new Random(3);
		System.out.print("The Random value is: ");
		for(int i=0;i<2;i++)
			System.out.print(R.nextInt(8)+" ");
		System.out.println("\n"+D.toString());

	}
}

class Parent{
	int r= 7;
	void print(){
		System.out.println("The result of variable r is: "+r);
	}
}

class Child extends Parent{
	int r =4;
}