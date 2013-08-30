/* Datoon, Philip Bryan B.
 * 131311399
 * Practical - Pay.java
 */
 
import java.util.Scanner;
 
public class Pay {
   private double hours;             // holds number of hours
   private double payRate;           // holds pay rate (in $)
   private double withholdingRate;   // holds withholding rate (in %)
   private double grossPay;
   private double netPay;

   public static void main(String[] args) {
      Pay salary = new Pay();
		Scanner sc = new Scanner(System.in);
      
      double hours;
      double payRate;
      double withholdingRate;
      
		System.out.print("Enter number of hours worked: ");
		hours = sc.nextDouble();
		System.out.print("Enter pay rate: ");
		payRate = sc.nextDouble();
		System.out.print("Enter withholding rate: ");
		withholdingRate = sc.nextDouble();
		System.out.println();
		
      System.out.printf("computeNetPay(%.2f, %.2f, %.2f) \t $%.2f",
                         hours, payRate, withholdingRate,
                         salary.computeNetPay(hours, payRate, withholdingRate));
      System.out.println();
      
      System.out.printf("computeNetPay(%.2f, %.2f) \t\t $%.2f",
                         hours, payRate, salary.computeNetPay(hours, payRate));
      System.out.println();
      
      System.out.printf("computeNetPay(%.2f) \t\t\t $%.2f",
                         hours, salary.computeNetPay(hours));
   }
   
   public double computeNetPay(double hours, double payRate, double withholdingRate) { 
      this.grossPay = hours * payRate;
      this.netPay = grossPay - (grossPay * (withholdingRate / 100));

      return netPay;
   }
   
   public double computeNetPay(double hours, double payRate) {
      this.grossPay = hours * payRate;
      this.netPay = grossPay - (grossPay * (15 / 100));
      
      return this.netPay;
   }
   
   public double computeNetPay(double hours) {
      this.grossPay = hours * 5.85f;
      this.netPay = grossPay - (grossPay * (15 / 100));
      
      return this.netPay;
   }
}