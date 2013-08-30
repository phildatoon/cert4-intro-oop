/* Datoon, Philip Bryan B.
 * 131311399
 * 5 August 2013
 * Using recursion method
 */

import java.util.Scanner;

public class Factorial {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num;
      
      System.out.println("FACTORIAL");
      System.out.println();
      
      System.out.print("Enter an integer: ");
      num = sc.nextInt();
      
      System.out.println("The factorial of " + num + " is " + factorial(num) + ".");
   }
   
   public static long factorial(int num) {
      if (num <= 1)
         return 1;
      
      return num * factorial(num - 1);
   }
}