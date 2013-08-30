/* Datoon, Philip Bryan
 * 131311399
 * 19 August 2013
 */

import javax.swing.JOptionPane;

public class Faculty extends CollegeEmployee {
	boolean isTenured;
	
	public void setIsTenured() {
		int tenure;
		tenure = JOptionPane.showConfirmDialog(null, "Is the faculty tenured?",
					"Tenure", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
		if (tenure == JOptionPane.YES_OPTION) {
				isTenured = true;
		} else {
				isTenured = false;
		}
	}
	
	// Override methods from class CollegeEmployee
	@Override
	public void setSecurityNum() {
		String security;
		security = JOptionPane.showInputDialog(null, "Enter faculty's social security number.");
		
		super.securityNum = Integer.parseInt(security);
	}
	
	@Override
	public void setAnnualSalary() {
		String salary;
		salary = JOptionPane.showInputDialog(null, "Enter faculty's annual salary.");
		
		super.annualSalary = Double.parseDouble(salary);
	}
		
	@Override
	public void setDeptName() {
		deptName = JOptionPane.showInputDialog(null, "Enter faculty's department name.");
	}
	
	// Override methods from superclass Person
	@Override
	public void setFirstName() {
		super.firstName = JOptionPane.showInputDialog(null, "Enter faculty's first name.");
	}
	
	@Override
	public void setLastName() {
		super.lastName = JOptionPane.showInputDialog(null, "Enter faculty's last name.");
	}
	
	@Override
	public void setAddress() {
		super.address = JOptionPane.showInputDialog(null, "Enter faculty's address.");
	}
	
	@Override
	public void setZipCode() {
		super.zipCode = JOptionPane.showInputDialog(null, "Enter faculty's ZIP code.");
	}
	
	@Override
	public void setPhoneNum() {		
		super.phoneNum = JOptionPane.showInputDialog(null, "Enter person's phone number.");
	}
	
	@Override
	public String display() {
     String tenure;
     
      if (this.isTenured) {
            tenure = "Yes";
      } else {
            tenure = "No";
      }
      
		return super.display() + "\t\t" + tenure;
	}
}