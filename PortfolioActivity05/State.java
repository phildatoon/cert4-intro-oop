/* Datoon, Philip Bryan B.
 * 131311399
 * 2 August 2013
 * Using overloaded constructor and inner class
 */

public class State {
	private String stateName;
	private int statePop;
	private City city1;
	private City city2;
	
	State() {
		this("Western Australia", 2472400,
				"Perth", "Mandurah", "Esperance", "Geraldton");
	}
	
	State(String stateName, int statePop,
			String cityCap1, String mostPopCity1,
			String cityCap2, String mostPopCity2) {
			
		this.stateName = stateName;
		this.statePop = statePop;
		this.city1 = new City(cityCap1, mostPopCity1);
		this.city2 = new City(cityCap2, mostPopCity2);
	}
	
	// methods for State class
	public String getStateName() {
		return this.stateName;
	}
		
	public long getStatePop() {
		return this.statePop;
	}

	public String getCapitalCity1() {
		return this.city1.getCapitalCity();
	}
	
	public String getMostPopCity1() {
		return this.city1.getMostPopCity();
	}
	
	public String getCapitalCity2() {
		return this.city2.getCapitalCity();
	}
	
	public String getMostPopCity2() {
		return this.city2.getMostPopCity();
	}
	
	public String setStateName() {
		return this.stateName;
	}
		
	public long setStatePop() {
		return this.statePop;
	}

	public void setCapitalCity1(String capitalCity1) {
		city1.setCapitalCity(capitalCity1);
	}
	
	public void setMostPopCity1(String mostPopCity1) {
		city1.setMostPopCity(mostPopCity1);
	}
	
	public void setCapitalCity2(String capitalCity2) {
		city2.setCapitalCity(capitalCity2);
	}
	
	public void setMostPopCity2(String mostPopCity2) {
		city2.setMostPopCity(mostPopCity2);
	}
	
	private class City {
		private String capitalCity;
		private String mostPopCity;
				
		// constructor for City class		
		City(String name, String mostPop) {			
			this.capitalCity = name;
			this.mostPopCity = mostPop;
		}
		
		// methods for City class
		public String getCapitalCity() {
			return this.capitalCity;
		}
		
		public String getMostPopCity() {
			return this.mostPopCity;
		}
		
		public void setCapitalCity(String name) {
			this.capitalCity = name;;
		}
	
		public void setMostPopCity(String mostPop) {
			this.mostPopCity = mostPop;
		}
	}
}