package final_test.test06location;

public class Location {
	
	private String locName;
	private int longtitude;
	private int latitude;
	
	public Location(String locName, int longtitude, int latitude) {
		this.locName = locName;
		this.longtitude = longtitude;
		this.latitude = latitude;
	}
	
	@Override
	public int hashCode() {
		return locName.hashCode() + longtitude + latitude;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Location) {
			Location loc = (Location)obj;
			if (locName.equals(loc)) 
				return true;
			else
				return false;
		}
		return super.equals(obj);
	}
	
	@Override
	public String toString() {

		return locName + "\t" + longtitude + "\t" + latitude;
	}
}
