package collections;

public class Vehicle implements Comparable<Vehicle> {
String make;
String model;
double price;
boolean FourWheel;

@Override
public String toString() {
	return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", FourWheel=" + FourWheel + "]";
}
public Vehicle(String make, String model, double price, boolean fourWheel) {
	super();
	this.make = make;
	this.model = model;
	this.price = price;
	FourWheel = fourWheel;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public boolean isFourWheel() {
	return FourWheel;
}
public void setFourWheel(boolean fourWheel) {
	FourWheel = fourWheel;
}
@Override
public int compareTo(Vehicle o) {
	// TODO Auto-generated method stub
	if(this.price>o.price) {
		return 1;
	}	else if(this.price<o.price) {
			return -1;
					}
	
	return 0;
}


}
