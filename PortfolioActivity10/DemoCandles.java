/* Datoon, Philip Bryan
 * 131311399
 * 19 August 2013
 * Demonstration: Candle.java and ScentedCandle.java
 */

import java.util.Scanner;

public class DemoCandles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Candle candleA = new Candle();
		ScentedCandle candleB = new ScentedCandle();
		
		// input for CandleA 
		System.out.print("Enter candleA colour: ");
		candleA.setColor(sc.next());
		
		System.out.print("Enter candleA height: ");
		candleA.setHeight(sc.nextDouble());
		
		System.out.println();
		
		// input for CandleB
		System.out.print("Enter candleB colour: ");
		candleB.setColor(sc.next());
		
		System.out.print("Enter candleB scent: ");
		candleB.setScent(sc.next());
		
		System.out.print("Enter candleB height: ");
		candleB.setHeight(sc.nextDouble());
		
		System.out.println();
		
		// displays user inputs
		System.out.println("candleA");
		System.out.println(" Colour: " + candleA.getColor());
		System.out.println(" Height: " + candleA.getHeight());
		System.out.println(" Price: $" + candleA.getPrice());
		
		System.out.println();
		System.out.println("candleB");
		System.out.println(" Colour: " + candleB.getColor());
		System.out.println(" Scent: " + candleB.getScent());
		System.out.println(" Height: " + candleB.getHeight());
		System.out.println(" Price: $" + candleB.getPrice());
	}
}