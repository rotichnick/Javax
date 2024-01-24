package oop1;

public class Full_Time extends Employee implements Employment{
	
	double salary;
	int leavedays;
	
public Full_Time(String name, int id, String department) {
		super(name, id, department);
		// TODO Auto-generated constructor stub
	}


public void Setsalary(String s) {
	System.out.println("The Full time employee worked: " +s +"Monthly");
}

public void Setleavedays(String ldays) {
	System.out.println("The Full time employee is entitled to: " +ldays +"leave days annually");
}


@Override
public void Overtime() {
	// TODO Auto-generated method stub
	System.out.println("Overtime pay shall be determined by management");
}
}
