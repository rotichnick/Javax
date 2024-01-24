package java_introduction;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int month=3;
String monthString;

switch(month) {
case 1: monthString="January";
break;
case 2: monthString="February";
break;
case 3: monthString="March";
break;
default: monthString="Unknown";
break;
}

System.out.println(monthString);

	}

}
