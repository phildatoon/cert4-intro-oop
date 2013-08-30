/* Datoon, Philip Bryan B.
 * 131311399
 * 9 August 2013
 * Using nested FOR loops
 */

import java.util.Scanner;

public class EverySum {
   public static void main(String[] args) {
      int sum = 0;
      
      for (int x = 1; x <= 50; x++) {
         for (int y = 0; y < x; y++)
            sum += 1 + y;
         
         System.out.println("Sum between 1 and " + x + " = " + sum);
         sum = 0;
      }
   }
}