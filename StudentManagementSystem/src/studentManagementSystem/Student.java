package studentManagementSystem;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentID;
	private String courses;
	private int tuitionbalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	//prompt user to enter studetn's name and year 
	
	//generate an ID
	
	//enroll in courses
	
	//view balance
	
	//pay tuition
	
	//show status
	
	Student() {
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter Student firstname: ");
		this.firstName = scannerObj.nextLine();
		
		System.out.println("Enter Student lastname: ");
		this.lastName = scannerObj.nextLine();
		
		System.out.println("[1]Freshman\n[2]Sophmore\n[3]Junior\n[4]Senior");
		this.gradeYear = scannerObj.nextInt();
		
		id++;
		
	}

}
