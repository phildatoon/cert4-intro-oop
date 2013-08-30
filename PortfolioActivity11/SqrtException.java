/* Datoon, Philip Bryan B.
 * 131311399
 * 23 August 2013
 */

import java.util.Scanner;

class SqrtException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		
		try {
			System.out.println("The square root of " + num + " is " + squareRoot(num) + ".");
		} catch (ArithmeticException e) {
			System.out.println(" - ERROR: You have entered a negative integer.");
		}/* catch (InputMismatchException e) {
			System.out.println(" - ERROR: Invalid input.");
		}*/
	}
	
	public static double squareRoot(int num) throws ArithmeticException {
		return Math.sqrt(num);
	}
}