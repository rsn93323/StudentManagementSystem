package studentManagementSystem;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionbalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	//prompt user to enter studetn's name and year 
	
	//generate an ID
	
	private void setstudentID() {
		//grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	//enroll in courses
	public void enroll() {
		//get intside a loop, user hits 0, 
		System.out.println("Enter course to enroll(0 to quit)");
		Scanner scannerObj = new Scanner(System.in);
		String course = scannerObj.nextLine();
		if (courses != "Q") {
			courses = courses + "\n" + courses;
			tuitionbalance  = tuitionbalance + costOfCourse;	
		}
		
		System.out.println("Enrolled in: " + courses);
		System.out.println("Tuition Balance: " + tuitionbalance);
		
	}
	
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
		
		setstudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
	}

}
