/* Datoon, Philip Bryan B.
 * 131311399
 * 14 August 2013
 * Demonstration: CollegeCourse.java and Student.java
 */

import java.util.Scanner;

public class InputGrades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// declaring array size for Student class
		Student[] student = new Student[10];
		
		// initialising each Student object
		for (int x = 0; x < student.length; x++) {
			student[x] = new Student();
		}
		
		// asks user to input student ID
		for (int x = 0; x < student.length; x++) {		
			System.out.println("STUDENT #" + (x + 1));
			System.out.print("Enter ID for student #" + (x + 1) + ": ");
			student[x].setStudentNum(sc.nextInt());
			
			// asks user to input course ID, hours, and grade
			for (int y = 0; y < 5; y++) {
				boolean isValid = false; // sets flag for valid and invalid grade
			
				System.out.println();
				System.out.print("Enter course ID #" + (y + 1) + ": ");
				student[x].setCourseID(sc.next(), y);
				
				System.out.print("Enter credit hours for course #" + (y + 1) + ": ");
				student[x].setCreditHour(sc.nextInt(), y);
				
				// does the loop until user enters valid grade
				do {
					System.out.print("Enter grade for course #" + (y + 1) + ": ");
					student[x].setGrade(sc.next(), y);
					
					// checks if course grade is valid or not
					switch (student[x].getCourse(y).getGrade()) {
						case 'A':
						case 'B':
						case 'C':
						case 'D':
						case 'F':
							isValid = true;
							break;
						default:
							System.out.print("Invalid grade. ");
							isValid = false;
							break;
					}	 
				} while (!isValid);
			} // end of FOR loop for CollegeCourse
			
			System.out.println();
			System.out.println("====================================");
		} // end of FOR loop for Student
		
		// displaying all input
		for (int x = 0; x < student.length; x++) {		
			System.out.println("STUDENT #" + student[x].getStudentNum());			
			
			// displays courses
			System.out.println("Course ID # \tCredit hour \t Grade");
			
			for (int y = 0; y < 5; y++) {
				System.out.println(y + " -- " +
				student[x].getCourse(y).getCourseID() + "\t" +
				student[x].getCourse(y).getCreditHour() + "\t" +
				student[x].getCourse(y).getGrade());
			}
			
			System.out.println();
			System.out.println("====================================");
		} 
	}
}