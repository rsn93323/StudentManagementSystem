package studentManagementSystem;

import java.util.Scanner;

public class Student {
	
	private final String firstName;
	private final String lastName;
	private final int gradeYear;
	private String studentID;
	private final String major;
	public String courses = " ";
	private int tuitionbalance;
	private static final int costOfCourse = 600;
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
		do {
		System.out.print("Enter course to enroll(Q to quit) > ");
		Scanner scannerObj = new Scanner(System.in);
		String course = scannerObj.nextLine();
		if (!course.equals("Q") && !course.equals("q") && !course.equals("0") ) {
			courses = courses + "\n " + course;
			tuitionbalance  = tuitionbalance + costOfCourse;	
		}
		else {
			break;
			}
		} while (1 != 0);
		
//		System.out.println("Enrolled in: " + courses);
//		System.out.println("Tuition Balance: " + tuitionbalance);
		
	}
	
	//view balance
	public void viewBalance() {
		System.out.println("Your Balance: $" +  tuitionbalance);
	}

	//pay tuition
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: ");
		Scanner inputs01 = new Scanner(System.in);
		int payment = Integer.parseInt(inputs01.nextLine());
		tuitionbalance = tuitionbalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}


	//show status
	public String toString() {
		return "Name: " + firstName + " " + lastName
				+ "\n" + "Year: " + gradeYear
				+ "\n" + "StudentID: " + studentID
				+ "\n" + "Major: " + major
				+ "\n" + "Courses Enrolled: " + courses
				+ "\n" + "Balance: $"  + tuitionbalance;
	}


	
	Student() {
		Scanner scannerObj = new Scanner(System.in);
		System.out.print("Enter Student firstname: ");
		this.firstName = scannerObj.nextLine();
		
		System.out.print("Enter Student lastname: ");
		this.lastName = scannerObj.nextLine();
		
		System.out.print("[1]Freshman\n[2]Sophmore\n[3]Junior\n[4]Senior"
				+ "\n" + "Enter year > " );
		this.gradeYear = Integer.parseInt(scannerObj.nextLine());

		System.out.print("Enter major: ");
		this.major = scannerObj.nextLine();
		
		setstudentID();




//		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

	}

}
