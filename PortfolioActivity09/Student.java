/* Datoon, Philip Bryan B.
 * 131311399
 * 14 August 2013
 */

public class Student {
	private int studentNum;
	private CollegeCourse[] course = new CollegeCourse[5];
	
	Student() {
		this.studentNum = 12345;
		
		// initialising each CollegeCourse array object
		for (int x = 0; x < course.length; x++) {
			this.course[x] = new CollegeCourse();
		}
	}
	
	public int getStudentNum() {
		return this.studentNum;
	}
	
	public void setStudentNum(int num) {
		this.studentNum = num;
	}
	
	public CollegeCourse getCourse(int index) {		
		return this.course[index];
	}
	
	public void setCourseID(String id, int index) {		
		this.course[index].setCourseID(id);
	}
	
	public void setCreditHour(int hour, int index) {		
		this.course[index].setCreditHour(hour);
	}
	
	public void setGrade(String grade, int index) {		
		this.course[index].setGrade(grade);
	}
}