package lecture02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String studentName;
		double studentGPA;
		int studentID;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter student's name: ");
		studentName = input.next();
		System.out.println("Enter student's GPA: ");
		studentGPA = input.nextDouble();
		System.out.println("Enter student's ID: ");
		studentID = input.nextInt();
		
		Student student = new Student(studentName);
		student.GPA = studentGPA;
		student.SID = studentID;
		
		System.out.println("Student's data: \nName:\t" + student.name + "\nGPA:\t" +
		student.GPA + "\nSID:\t" + student.SID);
		

	}

}