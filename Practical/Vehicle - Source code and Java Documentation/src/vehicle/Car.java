/* Datoon, Philip Bryan B.
 * 131311399
 * Practical - Car.java
 */

package vehicle;

/**
 * <code>Car</code> is a class that extends super class <code>Vehicle</code>.
 *
 * @author	Philip Bryan Datoon
 * @since	1.0
 */
public class Car extends Vehicle {   
   
	/**
	 * Constructs a newly created <code>Vehicle</code> object.
	 * This constructor requires only one parameter of integer data type.
	 * This <code>Car</code> constructor calls the super class
	 * constructor, leaving value of wheels automatically set to
	 * <code>int</code> value of 4.
	 *
	 * @param miles	the average miles per gallon
	 */
	Car(int miles) {
      super(4, miles);
   }
}