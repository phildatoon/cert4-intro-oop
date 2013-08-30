/* Datoon, Philip Bryan
 * 131311399
 * 19 August 2013
 */

import javax.swing.JOptionPane;

public class CollegeEmployee extends Person {
	protected int securityNum;
	protected double annualSalary;
	protected String deptName;
	
	public void setSecurityNum() {
		String security;
		security = JOptionPane.showInputDialog(null, "Enter employee's social security number.");
		
		this.securityNum = Integer.parseInt(security);
	}
	
	public void setAnnualSalary() {
		String salary;
		salary = JOptionPane.showInputDialog(null, "Enter employee's annual salary.");
		
		this.annualSalary = Double.parseDouble(salary);
	}
	
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