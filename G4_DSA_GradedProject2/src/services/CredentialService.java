package services;

import employee.Employee;
import java.util.Random;

public class CredentialService {
	private String deptName,company;
	public Employee emp = new Employee("Naveen","Kumar");
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDeptName() {
		return(this.deptName);
	}
	public String getCompany() {
		return(this.company) ;
	}
	public String generateEmail() {
		String email;
		email =  emp.getFirstName()+emp.getLastName()+"@"+ this.getDeptName()+ this.getCompany()+".com";
		return email;
	}
	public String generatePasswd() {
		String passwd = "";
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String number = "0123456789";
		String spl = "~!@#$%^&*()_-+~`{}[]";
		
		Random random = new Random();
		passwd += upper.charAt(random.nextInt(upper.length()));
		passwd += upper.charAt(random.nextInt(upper.length()));
		
		passwd += lower.charAt(random.nextInt(lower.length()));
		passwd += lower.charAt(random.nextInt(lower.length()));
		
		passwd += number.charAt(random.nextInt(number.length()));
		passwd += number.charAt(random.nextInt(number.length()));
		
		passwd += spl.charAt(random.nextInt(spl.length()));
		passwd += spl.charAt(random.nextInt(spl.length()));
		
		return passwd;
	}
	public void showCredential() {
		System.out.println("Dear" + " " +emp.getFirstName()+ " " + "your credential are as follows");
		System.out.println("--->"+generateEmail());
		System.out.println("--->" +generatePasswd());
		
	}

}
