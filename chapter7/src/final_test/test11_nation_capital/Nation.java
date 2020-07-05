package final_test.test11_nation_capital;

public class Nation {
	private String country;
	private String capital;
	
	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}
	
	public String getCountry() {
		return country;
	}
	public String getCapital() {
		return capital;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Nation) {
			Nation n = (Nation)obj;
			if (n.getCountry().equals(country))
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return country.hashCode();
	}
}
