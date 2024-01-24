package car_dealership;

public class Vehicle {
private int enginesize;
private double price;
private String model;
private int yom;
private boolean modeoffinance;
public Vehicle(int enginesize, String model, int yom) {
	super();
	this.enginesize = enginesize;
	this.model = model;
	this.yom = yom;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public boolean isModeoffinance() {
	return modeoffinance;
}
public void setModeoffinance(boolean modeoffinance) {
	this.modeoffinance = modeoffinance;
}

}
