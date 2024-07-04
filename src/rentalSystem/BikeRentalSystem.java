package rentalSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BikeRentalSystem {
	private List<Bikes> bikes;
	private List<Customer> customers;
	private List<Rental> rentals;
	
	public BikeRentalSystem() {
		bikes = new ArrayList<>();
		customers = new ArrayList<>();
		rentals = new ArrayList<>();
	}
	public void addBike(Bikes bike) {
		bikes.add(bike);
	}
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	public void rentBike(Bikes bike,Customer customer,int days) {
		if(bike.isAvailable()) {
			bike.rent();
			rentals.add(new Rental(bike,customer,days));
			
		}else {
			System.out.println("bike is not available for rent");
		}
	}
	public void returnBike(Bikes bike) {
		bike.retun();
		Rental rentalToRemove =null;
		for (Rental rental : rentals) {
			if(rental.getBikes()==bike) {
				rentalToRemove = rental;
				break;
			}
			
		}
		if(rentalToRemove!=null) {
			rentals.remove(rentalToRemove);
			System.out.println("bike returned Successfully");
		}else 
			System.out.println("bike was not rented");
	}
	public void menu() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Hamara Bikes Rental Welcomes you");
			System.out.println("1.Rent a Bike");
			System.out.println("2.Exit");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice==1) {
				System.out.println("\n== rent a bike ==\n");
				System.out.println("please enter your name");
				String customerName=sc.nextLine();
				System.out.println("\n available Bikes");
				for (Bikes bike : bikes) {
					if(bike.isAvailable()) {
						System.out.println(bike.getBikeId()+" -- "+bike.getCompany()+" -- "+bike.getModel());
					}
					
				}
				System.out.println("enter the Bike id You want to rent");
				String bikeId=sc.next();
				
				System.out.println("enter the no.of days for rent");
				int rentalDays=sc.nextInt();
				sc.nextLine();
				
				Customer newCustomer =new Customer("CUS"+(customers.size()+1),customerName);
				addCustomer(newCustomer);
				
				Bikes selectedBike=null;
				for (Bikes bike : bikes) {
					if(bike.getBikeId().equals(bikeId) && bike.isAvailable()) {
						selectedBike=bike;
						break;
					}
				}
				if(selectedBike!=null) {
					double totalPrice=selectedBike.calculatePrice(rentalDays);
					System.out.println("\n == rental information == \n");
					System.out.println("CustomerId : "+newCustomer.getCustomerId());
					System.out.println("CustomerNmae :"+newCustomer.getName());
					System.out.println("Bike :"+selectedBike.getCompany()+"--"+selectedBike.getModel());
					System.out.println("Rental Days"+rentalDays);
					System.out.printf("Total price : $%.2f%n",totalPrice);
					System.out.println("\n confirm rental(Y/N):");
					String confirm =sc.nextLine();
					if(confirm.equalsIgnoreCase("Y")) {
						rentBike(selectedBike, newCustomer, rentalDays);
						System.out.println("\n rented Successfully \n");
						System.out.println("******* happy ride ******* ");
						System.out.println(        );
						
					}
					else {
						System.out.println("\n rental cancelled");
					}
				}
				else {
					System.out.println("Invalid selection or Bike not available for Rent");
				}
			}else if(choice == 2) {
				break;
			}else {
				System.out.println("invalid choice please enter a valid choice");
			}
			
		}
		
		System.out.println("\n Thank you for Using Hamara Bikes Rental");
		sc.close();
	}

}
