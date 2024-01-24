package car_dealership;

public class Dealership {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer mteja=new Customer("Joel", "Bomet", 90000.00,2636);
		Vehicle car1=new Vehicle(2500, "Pickup", 2009);
		car1.setModeoffinance(false);
		car1.setPrice(2300.50);
		String mymessage=mteja.handlecustomer(mteja, car1, car1);
		System.out.println(mymessage);
		String n=mteja.getName();
		System.out.println("jjj " +n);
	}


}
