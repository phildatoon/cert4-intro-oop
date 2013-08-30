/* Datoon, Philip Bryan B.
 * 131311399
 * 2 August 2013
 * Demonstration: BloodData.java */

import java.util.Scanner;

public class TestBloodData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BloodData test1 = new BloodData();
		BloodData test2 = new BloodData();
		BloodData test3 = new BloodData("AB", "-");
		
		// test1 object - setting values 
		System.out.println("Enter test1 object details");
		System.out.print(">> Enter blood type: ");
		test1.setBloodType(sc.next());
		System.out.print(">> Enter Rh factor: ");
		test1.setRhFactor(sc.next());
		System.out.println();
				
		// displaying test1 object - values from user input
		System.out.println("test1 object - from user input");
		System.out.println("Blood type: " + test1.getBloodType());
		System.out.println("Rh factor: " + test1.getRhFactor());
		System.out.println();
		
		// displaying test2 object - default or initialised values
		System.out.println("test2 object - default values");
		System.out.println("Blood type: " + test2.getBloodType());
		System.out.println("Rh factor: " + test2.getRhFactor());
		System.out.println();
		
		// displaying test3 object - values two-parameter constructor
		System.out.println("test3 object - constructor with parameters");
		System.out.println("Blood type: " + test3.getBloodType());
		System.out.println("Rh factor: " + test3.getRhFactor());		
	}
}