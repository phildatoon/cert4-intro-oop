/* Datoon, Philip Bryan B.
 * 131311399
 * 9 August 2013
 * Using DO-WHILE loop
 */

import java.util.Scanner;

public class RetirementGoal {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int year;
      double money;
      
      do {
         System.out.print("Enter number of years before retirement: ");
         year = sc.nextInt();
      
         System.out.print("Enter annual amount of money: ");
         money = sc.nextDouble();
         
         if (year < 1 || money <= 0)
         {
            System.out.println();
            System.out.println("ERROR: Invalid input. Enter new values again.");
            System.out.println();
         }
      } while (year < 1 || money <= 0);
      
      System.out.println();
      System.out.println("You will have $" + (year * money) +
                         " at retirement.");
      
   }
}