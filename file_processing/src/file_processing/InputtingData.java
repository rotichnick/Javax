package file_processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputtingData {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.println(num1+num2);
//		try {	
//			File newfile=new File("myfle");
//		Scanner input=new Scanner(newfile);
//		
//		while (input.hasNextLine()) {
//			String line=input.nextLine();
//			System.out.println(line);
//		}
//		input.close();
//		}catch (FileNotFoundException e) {
//			System.out.println("File Not found");
//		}
//		
		
	}

}
