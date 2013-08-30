/* Datoon, Philip Bryan
 * 131311399
 * 19 August 2013
 */
 
public class HolidayCabinRental extends CabinRental {
	private int roomNum;
	
	HolidayCabinRental(int cabinNum, int room) {
		super(cabinNum);
		super.weeklyRate = super.getWeeklyRate() + 150;
		this.roomNum = room;
	}
	
	public int getRoomNum() {
		return this.roomNum;
	}
}