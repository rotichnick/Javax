package car_dealership;

public class Employee {
int empid;
String name;
String department;
String Specialism;
public Employee(int empid, String name, String department, String specialism) {
	super();
	this.empid = 1234;
	this.name = "Johnie";
	this.department = "General";
	Specialism = "All round";
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getSpecialism() {
	return Specialism;
}
public void setSpecialism(String specialism) {
	Specialism = specialism;
}

}
