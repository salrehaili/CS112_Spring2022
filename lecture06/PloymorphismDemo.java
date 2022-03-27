
public class PloymorphismDemo{


	public static void main(String[] args){
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());
		// double a=9;
		// float x= (float)a;

		if(new Student() instanceof Person)
			System.out.println("Yes");
		else
			System.out.println("No");
		float x=5.0f;
		double y= x;


	}
	public static void m(Object x){
		System.out.println(x.toString());
	}
}


class Person extends Object{
	public String toString(){
		return "Person";
	}
}

class Student extends Person{
	public String toString(){
		return "Student";
	}
}

class GraduateStudent extends Student{

}


