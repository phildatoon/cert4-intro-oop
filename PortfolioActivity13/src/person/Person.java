/* Datoon, Philip Bryan
 * 131311399
 * 21 August 2013
 * Generating JavaDoc documentation
 */
package person;

import javax.swing.JOptionPane;
/**
 * <code>Person</code> is a super class which allows user to type in
 * data for all Persons. This class makes use of <code>JOptionPane</code>
 * class to accept GUI inputs.
 *
 * @author	Philip Bryan Datoon
 * @since	1.0
 */
public class Person {

	/**
	 * Stores <code>String</code> value of the first name of the person.
	 */
	protected String firstName;
	
	/**
	 * Stores <code>String</code> value of the last name of the person.
	 */
	protected String lastName;
	
	/**
	 * Stores <code>String</code> value of the address of the person.
	 */
	protected String address;
	
	/**
	 * Stores <code>String</code> value of the zip code of the address of the person.
	 */
	protected String zipCode;
	
	/**
	 * Stores <code>String</code> value of the phone number of the person.
	 */
	protected String phoneNum;
   
	/**
	 *	Sets value of first name from the input dialog box.
	 */
	public void setFirstName() {
		this.firstName = JOptionPane.showInputDialog(null, "Enter person's first name.");
	}
	
	/**
	 *	Sets value of last name from the input dialog box.
	 * 
	 * @since		1.0
	 */
	public void setLastName() {
		this.lastName = JOptionPane.showInputDialog(null, "Enter person's last name.");
	}
	
	/**
	 *	Sets value of address from the input dialog box.
	 *
	 * @since		1.0
	 */
	public void setAddress() {
		this.address = JOptionPane.showInputDialog(null, "Enter person's address.");
	}
	
	/**
	 *	Sets value of zip code from the input dialog box.
	 * 
	 * @since		1.0
	 */
	public void setZipCode() {
		this.zipCode = JOptionPane.showInputDialog(null, "Enter person's ZIP code.");
	}
	
	/**
	 *	Sets value of phone number from the input dialog box.
	 * 
	 * @since		1.0
	 */
	public void setPhoneNum() {
		this.phoneNum = JOptionPane.showInputDialog(null, "Enter person's phone number.");
	}
	
	/**
	 *	Returns value of all static fields in single line.
	 *
	 * @since		1.0
	 * @return		A formatted string. "No data" string
	 *					if the <code>Person</code> field is empty.
	 */
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