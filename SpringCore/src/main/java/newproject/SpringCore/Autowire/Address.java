package newproject.SpringCore.Autowire;

public class Address {
	
	private String steet;
	private String city;
	public String getSteet() {
		return steet;
	}
	public void setSteet(String steet) {
		this.steet = steet;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [steet=" + steet + ", city=" + city + "]";
	}
	
	
	
}
