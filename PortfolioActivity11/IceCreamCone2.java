/* Datoon, Philip Bryan B.
 * 131311399
 * 23 August 2013
 */

class IceCreamCone2 {
	protected String flavor;
	protected int scoops;
	private static String FLAVOR_1 = "Chocolate";
	private static String FLAVOR_2 = "Vanilla";
	private static String FLAVOR_3 = "Strawberry";
	private static String FLAVOR_4 = "Mango";
	private static double NUMBER_OF_SCOOPS_LIMIT = 3;

	IceCreamCone2(String flavor, int scoops) throws IceCreamConeException {
		setFlavor(flavor);
		setScoops(scoops);
	}

	public void setFlavor(String flavor) throws IceCreamConeException {
		if (FLAVOR_1.equals(flavor)
				|| FLAVOR_2.equals(flavor)
				|| FLAVOR_3.equals(flavor)
				|| FLAVOR_4.equals(flavor)) {
			this.flavor = flavor;
		} else {
			// instantiates IceCreamConeException with message as value of its parameter
			throw (new IceCreamConeException("Flavour does not match."));
		}
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