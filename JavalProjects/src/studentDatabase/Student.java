package studentDatabase;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses = " ";
	private int tuitionBalance;
	private static int costOfCourse = 600; //Static means that the value is not specific to an object, 
	private static int id = 1000;			//but it's specific to all objects. It's belongs to the class, not the object.
	
	
	// Constructor (prompt user to enter student's name and year)
	public Student() {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter student first name:");
		this.firstName = reader.nextLine();
		
		System.out.print("Enter student last name:");
		this.lastName = reader.nextLine();
		
		System.out.print("1-Freshmen\n2-Sophmore\n3-Junior\n4-Senior\nEnter student class level: ");
		this.gradeYear = reader.nextLine();
		System.out.println(firstName + " "+ lastName + " " + gradeYear);
		
		
		setStudentId();
		
		
	}
	
	// Generate an ID
	private String setStudentId() {
		
		//Grade level + Student ID
		
		id++;
		return this.studentID = gradeYear + "" + id;
		
	} 
	
	
	// Enroll in courses
	public void enroll() {
		
		//Get inside a loop, user hits 0		
	do {	
		System.out.print("Enter course to enroll (Q to quit): ");
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		String course = reader.nextLine();
		
		if (!course.equals("Q")) {
			
			courses = courses  + course + "\n";
			tuitionBalance = tuitionBalance + costOfCourse; 
		} else {
			
			break;
			}
		
		} while (1 != 0);
	}
	
	
	// View balance
	public void viewBalance() {
		
		System.out.println("Your balance is: $" + tuitionBalance +"\n");
	}
	
	// Pay tuition
public void payTuition() {
		
		viewBalance();
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter your payment: ");
		int payment = reader.nextInt();
		
		tuitionBalance = tuitionBalance - payment ;
		
		System.out.println("Thank for your payment of $" + payment);
		viewBalance();
	}
	
	
	//Show status
	public String toString() {
		
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\n\nCourses Enrolled: " + courses +
				"\nBalance: $" + tuitionBalance;
				
	}
}
