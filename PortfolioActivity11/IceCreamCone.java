/* Datoon, Philip Bryan B.
 * 131311399
 * 23 August 2013
 */

class IceCreamCone {
	protected String flavor;
	protected int scoops;
	public static double NUMBER_OF_SCOOPS_LIMIT = 3;

	IceCreamCone(String flavor, int scoops) throws IceCreamConeException {
		setFlavor(flavor);
		setScoops(scoops);
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public void setScoops(int scoops) throws IceCreamConeException {
		if (scoops > NUMBER_OF_SCOOPS_LIMIT) {
			// instantiates default IceCreamConeException
			throw (new IceCreamConeException());
		} else {
			this.scoops = scoops;
		}
	}
}