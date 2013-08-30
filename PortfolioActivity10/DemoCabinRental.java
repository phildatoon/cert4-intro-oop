/* Datoon, Philip Bryan
 * 131311399
 * 19 August 2013
 * Demonstration: CabinRental.java and HolidayCabinRental.java
 */

public class DemoCabinRental {
	public static void main(String[] args) {
		CabinRental cabin1 = new CabinRental(1);
		CabinRental cabin2 = new CabinRental(4);
		HolidayCabinRental cabin3 = new HolidayCabinRental(1, 1234);
		HolidayCabinRental cabin4 = new HolidayCabinRental(4, 5678);
		
		System.out.println("cabin1");
		System.out.println(" Cabin number: " + cabin1.getCabinNum());
		System.out.println(" Weekly rate: $" + cabin1.getWeeklyRate());
		System.out.println();
		
		System.out.println("cabin2");
		System.out.println(" Cabin number: " + cabin2.getCabinNum());
		System.out.println(" Weekly rate: $" + cabin2.getWeeklyRate());
		System.out.println();
		
		System.out.println("cabin3");
		System.out.println(" Cabin number: " + cabin3.getCabinNum());		
		System.out.println(" Cabin number: " + cabin3.getCabinNum());
		System.out.println(" Weekly rate: $" + cabin3.getWeeklyRate());
		System.out.println();
		
		System.out.println("cabin4");
		System.out.println(" Cabin number: " + cabin4.getCabinNum());
		System.out.println(" Room number: " + cabin4.getCabinNum());
		System.out.println(" Weekly rate: $" + cabin4.getWeeklyRate());
		System.out.println();
	}
}