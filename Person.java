public class Person{
	private String firstName;
	private String lastName;
	private int yearOfBirth;

	public Person(String firstName, String lastName, int yearOfBirth){
		this.firstName=firstName;
		this.lastName=lastName;
		this.yearOfBirth=yearOfBirth;
	}

	public String getFirstName(){
		return this.firstName;
	}

	public String getLastName(){
		return this.lastName;
	}

	public int getYearOfBirth(){
		return this.yearOfBirth;
	}

	public String toString(){
		return "" + firstName  + " " + lastName;
	}
}