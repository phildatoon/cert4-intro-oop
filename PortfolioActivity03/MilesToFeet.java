/* Datoon, Philip Bryan B.
 * 131311399
 * 26 July 2013 */

public class MilesToFeet {
    public static void main(String[] args) {
        // A mile is equivalent to 5,280 feet
        final float MILE_TO_FEET = 5280.0f;
        
        //HouseDistance variable refers to distance between my house and my uncle's house
        float houseDistance = 8.5f;
        
        System.out.println("The distance to your uncle's house is " +
		  							houseDistance + " miles or " +
									MILE_TO_FEET * houseDistance + " feet.");
    }
}
