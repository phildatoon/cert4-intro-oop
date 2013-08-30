/* Datoon, Philip Bryan
 * 131311399
 * 2 August 2013
 * Using constructor with parameters */
	
public class BirdSighting2 {
	private String specie;
	private int numberSeen;
	private int day;

	BirdSighting2() {
		this("robin", 1, 1);
	}
	
	BirdSighting2(String s) {
		this(s, 1, 1);
	}

	// constructor with parameters (default)
	BirdSighting2(String specie, int numberSeen, int day) {
		this.specie = specie;
		this.numberSeen = numberSeen;
		this.day = day;
	}
	
	public String getSpecie() {
		return specie;
	}
	
	public int getNumberSeen() {
		return numberSeen;
	}
	
	public int getDay() {
		return day;
	}
}