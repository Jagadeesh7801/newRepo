package rentalSystem;

public class MainClass {
	public static void main(String[] args) {
		BikeRentalSystem bikeRent = new BikeRentalSystem();
		Bikes bike1= new Bikes("B001", "RoyalEnfield", "Classic350", 1500,false);
		Bikes bike2=new Bikes("B002", "RoyalEnfield", "Hunter", 1600,false);
		Bikes bike3=new Bikes("B003", "RoyalEnfield", "Meteor", 1800,false);
		Bikes bike4=new Bikes("B004", "RoyalEnfield", "interceptor", 2000,false);
		Bikes bike5=new Bikes("B005", "RoyalEnfield", "Himalaya", 1500,false);
		Bikes bike6=new Bikes("B006", "RoyalEnfield", "Royal", 1600,false);
		Bikes bike7=new Bikes("B007", "Pulsar", "150", 1100,false);
		Bikes bike8=new Bikes("B008", "pulsar", "Ns200", 1600,false);
		Bikes bike9=new Bikes("B009", "pulsar", "220", 1800,false);
		Bikes bike10=new Bikes("B0010", "yamaha", "R15", 2000,false);
		
		bikeRent.addBike(bike1);
		bikeRent.addBike(bike2);
		bikeRent.addBike(bike3);
		bikeRent.addBike(bike4);
		bikeRent.addBike(bike5);
		bikeRent.addBike(bike6);
		bikeRent.addBike(bike7);
		bikeRent.addBike(bike8);
		bikeRent.addBike(bike9);
		bikeRent.addBike(bike10);
		bikeRent.menu();
		
	}

}
