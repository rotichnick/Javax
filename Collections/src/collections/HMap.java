package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HMap {

	public static void main(String[] args) {
		Scanner str=new Scanner(System.in);
		// TODO Auto-generated method stub
HashMap<String,String> dictionary=new HashMap<String,String>();
dictionary.put("Brave", "Jasiri");
for(int x=1; x<=5; x++) {
	System.out.println("Enter key infor");
	String key= str.nextLine();
	System.out.println("Enter val info");
	String val=str.nextLine();
	dictionary.put(key, val);
}
//To print out the keys:
//for(String r:dictionary.keySet()) {
//	System.out.println(r);
//}
//To print out the values:
for(String r:dictionary.keySet()) {
	System.out.println(dictionary.get(r));
}
//To print out all: ie keys and values:
for(Map.Entry<String, String> entry:dictionary.entrySet()) {
	System.out.println(entry.getKey());
	System.out.println(entry.getValue());
}
	}
	

}
