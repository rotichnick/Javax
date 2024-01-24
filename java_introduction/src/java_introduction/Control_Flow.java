package java_introduction;

public class Control_Flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=0;
	if (age>4 && age<18){
		System.out.println("You are a child");
	}
	else if (age>=18 && age<35) {
		System.out.println("You are a Youth");
	}
	else if (age>=35 && age<65) {
		System.out.println("You are an adult");
	}
	else {
		System.out.println("You are a octagenarian");
	}
}

	}

