/* Datoon, Philip Bryan B.
 * 131311399
 * 23 August 2013
 */

class IceCreamConeException extends Exception {
	private IceCreamCone cone;
	private String coneFlavor;
	
	IceCreamConeException() {
		// default exception message
		super("Number of ice cream scoops exceeds limit.");
		
		try {
			cone = new IceCreamCone("No flavour", 0);
			coneFlavor = cone.flavor;
		} catch (IceCreamConeException e) {
			e.getMessage();
		}
	}
	
	IceCreamConeException(String message) {
		super(message);
	}
	
	// returns message from the superclass Exception
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}