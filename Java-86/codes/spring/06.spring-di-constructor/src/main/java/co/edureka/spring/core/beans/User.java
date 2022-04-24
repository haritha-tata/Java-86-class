package co.edureka.spring.core.beans;

public class User {
	private String firstName;
	private String lastName;
	private Car car;
	
	public User(String firstName, String lastName, Car car) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.car = car;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
