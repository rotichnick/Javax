package java_introduction;

public class Unary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;  
		int b=-10;  
		boolean c=true;  
		boolean d=false;  
		System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b);//9 (inverts the bits of -10 in binary)  
		//-10: 1 1 1 1 0 1 1 0 inverts to: 0 0 0 0 1 0 0 1 
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true  
	}

}
