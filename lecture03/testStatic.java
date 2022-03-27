/*
 * Spring 2022
 * CS112-Programming II
 * Dr. Sameer M. Alrehaili
*/
//Using static modifier

class testStatic{
	public static void main(String[] args){
		Student s1 = new Student();
		System.out.println(s1.m1());

		Student s2 = new Student();
		System.out.println(s2.m1());

		//Using class name instead of the object name
		Student s3 = new Student();
		System.out.println(Student.m1());
	}
}

class Student{
	static int no=0;
	int id;
	String name;

	public Student(){
		no++;
	}
	static String m1(){
		return "Number of students is: "+ no;
	}

}