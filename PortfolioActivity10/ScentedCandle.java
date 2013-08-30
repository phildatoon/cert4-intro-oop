/* Datoon, Philip Bryan
 * 131311399
 * 19 August 2013
 */

public class ScentedCandle extends Candle {
	private String scent;
	
	public String getScent() {
		return this.scent;
	}
	
	public void setScent(String scent) {
		this.scent = scent;
	}
	
	@Override
	public void setHeight(double height) {
		super.height = height;
		super.price = 3.00 * height;
	}
}