/* Datoon, Philip Bryan B.
 * 131311399
 * Practical - Vehicle.java
 */

package vehicle;

/**
 * <code>Vehicle</code> is a super class for all vehicle
 * types such as <code>MotorCycle</code> and <code>Car</code>.
 *
 * @author	Philip Bryan Datoon
 * @since	1.0
 */
public class Vehicle {

	/**
	 * Stores <code>int</code> value of the
	 * number of wheels of Vehicle type.
	 */
   private int numOfWheels;
	
	/**
	 * Stores <code>int</code> value of the
	 * average miles per gallon of Vehicle type.
	 */
   private int aveMilesPerGallon;
   
	/**
	 * Constructs a newly created <code>Vehicle</code> object.
	 * This constructor requires two parameters of integer data type.
	 *
	 * @param wheels	the number of wheels of vehicle
	 * @param miles	the average miles per gallon
	 */
   Vehicle(int wheels, int miles) {
      this.numOfWheels = wheels;
      this.aveMilesPerGallon = miles;
   }
   
	/**
	 * Returns value of both static fields in single line.
	 *
	 * @since		1.0
	 * @return		A formatted string.
	 */
   public String toString() {
      return "\t\tNumber of wheels: " + this.numOfWheels +
             ", average miles per gallon: " + this.aveMilesPerGallon;
   }
}