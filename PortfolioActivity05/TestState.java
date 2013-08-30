/* Datoon, Philip Bryan B.
 * 131311399
 * 2 August 2013
 * Demonstration: State.java
 */

import java.util.Scanner;

public class TestState {
	public static void main(String[] args) {
		State state1 = new State();
		State state2 = new State("Victoria", 5117500,
			   "Melbourne", "Hawthorn", "Collingwood", "Frankston");	
				
		displayState(state1);
		displayState(state2);
	}
	
	public static State displayState(State state) {
		System.out.println("State name: " + state.getStateName());
		System.out.println("Population: " + state.getStatePop());
	   System.out.println("City: " + state.getCapitalCity1());
	   System.out.println("Most populous city: " + state.getMostPopCity1());
		System.out.println("City: " + state.getCapitalCity2());
	   System.out.println("Most populous city: " + state.getMostPopCity2());
		System.out.println();
		
		return state;
	}
}