/* Datoon, Philip Bryan B.
 * 131311399
 * 12 August 2013
 */
 
import java.util.Scanner;
 
public class FiveLettersAndFiveDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input;
		boolean isValid;     
      int letterCtr;
      int digitCtr;

  		do {         
         letterCtr = 0;
         digitCtr  = 0;
         isValid = true;		// sets flag for valid or invalid input
         
			System.out.println();
			System.out.print("Enter a string with at least 5 letters and 5 digits: ");
			input = sc.next();
         			
         // counts digits and letters
			for (int x = 0; x < input.length(); x++) {
				if (Character.isLetter(input.charAt(x))) {
					   letterCtr++;
            } else if (Character.isDigit(input.charAt(x))) {
					   digitCtr++;
            } 
         }         
         
         if (letterCtr < 5 || digitCtr < 5) {            
            isValid = false;
            System.out.print(" - ERROR: String only has: ");
                             
            if (letterCtr < 5) {
               System.out.print(letterCtr + " letters ");
            }
            
            if (letterCtr < 5 && digitCtr < 5) {
               System.out.print("and ");
            }
            
            if (digitCtr < 5) {
               System.out.print(digitCtr + " digits");
            }
            
            System.out.println();
         }
         
         // displays once both inputs are valid
         if (isValid) {
            System.out.println(" - SUCCESS: Inputs are valid.");
         }
		} while (!isValid);
	}
}