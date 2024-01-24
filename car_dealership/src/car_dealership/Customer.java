package car_dealership;

public class Customer {
	String name="New Customer";
	String address;
	double cashinhand;
	int customerid;
	

	
public Customer(String name, String address, double cashinhand, int customerid) {
		super();
		this.name = name;
		this.address = address;
		this.cashinhand = cashinhand;
		this.customerid = customerid;
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	address=("The Customer Address is: "+ address);
	this.address = address;
}

public double getCashinhand() {
//	String Cash=("Customer has got "+cashinhand);
	return cashinhand;
}

public void setCashinhand(double cashinhand) {
	
	this.cashinhand = cashinhand;
}

public int getCustomerid() {
	return customerid;
}

public void setCustomerid(int customerid) {
	this.customerid = customerid;
}

public String processTransaction() {
	return "Process customer";
}
public String handlecustomer(Customer cust1, Vehicle finance, Vehicle price) {
	
	String message="xxxxx";
	if(finance.isModeoffinance()==true) {
		if(cust1.getCashinhand()>=finance.getPrice()) {
			message=processTransaction();
			
			
		}
else {
			
			double balance=finance.getPrice()-cust1.getCashinhand();
			System.out.println(cust1.getCashinhand());
			message= ("Please get: " + balance +"$ and come back again!");
		}
	}
	
	
	return message;
}

}
