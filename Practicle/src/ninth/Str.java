package ninth;
import java.util.Scanner;
public class Str {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter size");
		
		num = Integer.parseInt(sc.nextLine());
		String[] strarr = new String[num];
		
		for(int i=0; i<num ; i++)
		{
			strarr[i] = sc.nextLine();
		}
		

		for(int i=0; i<num ; i++)
		{
			System.out.println(strarr[i]);
		}
		
	}

}
