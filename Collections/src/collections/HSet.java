package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Vehicle> hashset=new HashSet<Vehicle>();
		
		Vehicle v1=new Vehicle("Mazda","Joe",8669,true);
		Vehicle v2=new Vehicle("Tesla","Model X",8986,false);
		Vehicle v3=new Vehicle("Toyota","Corolla",8099,false);
		Vehicle v4=new Vehicle("Mahindra","Wish",453,true);
		
		hashset.add(v1);
		hashset.add(v2);
		hashset.add(v3);
		hashset.add(v4);
		
		
		ArrayList<Vehicle> mylist=new ArrayList<Vehicle>(hashset);
		
		Collections.sort(mylist);
		System.out.println(mylist);
		
	}

}
