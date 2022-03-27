import java.util.*;

public class Poly_test{
	public static void main(String[] args){
		Student p = new Student();
		System.out.println(p.a());

		System.out.println(p.p);
	}

	public static void m(Student x){
		System.out.println(x.toString());
	}
}


class Person{
	public Person p;
	public String a(){
		return "Person";
	}
}

class Student extends Person{
	public String a(){
		return "Student";
	}
}

class GraduateStudent extends Student{

}


