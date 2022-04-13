public class test{
	public static void main(String[] args){
		Student s1 = new Student(30);
		Student s2 = new Student(31);
		System.out.println(s1.compareTo(s2));
	}
}


class Student implements Comparable<Student>{
	private int age;

	public int getAge(){
		return this.age;
	}
	Student(int a){
		this.age=a;
	}

	public int compareTo(Student o){
		if(this.age > o.getAge())
			return 1;
		else if(this.age==o.getAge())
			return 0;
		else
			return -1;
	}
}

