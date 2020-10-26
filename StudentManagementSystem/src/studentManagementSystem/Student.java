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
		do {
		System.out.println("Enter course to enroll(Q to quit)");
		Scanner scannerObj = new Scanner(System.in);
		String course = scannerObj.nextLine();
		if (!course.equals("Q") && !course.equals("q") && !course.equals("0") ) {
			courses = courses + "\n" + course;
			tuitionbalance  = tuitionbalance + costOfCourse;	
		}
		
		else {
			break;
			}
		} while (1 != 0);
		
		System.out.println("Enrolled in: " + courses);
		System.out.println("Tuition Balance: " + tuitionbalance);
		
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
