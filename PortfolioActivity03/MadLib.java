/* Datoon, Philip Bryan B.
 * 131311399
 * 29 July 2013 */

import java.util.Scanner;

public class MadLib {
	public static void main(String[] args) {
		String word1;
		String word2;
		String word3;
		String word4;
		String word5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter word 1: ");
		word1 = sc.next();
		System.out.print("Enter word 2: ");
		word2 = sc.next();
		System.out.print("Enter word 3: ");
		word3 = sc.next();
		System.out.print("Enter word 4: ");
		word4 = sc.next();
		System.out.print("Enter word 5: ");
		word5 = sc.next();
		
		System.out.println("\nMary had a little " + word1);
		System.out.println("Its " + word2 + " was " + word3 + " as snow");
		System.out.println("And everywhere that Mary " + word4);
		System.out.println("The " + word5 + " was sure to go.");
	}
 }