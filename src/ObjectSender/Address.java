package ObjectSender;

public class Address {
	
	private String street = "ayy lmao";
	private int houseNum = 23;
	private int zip = 11111;
	
	public Address(){
		
	}
	
	public Address(String streetName, int houseNum, int zip){
		this.street = streetName;
		this.houseNum = houseNum;
		this.zip = zip;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
}
