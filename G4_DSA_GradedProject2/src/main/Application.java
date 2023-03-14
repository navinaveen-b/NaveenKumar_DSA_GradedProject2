package main;

import services.CredentialService;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CredentialService credService = new CredentialService();
		//Employee emp = new Employee("Naveen","Kumar");
		Scanner sc = new Scanner(System.in);
		String email,passwd;
		
		boolean quit = false;
		do {
			System.out.println("1 - Technical");
			System.out.println("2 - Admin");
			System.out.println("3 - Human Resource");
			System.out.println("4 - Legal");
			System.out.println("Choose an Option");
			int choice = sc.nextInt();
			switch (choice) {
          		case 1: credService.setDeptName("tech");
          				credService.setCompany(".gl");
          				email = credService.generateEmail();
          				credService.emp.setEmail(email);
          				passwd = credService.generatePasswd();
          				credService.emp.setPasswd(passwd);
          				credService.showCredential();
          				break;
          		case 2:	credService.setDeptName("admin");
  						credService.setCompany(".gl");
  						email = credService.generateEmail();
  						credService.emp.setEmail(email);
  						passwd = credService.generatePasswd();
  						credService.emp.setPasswd(passwd);
  						credService.showCredential();
  						break;
          		case 3:	credService.setDeptName("hrdept");
						credService.setCompany(".gl");
						email = credService.generateEmail();
						credService.emp.setEmail(email);
						passwd = credService.generatePasswd();
						credService.emp.setPasswd(passwd);
						credService.showCredential();
						break;
          		case 4:	credService.setDeptName("hrdept");
          				credService.setCompany(".gl");
          				email = credService.generateEmail();
          				credService.emp.setEmail(email);
          				passwd = credService.generatePasswd();
          				credService.emp.setPasswd(passwd);
          				credService.showCredential();
          				break;
          		default:
          				System.out.println("\nInvalid Choice");
          				quit = true;
          				break;
          				
			}
		}while (!quit);
		System.out.println("The Application terminated");
	}
	
}
