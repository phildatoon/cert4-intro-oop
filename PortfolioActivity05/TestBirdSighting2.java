/* Datoon, Philip Bryan
 * 131311399
 * 2 August 2013
 * Demonstration: BirdSighting2.java */
	
public class TestBirdSighting2 {
	public static void main(String[] args) {
		BirdSighting2 test1 = new BirdSighting2();
		BirdSighting2 test = new BirdSighting2("seagull", 5, 7);
		
		// displays from the default three-parameter constructor
		System.out.println("Bird specie: " + test.getSpecie());
		System.out.println("Number seen: " + test.getNumberSeen());
		System.out.println("Day of the year: " + test.getDay());
	}
}