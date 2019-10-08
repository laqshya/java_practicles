package second;
import java.util.Scanner;
import java.lang.Math;
public class value {

	public static void main(String[] args) {
		float a;
		System.out.println("Enter the number");
		Scanner Sc = new Scanner(System.in);
		a = Sc.nextFloat();
		System.out.println(Math.floor(a));
		System.out.println(a);
		System.out.println(Math.ceil(a));
		
	}

}
