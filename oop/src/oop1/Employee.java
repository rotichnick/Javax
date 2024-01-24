package oop1;

public class Employee {
	String name;
	int id;
	String Department;
	
	public Employee(String name, int id, String department) {
		super();
		this.name = name;
		this.id = id;
		Department = department;
	}
	public String Employee_Details() {
		return (name +"is an employee with national ID" +id +"in the department of " +Department );
	}
	
}
