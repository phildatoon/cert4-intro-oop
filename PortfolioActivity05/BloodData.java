/* Datoon, Philip Bryan
 * 131311399
 * 2 August 2013
 * Using overloaded constructors
 */
 
public class BloodData {
	private String bloodType;
	private String rhFactor;
	
	BloodData() {
		bloodType = "O";
		rhFactor = "+";
	}
	
	BloodData(String bloodType, String rhFactor) {
		this.bloodType = bloodType;
		this.rhFactor = rhFactor;
	}
	
	public String getBloodType() {
		return bloodType;
	}
	
	public void setBloodType(String type) {
		this.bloodType = type;
	}
	
	public String getRhFactor() {
		return this.rhFactor;
	}
	
	public void setRhFactor(String factor) {
		this.rhFactor = factor;
	}
}