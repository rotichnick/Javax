import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
//System.out.println("Enter Number -1");
//double num1=input.nextInt();
//System.out.println("Enter Number -2");
//double num2=input.nextInt();
//double result=num1*num2;
//System.out.println(num1 +" X " +num2+" = "+result);

		System.out.println("Enter a string to reverse");
		String mystring=input.nextLine();
		System.out.println((reverse_string(mystring)));
	}
public static void multiplication_table(int num) {
	String [] values=new String[10];
	
	
	for(int x=1; x<=10; x++) {
	values[x-1]=(x +" X "+ num +" = "+ (num*x) );;
		
	}
	int i=0;
	while (i<=9) {
		System.out.println(values[i]);
		i++;
	}
}

public static String reverse_string(String n) {
	int l=n.length();
	l-=1;
	String newstr="";
	for (int i=l; i>=0; i--) {
		
		newstr=newstr+n.charAt(i);
	}
	return newstr;
}
}
