/* Datoon, Philip Bryan
 * 131311399
 * 19 August 2013
 * Demonstration: Person.java, CollegeEmployee.java, Faculty.java, and Student.java
 */
 
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CollegeList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
		
		// counts number of data added
		int eCtr = 0;	// for employee
		int fCtr = 0;	// for faculty
		int sCtr = 0;	// for student
		
		// initialisation of array
		CollegeEmployee[] employee = new CollegeEmployee[4];
		Faculty[] faculty = new Faculty[3];
		Student[] student = new Student[7];
		
		// instantiation of each array objects
		for (int x = 0; x < employee.length; x++) {
			employee[x] = new CollegeEmployee();
		}		
		
		for (int y = 0; y < faculty.length; y++) {
			faculty[y] = new Faculty();
		}		
		
		for (int z = 0; z < student.length; z++) {
			student[z] = new Student();
		}
		
		// asks user input
		do {
			System.out.print("Enter person's data. Type C, F, or S. (Q to quit): ");
			choice = sc.next();
		
			switch (choice.charAt(0)) {
				case 'q':
				case 'Q':
               System.out.println();
               System.out.println("=====EMPLOYEE======================================================");
               
               // displays employee[x]
      			System.out.println("FIRST NAME \tLAST NAME \tADDRESS \t" +
      									 "ZIP CODE \tPHONE # \tSECURITY # \t" +
      									 "SALARY \t\tDEPARTMENT");
       			for (int x = 0; x < eCtr; x++) {
      				System.out.println(employee[x].display());
      			}
               
               System.out.println();
               System.out.println("=====FACULTY=======================================================");
               
               // displays faculty[x]
               System.out.println("FIRST NAME \tLAST NAME \tADDRESS \t" +
											 "ZIP CODE \tPHONE # \tSECURITY # \t" +
											 "SALARY \t\tDEPARTMENT \tIS TENURED?");
		 			for (int x = 0; x < fCtr; x++) {
						      System.out.println(faculty[x].display());
					}
               
               System.out.println();
               System.out.println("=====STUDENT=======================================================");
               
               // displays student[x]
               System.out.println("FIRST NAME \tLAST NAME \tADDRESS \t" +
											 "ZIP CODE \tPHONE # \tSTUDY FIELD \tAVERAGE");
		 			for (int x = 0; x < sCtr; x++) {
						System.out.println(student[x].display());
					}

               // exits program
               System.exit(0);
					break;
				case 'c':
				case 'C':
					if (eCtr < employee.length) {
						employee[eCtr].setFirstName();
						employee[eCtr].setLastName();
						employee[eCtr].setAddress();
						employee[eCtr].setZipCode();
						employee[eCtr].setPhoneNum();
						employee[eCtr].setSecurityNum();
						employee[eCtr].setAnnualSalary();
						employee[eCtr].setDeptName();
                  
                  eCtr++;
					} else {
							JOptionPane.showMessageDialog(null, "ERROR: Employee data is already full.");
					}
					break;
				case 'f':
				case 'F':
					if (fCtr < faculty.length) {
						faculty[fCtr].setFirstName();
						faculty[fCtr].setLastName();
						faculty[fCtr].setAddress();
						faculty[fCtr].setZipCode();
						faculty[fCtr].setPhoneNum();
						faculty[fCtr].setSecurityNum();
						faculty[fCtr].setAnnualSalary();
						faculty[fCtr].setDeptName();
						faculty[fCtr].setIsTenured();
                  
                  fCtr++;
					} else {
							JOptionPane.showMessageDialog(null, "ERROR: Faculty data is already full.");
					}
					break;
				case 's':
				case 'S':
					if (sCtr < student.length) {
							student[sCtr].setFirstName();
							student[sCtr].setLastName();
							student[sCtr].setAddress();
							student[sCtr].setZipCode();
							student[sCtr].setPhoneNum();
							student[sCtr].setField();
							student[sCtr].setAverage();
                     
                     sCtr++;
					} else {
							JOptionPane.showMessageDialog(null, "ERROR: Student data is already full.");
					}
					break;
				default:
					System.out.println(" - ERROR: You have entered an invalid input.");
					break;
			}
		} while (!(choice.equals('Q')));
	}
}