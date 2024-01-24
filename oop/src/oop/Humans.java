package oop;

public class Humans {
String name;
int age;
int height;
String eyecolor;


public Humans(String name, int age, int height, String eyecolor) {
	super();
	this.name = name;
	this.age = age;
	this.height = height;
	this.eyecolor = eyecolor;
}
public void eat() {
	System.out.println("Eating")
}
public void speak() {
	System.out.println("My name is" + name +"and I am " +age +"years old");
	
}
}
