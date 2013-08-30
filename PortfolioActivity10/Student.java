/* Datoon, Philip Bryan
 * 131311399
 * 19 August 2013
 */

import javax.swing.JOptionPane;

public class Student extends Person {
	String field;
	double average;
	
	public void setField() {
		this.field = JOptionPane.showInputDialog(null, "Enter student's field of study.");
	}
	
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