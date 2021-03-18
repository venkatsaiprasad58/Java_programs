package oops;

 class Address {
	private String name;
	private  String colName;
	private String cityName;
	
	public Address(String name, String colName, String cityName) {
		super();
		this.name = name;
		this.colName = colName;
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", colName=" + colName + ", cityName=" + cityName + "]";
	}
	
	
}
class Demo_Has_A_RealtionShip {
	public static void main(String[] args) {
		Address a = new Address("prasad", "neeruganti", "anantapur");
		
		
		System.out.println(a);
		
	}

}
