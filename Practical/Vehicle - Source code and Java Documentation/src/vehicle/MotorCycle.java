/* Datoon, Philip Bryan B.
 * 131311399
 * Practical - MotorCycle.java
 */

package vehicle;

/**
 * <code>MotorCycle</code> is a class that extends super class <code>Vehicle</code>.
 *
 * @author	Philip Bryan Datoon
 * @since	1.0
 */
public class MotorCycle extends Vehicle {

	/**
	 * Constructs a newly created <code>Vehicle</code> object.
	 * This constructor requires only one parameter of integer data type.
	 * This <code>MotorCycle</code> constructor calls the super class
	 * constructor, leaving value of wheels automatically set to
	 * <code>int</code> value of 2.
	 *
	 * @param miles	the average miles per gallon
	 */
   MotorCycle(int miles) {
      super(2, miles);
   }
}