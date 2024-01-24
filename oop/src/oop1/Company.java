package oop1;

public class Company {

	public static void main(String[] args) {
		
		Part_Time ptime = new Part_Time("John", 273259,"Hospitality");
		
		System.out.println(ptime.Employee_Details());
		
		ptime.SetHoursWorked(23);
		
		ptime.SetRate(23.5);
		ptime.Overtime();
		String str="jjdfhfhfh category";
		System.out.println(str.substring(5,10));
		System.out.println(str.indexOf("c"));
	}

}
