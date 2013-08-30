/* Datoon, Philip Bryan B.
 * 131311399
 * 2 August 2013
 * Using overloaded constructor and inner class
 */
 
public class Patient {
	private String idNum;
	private int age;
	private BloodData data;
	
	Patient() {
		idNum = "0";
		age = 0;
		data = new BloodData();
	}
	
	Patient(String id, int age, String bloodType, String rhFactor) {
		this.idNum = id;
		this.age = age;
		this.data = new BloodData(bloodType, rhFactor);
	}
	
	public String getIdNum() {
		return this.idNum;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public BloodData getBloodData() {
		return this.data;
	}
}