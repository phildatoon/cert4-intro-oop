/* Datoon, Philip Bryan
 * 131311399
 * 2 August 2013
 * Demonstration: BirdSighting.java */
	
public class TestBirdSighting {
	public static void main(String[] args) {
		BirdSighting testDef = new BirdSighting();
		BirdSighting testParam = new BirdSighting("pigeon", 2, 5);
		
		// displays default or initialised values
		System.out.println("Bird specie: " + testDef.getSpecie());
		System.out.println("Number seen: " + testDef.getNumberSeen());
		System.out.println("Day of the year: " + testDef.getDay());
		System.out.println();
		
		// displays values from three-parameter constructor
		System.out.println("Bird specie: " + testParam.getSpecie());
		System.out.println("Number seen: " + testParam.getNumberSeen());
		System.out.println("Day of the year: " + testParam.getDay());
		
	}
}