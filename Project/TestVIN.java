/* Datoon, Philip Bryan B.
 * 131311399
 * Demonstration: VIN.java
 */
 
import java.util.Scanner;

class TestVIN {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      VIN vin = new VIN();

		do {	      
	      System.out.println();
			
			System.out.println("VEHICLE IDENTIFICATION NUMBER");
	      System.out.print("Enter VIN: ");
	      vin.setVIN(sc.next());
	      
	      System.out.println();
	      
		} while (!vin.isVINValid());
		
		// displays result if VIN is valid
      if (vin.isVINValid()) {
         System.out.println("World manufacturer identifier: " + vin.getWorldIdentifier());
         System.out.println(" Country: " + vin.getCountry());
         System.out.println(" Manufacturer: " + vin.getManufacturer());
         System.out.println(" Make: " + vin.getMake());
         System.out.println("Vehicle description section: " + vin.getDescSection());
         System.out.println("Check digit: " + vin.getCheckDigit());
         System.out.println("Vehicle identification section: " + vin.getIDSection());
      }
   }
}