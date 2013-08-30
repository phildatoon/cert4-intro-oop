/* Datoon, Philip Bryan
 * 131311399
 * 2 August 2013
 * Using overloaded constructors */
	
public class BirdSighting {
	private String specie;
	private int numberSeen;
	private int day;
	
	// constructor with initialised values (default)
	BirdSighting() {
		specie = "robin";
		numberSeen = 1;
		day = 1;
	}
	
	// constructor with parameters
	BirdSighting(String specie, int numberSeen, int day) {
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