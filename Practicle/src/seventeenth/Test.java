package seventeenth;
import java.util.Scanner; 
public class Test 
{

	public static void main(String[] args) 
	{
		Integer x = 10;
		int choice;
		Scanner sc = new Scanner(System.in);
		do 
		{
		System.out.println("what do u want to do\r\npress:\r\n1) Convert Integer into Java String object and vice-versa.\r\n" + 
				"2) Convert Integer into other primitive data types.\r\n"
		        + "3) Convert a decimal number into binary & vice-versa.\r\n" + 
				"4) Convert a decimal number into octal & vice-versa.\r\n" + 
				"5) Convert a decimal number into hexadecimal & vice-versa.");
		choice = Integer.parseInt(sc.nextLine()); 
		
		switch(choice)
		{
		case 1:
			String s = Integer.toString(x);
			System.out.println("Integer to string:" + s);
			break;
		case 2:
			System.out.println("bytevalue(x) = " + x.byteValue()); 
	        System.out.println("shortvalue(x) = " + x.shortValue()); 
	        System.out.println("intvalue(x) = " + x.intValue()); 
	        System.out.println("longvalue(x) = " + x.longValue()); 
	        System.out.println("doublevalue(x) = " + x.doubleValue()); 
	        System.out.println("floatvalue(x) = " + x.floatValue());
	        break;
		case 3:
			System.out.println("Hexadecimal: " + x.toHexString(x));
			break;
		case 4:
			System.out.println("Octal: " + x.toOctalString(x));
			break;
		case 5:
			System.out.println("binary: " + x.toBinaryString(x));
			break;
		}
		
		}while(choice!=6);

	}

}
