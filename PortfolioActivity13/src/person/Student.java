/* Datoon, Philip Bryan
 * 131311399
 * 21 August 2013
 * Generating JavaDoc documentation
 */

package person;

import javax.swing.JOptionPane;

/**
 * <code>Student</code> is a class that extends super class
 * <code>Person</code> which allows user to type in data for student.
 * This class makes use of <code>JOptionPane</code>
 * class to accept GUI inputs.
 *
 * @author	Philip Bryan Datoon
 * @since	1.0
 */
public class Student extends Person {

	/**
	 * Stores <code>String</code> value of the
	 * field of study of the student.
	 */
	private String field;
	
	/**
	 * Stores <code>double</code> value of the
	 * grade point average of the student.
	 */
	private double average;
	
	/**
	 *	Sets value of field of study of student from the input dialog box.
	 * 
	 * @since		1.0
	 */
	public void setField() {
		this.field = JOptionPane.showInputDialog(null, "Enter student's field of study.");
	}
	
	/**
	 *	Sets value of grade point average of student
	 * from the input dialog box. Conversion of string
	 * to double takes place.
	 *
	 * @since		1.0
	 */
	 
	public void setAverage() {
		String grade;
		grade = JOptionPane.showInputDialog(null, "Enter student's grade point average.");
		
		this.average = Double.parseDouble(grade);
	}
	
	// Override methods from superclass Person
	@Override
	public void setFirstName() {
		super.firstName = JOptionPane.showInputDialog(null, "Enter student's first name.");
	}
	
	@Override
	public void setLastName() {
		super.lastName = JOptionPane.showInputDialog(null, "Enter student's last name.");
	}
	
	@Override
	public void setAddress() {
		super.address = JOptionPane.showInputDialog(null, "Enter student's address.");
	}
	
	@Override
	public void setZipCode() {
		super.zipCode = JOptionPane.showInputDialog(null, "Enter student's ZIP code.");
	}
	
	@Override
	public void setPhoneNum() {		
		super.phoneNum = JOptionPane.showInputDialog(null, "Enter person's phone number.");
	}
	
   @Override
	public String display() {
		return super.display() + "\t\t" + this.field + "\t\t" + this.average;
	}
}