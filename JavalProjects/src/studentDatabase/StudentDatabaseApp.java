package studentDatabase;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		
		
		// Ask the user how many users we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner reader = new Scanner(System.in);
		int numOfStudnets = reader.nextInt();
		Student[] students = new Student[numOfStudnets];
		
		
		// Create n number of new students
		for(int n = 0; n < numOfStudnets; n++) {
			
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			
			System.out.println(students[n].toString());
			
		}
		
		for(int n = 0; n < numOfStudnets; n++) {
			System.out.println(students[n].toString());
			
		}
	}
}
