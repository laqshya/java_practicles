package fifth;
import java.util.Scanner;
public class Numbers {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Entre the number"); 
		int temp = 0;
		int a = Sc.nextInt();
		for(int i = 1 ; i<a ; i++)
		{
			if(a%i == 0)
			{
				temp += i;
			}
		}
		if(temp>a)
		{
			System.out.println("Abundant number");
		}
		else if(temp == a)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Deficient number");
		}
	}
}