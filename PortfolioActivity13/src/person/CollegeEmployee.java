/* Datoon, Philip Bryan
 * 131311399
 * 21 August 2013
 * Generating JavaDoc documentation
 */
package person;

import javax.swing.JOptionPane;

/**
 * <code>CollegeEmployee</code> is a class that extends super class
 * <code>Person</code> which allows user to type in data for college employee.
 * This class makes use of <code>JOptionPane</code>
 * class to accept GUI inputs.
 *
 * @author	Philip Bryan Datoon
 * @since	1.0
 */
public class CollegeEmployee extends Person {

	/**
	 * Stores <code>int</code> value of the security number of the employee.
	 */
	protected int securityNum;
	
	/**
	 * Stores <code>double</code> value of the annual salary of the employee.
	 */
	protected double annualSalary;
	
	/**
	 * Stores <code>String</code> value of the department of the employee.
	 */
	protected String deptName;
	
	/**
	 *	Sets value of security number from the input dialog box.
	 * Conversion of string to integer takes place.
	 *
	 * @since		1.0
	 */
	public void setSecurityNum() {
		String security;
		security = JOptionPane.showInputDialog(null, "Enter employee's social security number.");
		
		this.securityNum = Integer.parseInt(security);
	}
	
	/**
	 *	Sets value of annual salary from the input dialog box.
	 * Conversion of string to double takes place.
	 *
	 * @since		1.0
	 */
	public void setAnnualSalary() {
		String salary;
		salary = JOptionPane.showInputDialog(null, "Enter employee's annual salary.");
		
		this.annualSalary = Double.parseDouble(salary);
	}
		
	/**
	 *	Sets value of department name from the input dialog box.
	 *
	 * @since		1.0
	 */
	public void setDeptName() {
		this.deptName = JOptionPane.showInputDialog(null, "Enter employee's department name.");
	}
	
	// Override methods from Person class
	@Override
	public void setFirstName() {
		super.firstName = JOptionPane.showInputDialog(null, "Enter employee's first name.");
	}
	
	@Override
	public void setLastName() {
		super.lastName = JOptionPane.showInputDialog(null, "Enter employee's last name.");
	}
	
	@Override
	public void setAddress() {
		super.address = JOptionPane.showInputDialog(null, "Enter employee's address.");
	}
	
	@Override
	public void setZipCode() {
		super.zipCode = JOptionPane.showInputDialog(null, "Enter employee's ZIP code.");
	}
	
	@Override
	public void setPhoneNum() {
		super.phoneNum = JOptionPane.showInputDialog(null, "Enter employee's phone number.");
	}
	
	@Override
	public String display() {
		return super.display() + "\t\t" + this.securityNum + "\t\t$" +
				 this.annualSalary + "\t\t" + this.deptName;
	}
}