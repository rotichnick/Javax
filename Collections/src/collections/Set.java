package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Animals> animal=new LinkedHashSet<Animals>();
		
		Animals animal1=new Animals("Dog", 12);
		Animals animal2=new Animals("Cat", 2);
		Animals animal3=new Animals("Lion", 11);
		Animals animal4=new Animals("Bear", 13);
		Animals animal5=new Animals("Dog", 12);


		animal.add(animal5);
		animal.add(animal4);
		animal.add(animal3);
		animal.add(animal2);
		animal.add(animal1);
		
		System.out.println(animal1.equals(animal5));
		for(Animals v: animal) {
			System.out.println(v);
		}
	}

}
