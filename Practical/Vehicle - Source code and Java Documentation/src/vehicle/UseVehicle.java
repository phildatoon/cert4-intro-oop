/* Datoon, Philip Bryan B.
 * 131311399
 * Practical - UseVehicle.java
 * Demonstration of Vehicle.java, Car.java, and MotorCycle.java
 */
package vehicle;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <code>UseVehicle</code> is a main class used to demonstrate inheritance among 
 * super class <code>Vehicle</code>, and its subclasses <code>Car</code> and
 * <code>MotorCycle</code>.
 *
 * @author	Philip Bryan Datoon
 * @since	1.0
 */
public class UseVehicle {

	/**
	 * <code>Main</code> function gets input from the user by calling
	 * <code>getWheels()</code> and <code>getMiles()</code> for
	 * vehicle's number of wheels and average miles, respectively.
	 * It involves creation and instantiation of <code>Vehicle</code>, 
	 * <code>Car</code> and <code>MotorCycle</code> objects, and input display.
	 * 
	 * @since	1.0
	 * @param args	Java command-line arguments
	 * 
	 */
   public static void main(String[] args) throws Exception {
	   // object instantiation and user input
	   System.out.println();
	   System.out.println("Enter values for VEHICLE");
	   Vehicle vehicle = new Vehicle(getWheels(), getMiles());

	   System.out.println();
	   System.out.println("Enter value for CAR");
	   Car car = new Car(getMiles());

	   System.out.println();
	   System.out.println("Enter value for MOTORCYCLE");
	   MotorCycle motor = new MotorCycle(getMiles());

	   // display results
	   System.out.println();
	   System.out.println("VEHICLE\t" + vehicle.toString());
	   System.out.println("CAR \t" + car.toString());
	   System.out.println("MOTORCYCLE" + motor.toString());
   }
	
   /**
    * Gets and reads the value of number of wheels from user input.
    * 
    * @since	1.0
    * @return	The number of wheels input is returned if user
    * 			entered valid data. Otherwise, it will return to
    * 			ask user to enter valid number of wheels input again.
    */
	public static int getWheels() {
		int wheels = 0;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter number of wheels: ");
			wheels = sc.nextInt();
         checkValidity(wheels);    
			return wheels;
		} catch (InputMismatchException e) {
         if (e.getMessage() == null) {
            System.out.print(" ERROR: Invalid data type. ");
         } else {
            System.out.print(e.getMessage());
         }
         
			return getWheels();
		}
	}

	/**
	 * Gets and reads the value of average miles
	 * per gallon from user input.
	 * 
	 * @return	The average miles per gallon input is returned if user
	 * 			entered valid data. Otherwise, it will return to
	 * 			ask user to enter valid average miles per gallon input again.
	 */
	public static int getMiles() {
		int miles = 0;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter average miles per gallon: ");
			miles = sc.nextInt();
         checkValidity(miles);
			return miles;
		} catch (InputMismatchException e) {
			if (e.getMessage() == null) {
            System.out.print(" ERROR: Invalid data type. ");
         } else {
            System.out.print(e.getMessage());
         }
         
         return getMiles();
		}
	}
   
	/**
	 * Gets an integer value, then checks its validity through the program.
	 * If either conditions, value is equal to or less than zero,  
	 * <code>InputMismatchException</code> is being thrown with given
	 * <code>String</code> message passed to its class.
	 * 
	 * @param value	An integer value
	 */
   public static void checkValidity(int value) {
      if (value < 0) {
		   throw (new InputMismatchException(" ERROR: Value is negative. "));
		} else if (value == 0) {
		   throw (new InputMismatchException(" ERROR: Value is zero. "));
      }
   }
}