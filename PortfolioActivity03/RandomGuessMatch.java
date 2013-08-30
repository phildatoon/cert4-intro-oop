/* Datoon, Philip Bryan B.
 * 131311399
 * 29 July 2013 */
 
import java.util.Scanner;
 
public class RandomGuessMatch {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Guess a number (from 1 to 5): ");
		int guess = sc.nextInt();
		
		int random = 1 + (int)(Math.random() * 5);
		
		boolean isEqual = (random == guess);
		
		System.out.println();
		System.out.println(isEqual + " - the number is " + random + ".");
	} 
	
 }