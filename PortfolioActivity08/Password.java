/* Datoon, Philip Bryan B.
 * 131311399
 * 12 August 2013
 */

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      String password;
      String password2;
      
      boolean isValid;
      boolean hasLetterAndDigit;
      int letterCtr;
      int digitCtr;
      
      // checks password validity
      do {
         // resets all the values once user types invalid password
         isValid = false;
         hasLetterAndDigit = false;
         letterCtr = 0;
         digitCtr  = 0;
      
         System.out.println();
			System.out.print("Enter password: ");
			password = sc.next();
         
         // checks password length
         if (password.length() < 6) {
               System.out.println(" - ERROR: Password is too short. ");
               isValid = false;
         } else if (password.length() > 10) {
               System.out.println(" - ERROR: Password is too long. ");
               isValid = false;
         } else {
               isValid = true;
         }
         
         // counts number of letters and digit in password
         for (int x = 0; x < password.length(); x++) {
				if (Character.isLetter(password.charAt(x)) == true) {
					   letterCtr++;
            } else if (Character.isDigit(password.charAt(x)) == true) {
					   digitCtr++;
            } 
         }
         
         // checks if password has at least one letter and one digit
         if (letterCtr >= 1 && digitCtr >= 1) {
               hasLetterAndDigit = true;
         } else {
               System.out.println(" - ERROR: Password must have at " +
                                "least one letter and one digit. ");
               hasLetterAndDigit = false;
         }
         
         if (isValid && hasLetterAndDigit) {
            System.out.println(" - Password is valid.");
            System.out.println();
            break;
         }
      } while(!isValid || !hasLetterAndDigit);
      
      // checks if second password matches to the first password
      do {
         System.out.print("Enter the valid password again: ");
         password2 = sc.next();
         
         if (password.equals(password2)) {
               System.out.println(" - SUCCESS: Passwords matched!");
         } else {
               System.out.print(" - ERROR: Passwords do not match. ");
         }
      } while (!(password.equals(password2)));
   }
}