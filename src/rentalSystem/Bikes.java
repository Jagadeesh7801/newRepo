package rentalSystem;

public class Bikes {
	private String bikeId;
	private String company;
	private String model;
	private float basePrice;
	private boolean isAvailable;
	
	
	public Bikes(String bikeId,String company,String model,int basePrice,boolean isAvailable) {
		this.bikeId=bikeId;
		this.company=company;
		this.model=model;
		this.basePrice=basePrice;
		this.isAvailable=true;
	}
	
	public String getBikeId() {
		return bikeId;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public float getBasePrice() {
		return basePrice;
	}


	public boolean isAvailable() {
		return isAvailable;
	}
	public double calculatePrice(int rentalDays) {
		return basePrice*rentalDays;
	}
	public void rent() {
		isAvailable=false;
	}
	public void retun() {
		isAvailable=true;
	}


	


	

}
