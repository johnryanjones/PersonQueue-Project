
public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + " Age: " + age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getFirst() {
		return firstName;
	}
	
	public String getLast() {
		return lastName;
	}
}