/* Datoon, Philip Bryan B.
 * 131311399
 * 26 July 2013 */

import java.util.Scanner;

public class MilesToFeetInteractive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // A mile is equivalent to 5,280 feet
        final float MILE_TO_FEET = 5280.0f;
       
        System.out.print("Enter the distance to "
                + "your uncle's house (in miles): ");
        float houseDistance = sc.nextFloat();
        
        System.out.println();
        System.out.println("The distance to your uncle's house is " +
		  						  houseDistance + " miles or " +
								  MILE_TO_FEET * houseDistance + " feet.");
    }
}
