/* Datoon, Philip Bryan B.
 * 131311399
 * 5 August 2013
 * Using SWITCH-CASE statements
 */

import java.util.Scanner;

public class Coffee {
   public static void main(String[] args) {
      int item1 = 0;
      int item2 = 0;
      int item3 = 0;
      float totalBill = 0.0f;
      
      orderCoffee(item1, item2, item3, totalBill);
   }
   
   public static void orderCoffee(int item1, int item2, int item3, float totalBill) {
      Scanner sc = new Scanner(System.in);
      int order;
      
      System.out.println("\nJIVIN' JAVA COFFEE - MENU");
      System.out.println("(1) American \t\t $1.99");
      System.out.println("(2) Espresso \t\t $2.50");
      System.out.println("(3) Latte \t\t $2.15");
      System.out.println("(0) to quit program");
      
      System.out.print("Select order (1 to 3): ");
      order = sc.nextInt();
      
      switch(order) {
         case 0:
            System.out.println();
            
            if (item1 > 0 || item2 > 0 || item3 > 0)
               System.out.println("YOU ORDERED:");
               
            if (item1 > 0)
               System.out.printf("%d x American \t\t $%.2f\n", item1, item1 * 1.99);
            
            if (item2 > 0)
               System.out.printf("%d x Espresso \t\t $%.2f\n", item2, item2 * 2.50);
            
            if (item3 > 0)
               System.out.printf("%d x Latte \t\t $%.2f\n", item3, item3 * 2.15);
               
            System.out.printf("    TOTAL BILL \t\t $%.2f", totalBill);
            break;
            
         case 1:
            orderCoffee(++item1, item2, item3, totalBill + 1.99f);
            break;
            
         case 2:
            orderCoffee(item1, ++item2, item3, totalBill + 2.50f);
            break;
            
         case 3:
            orderCoffee(item1, item2, ++item3, totalBill + 2.15f);
            break;
            
         default:
            System.out.println("ERROR: \"" + order + "\" is an invalid choice.");
            orderCoffee(item1, item2, item3, totalBill);
            break;
      }
   }
}