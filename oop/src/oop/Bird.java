package oop;

public class Bird {

	//Instance variables
		String category;
		String name;
		boolean fly;
		String habitat;
		int numberoflegs;
	//constructor.
		//right click on class name and select source, then generate Constructor using class fields
	public Bird(String category, String name, boolean fly, String habitat, int numberoflegs) {
			super();
			this.category = category;
			this.name = name;
			this.fly = fly;
			this.habitat = habitat;
			this.numberoflegs = numberoflegs;
		}
String fly1;
	public void animaldetails() {
		System.out.println(name +"is an animal " +"of family" +category);
		if (fly==false){
			fly1="Cannot Fly";
		}
		
		System.out.println("can "+fly1 +"and lives in "+habitat +" They have"+numberoflegs);
	}
}
