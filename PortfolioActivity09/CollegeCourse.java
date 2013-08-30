/* Datoon, Philip Bryan B.
 * 131311399
 * 14 August 2013
 */

public class CollegeCourse {
	private String courseID;
	private int creditHour;
	private char grade;
	
	CollegeCourse() {
		courseID = "CIS 201";
		creditHour = 3;
		grade = 'A';
	}
	
	public String getCourseID() {
		return this.courseID;
	}
	
	public int getCreditHour() {
		return this.creditHour;
	}
	
	public char getGrade() {
		return this.grade;
	}
	
	public void setCourseID(String id) {
		this.courseID = id;
	}
	
	public void setCreditHour(int hour) {
		this.creditHour = hour;
	}
	
	public void setGrade(String letterGrade) {
		// gets first letter of the string, then converts to char, and then converts to upper case
		this.grade = Character.toUpperCase(letterGrade.charAt(0));
	}
}