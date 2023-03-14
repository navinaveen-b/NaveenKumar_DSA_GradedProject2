package employee;

public class Employee {
	private String firstName,lastName,email,passwd;
	public Employee() {
		
	}
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return(this.firstName);
	}
	public String getLastName() {
		return(this.lastName);
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public String getEmail() {
		return(this.email);
	}
	public String getPasswd() {
		return(this.passwd);
	}


}
