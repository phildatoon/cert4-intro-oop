/* Datoon, Philip Bryan B.
 * 131311399
 * 5 August 2013
 * Using IF-ELSE statements
 */

import java.util.Scanner;

public class Scholarship {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      float average;
      int numOfExtracurricular;
      int numOfService;
      
      System.out.println("WILLIAMSBURG WOMEN'S CLUB");
      System.out.println();
      
      System.out.print("Enter student's grade point average: ");
      average = sc.nextFloat();
      
      System.out.print("Enter student's number of extracurricular activities: ");
      numOfExtracurricular = sc.nextInt();
      
      System.out.print("Enter student's number of service activities: ");
      numOfService = sc.nextInt();
      
      System.out.println();
      
      if (average >= 3.8 && numOfExtracurricular >= 1 && numOfService >= 1) {
            System.out.println(">> Scholarship candidate.");
      } else if (average < 3.8 && average >= 3.4 &&
         (numOfExtracurricular + numOfService) >= 3) {
            System.out.println(">> Scholarship candidate.");
      } else if (average < 3.4 && average >= 3.0 && numOfExtracurricular >= 2 &&
         numOfService >= 3) {
            System.out.println(">> Scholarship candidate.");
      } else {
            System.out.println(">> Not a candidate.");
      }
   }
}