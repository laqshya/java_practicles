package fifteenth;
public class Test {
	public static void main(String[] args) 
	{
		Test t = new Test();
		t = null;
		final int a = 5;
		try {
			 int c = a/5;
		}
		finally 
		{
			System.out.println(a);
		}
		System.gc();
	}
	public void finalize()
	{
		System.out.println("clearing data");
	}
}