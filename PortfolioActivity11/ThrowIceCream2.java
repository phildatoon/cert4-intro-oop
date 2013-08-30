/* Datoon, Philip Bryan B.
 * 131311399
 * 23 August 2013
 * Demonstration: IceCreamCone2.java and IceCreamConeException.java
 */

class ThrowIceCream2 {
	public static void main(String[] args){
		
		// both parameters are valid
		System.out.println("CONE1");
		try {
			IceCreamCone2 cone1 = new IceCreamCone2("Chocolate", 2);
			
			System.out.println("flavour: " + cone1.flavor);
			System.out.println("scoops: " + cone1.scoops);
			System.out.println();
		} catch (IceCreamConeException e) {
			System.out.println(e.getMessage());
			System.out.println();
		}
		
		// valid flavour, but number of scoop exceeds limit
		System.out.println("CONE2");
		try {
			IceCreamCone2 cone2 = new IceCreamCone2("Vanilla", 4);
			
			System.out.println("flavour: " + cone2.flavor);
			System.out.println("scoops: " + cone2.scoops);
			System.out.println();
		} catch (IceCreamConeException e) {
			System.out.println(e.getMessage());
			System.out.println();
		}
		
		// invalid flavour, but valid number of scoops
		System.out.println("CONE3");
		try {
			IceCreamCone2 cone3 = new IceCreamCone2("Cheese", 2);
			
			System.out.println("flavour: " + cone3.flavor);
			System.out.println("scoops: " + cone3.scoops);
			System.out.println();
		} catch (IceCreamConeException e) {
			System.out.println(e.getMessage());
			System.out.println();
		}
		
		// both parameters are invalid
		System.out.println("CONE4");
		try {
			IceCreamCone2 cone4 = new IceCreamCone2("Pineapple", 5);
			
			System.out.println("flavour: " + cone4.flavor);
			System.out.println("scoops: " + cone4.scoops);
			System.out.println();
		} catch (IceCreamConeException e) {
			System.out.println(e.getMessage());
			System.out.println();
		}
	}
}