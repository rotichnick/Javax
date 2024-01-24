package oop1;

public class Part_Time extends Employee implements Employment{
public Part_Time(String name, int id, String department) {
		super(name, id, department);
		// TODO Auto-generated constructor stub
	}

int hours_worked;
double rate;

public void SetHoursWorked(int hw) {
	System.out.println("The Part time employee worked: " +hw);
}

public void SetRate(double r) {
	System.out.println("The Part time employee will be paid at the rate of: " +r);
}

@Override
public void Overtime() {
	// TODO Auto-generated method stub
	System.out.println("NO Overtime pay for part time employees");
}
}
