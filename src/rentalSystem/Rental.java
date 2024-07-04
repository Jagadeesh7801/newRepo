package rentalSystem;

public class Rental {
	private Bikes bike;
	private Customer customer;
	private int days;
	
	public Rental(Bikes bike,Customer customer,int days) {
		this.bike = bike;
		this.customer=customer;
		this.days=days;
	}
	public Bikes getBikes() {
		return bike;
	}
	public Customer getCustomer() {
		return customer;
	}
	public int days() {
		return days;
	}

}
