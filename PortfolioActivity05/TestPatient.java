/* Datoon, Philip Bryan
 * 131311399
 * 2 August 2013
 * Demonstration: Patient.java
 */

public class TestPatient {
	public static void main(String[] args) {		
		Patient patient1 = new Patient();
		Patient patient2 = new Patient("123456789", 10, "AB", "+");
		
		// patient1 - displaying default values
		System.out.println("patient1 - default values");
		System.out.println("ID number: " + patient1.getIdNum());
		System.out.println("Age: " + patient1.getAge());
		System.out.println("BloodType: " + patient1.getBloodData().getBloodType());
		System.out.println("Rh factor: " + patient1.getBloodData().getRhFactor());
		System.out.println();
		
		// patient2 - displaying values from parameters
		System.out.println("patient1 - values from parameters");
		System.out.println("ID number: " + patient2.getIdNum());
		System.out.println("Age: " + patient2.getAge());
		System.out.println("BloodType: " + patient2.getBloodData().getBloodType());
		System.out.println("Rh factor: " + patient2.getBloodData().getRhFactor());
		System.out.println();
	}
}