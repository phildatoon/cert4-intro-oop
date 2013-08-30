/* Datoon, Philip Bryan
 * 131311399
 * 19 August 2013
 */
 
public class CabinRental {
	private int cabinNum;
	protected double weeklyRate;
	
	CabinRental(int num) {
		this.cabinNum = num;
		
		if (num == 1) {
			this.weeklyRate = 950;
		} else {
			this.weeklyRate = 1100;
		}
	}
	
	public int getCabinNum() {
		return this.cabinNum;
	}
	
	public double getWeeklyRate() {
		return this.weeklyRate;
	}
}