package bit;
public class Toggle 
{
	static int toggle(int n, int k) 
    { 
        return (n ^ (1 << (k-1))); 
    }
	public static void main(String[] args) 
	{
		int n = 7, k = 2; 
        System.out.println(toggle(n , k)); 
	}
}