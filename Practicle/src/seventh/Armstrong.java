package seventh;
import java.lang.Math;
import java.util.Scanner;
public class Armstrong 
{
	public static int order(int no) 
	{
		int n = 0;
		while(no !=0 )
		{
			no /= 10;
			n++;
		}
		return n;
	}
	
	public static boolean isArmstrong(int no)
	{
		int digits = order(no);
		int sum = 0 , temp = no;
		while (temp!=0)
		{
			int  r = temp % 10 ;
			sum += Math.pow(r , digits);
			temp /= 10;
		}
		return( sum == no);
		
	}
	public static void main(String[] args) {
		System.out.println("entre the number");
		Scanner Sc = new Scanner(System.in);
		int num = Sc.nextInt();
		System.out.println("your entered number is armstrong:" + isArmstrong(num));		
	
	}
}