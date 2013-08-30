/* Datoon, Philip Bryan B.
 * 131311399
 * 23 August 2013
 * Demonstration: IceCreamCone.java and IceCreamConeException.java
 */

class ThrowIceCream {
	public static void main(String[] args){
		
		// valid
		System.out.println("CONE1");
		try {
			IceCreamCone cone1 = new IceCreamCone("Chocolate", 2);
			
			System.out.println("flavor: " + cone1.flavor);
			System.out.println("scoops: " + cone1.scoops);
			System.out.println();
		} catch (IceCreamConeException e) {
			System.out.println(e.getMessage());
		}
		
		// number of scoop exceeds limit
		System.out.println("CONE2");
		try {
			IceCreamCone cone2 = new IceCreamCone("Vanilla", 4);
			
			System.out.println("flavor: " + cone2.flavor);
			System.out.println("scoops: " + cone2.scoops);
			System.out.println();
		} catch (IceCreamConeException e) {
			System.out.println(e.getMessage());
			System.out.println();
		}
	}
}