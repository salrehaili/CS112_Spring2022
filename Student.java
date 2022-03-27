
public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private double gpa;
	private String email;
	
	public Student(int id, String firstName, String lastName, double gpa, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa=gpa;
		this.email=email;
	}
	public int getId(){
		return this.id;
	}
	public setId(int id){
		this.id=id;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getLastName(){
		return this.getLastName;
	}
	public setLastName(String lastName){
		this.getLastName = lastName;
	}
	public double getGpa(){
		return this.gpa;
	}
	public setGpa(double gpa){
		this.gpa = gpa;
	}
	public String getEmail(){
		return this.email;
	}
	public setEmail(String email){
		this.email = email;
	}
}