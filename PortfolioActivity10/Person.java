/* Datoon, Philip Bryan
 * 131311399
 * 19 August 2013
 */

import javax.swing.JOptionPane;

public class Person {
	protected String firstName;
	protected String lastName;
	protected String address;
	protected String zipCode;
	protected String phoneNum;
   
	public void setFirstName() {
		this.firstName = JOptionPane.showInputDialog(null, "Enter person's first name.");
	}
	
	public void setLastName() {
		this.lastName = JOptionPane.showInputDialog(null, "Enter person's last name.");
	}
	
	public void setAddress() {
		this.address = JOptionPane.showInputDialog(null, "Enter person's address.");
	}
	
	public void setZipCode() {
		this.zipCode = JOptionPane.showInputDialog(null, "Enter person's ZIP code.");
	}
	
	public void setPhoneNum() {
		this.phoneNum = JOptionPane.showInputDialog(null, "Enter person's phone number.");
	}
	
	public String display() {
      if (firstName.isEmpty()) {
         this.firstName = "No data";
      }
      
      if (lastName.isEmpty()) {
         this.lastName = "No data";
      }
      
      if (address.isEmpty()) {
         this.address = "No data";
      }
      
      if (zipCode.isEmpty()) {
         this.zipCode = "No data";
      }
      
      if (phoneNum.isEmpty()) {
         this.phoneNum = "No data";
      }
      
		return firstName + "\t\t" + lastName + "\t\t" + 
				 address + "\t\t" + zipCode + "\t\t" +
				 phoneNum;
	}
}