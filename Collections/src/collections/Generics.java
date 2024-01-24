package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> names=new ArrayList<String>();
names.add("nick");
names.add("John");
names.add("Kenya");


//int x=0;
//for(String i:names) {
////	System.out.println(names.get(x));
//	x++;
//	}
List<Vehicle> vehicles=new LinkedList<Vehicle>();
Vehicle vehicle1=new Vehicle("Toyota","Landcruiser",12300, true);
vehicles.add(vehicle1);
Vehicle vehicle2;
vehicles.add(vehicle2=new Vehicle("Mazda", "Camri", 2342, false));

//for(Vehicle v: vehicles) {
//	System.out.println(v);
//}
	printElements(names);
	printElements(vehicles);
}
	
	
	public static void printElements(List someList) {
		for(int i=0; i<someList.size(); i++) {
			System.out.println(someList.get(i));
			
			}
	}
}
