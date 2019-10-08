package fourth;
public class sumproduct {
	public static void Greatest()
	{
	for(int l = 9 ; l>=0 ; l--)
	{
		for(int m = 9 ; m>=0 ; m--)
		{
			for(int n = 9 ; n>=0 ; n--)
			{
				if(l*m*n == l+m+n)
				{
					System.out.println("Greatest 3 digit number"+Integer.toString(l)+Integer.toString(m)+Integer.toString(n));
					return;
				}
			}
		}
	}
}
	public static void Smallest()
	{
	for(int i =1 ; i<=9 ; i++)
	{
		for(int j = 0 ; j<= 9 ; j++)
		{
			for(int k=0 ; k<=9 ; k++)
			{
				if(i*j*k == i+j+k)
				{
					System.out.println("Smallest 3 digit number"+Integer.toString(i)+Integer.toString(j)+Integer.toString(k));
					return;
				}	
			}	
		}
	}
	}
	public static void main(String[] args) {
		Smallest();
		Greatest();
	}
}