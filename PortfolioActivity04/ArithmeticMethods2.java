/* Datoon, Philip Bryan B.
	131311399
	31 July 2013 */
	
import java.util.Scanner;

class ArithmeticMethods2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("Enter first integer: ");	
		num1 = sc.nextInt();
		
		System.out.print("Enter second integer: ");
		num2 = sc.nextInt();
		
		System.out.println();
		displayNumberPlus10(num1);
		displayNumberPlus10(num2);
		
		System.out.println();
		displayNumberPlus100(num1);
		displayNumberPlus100(num2);
		
		System.out.println();
		displayNumberPlus1000(num1);
		displayNumberPlus1000(num2);
	}
	
	public static void displayNumberPlus10(int num) {
		System.out.println(num + " + 10 = " + (num + 10));
	}

	public static void displayNumberPlus100(int num) {
		System.out.println(num + " + 100 = " + (num + 100));
	}
	
	public static void displayNumberPlus1000(int num) {
		System.out.println(num + " + 1000 = " + (num + 1000));
	}
}