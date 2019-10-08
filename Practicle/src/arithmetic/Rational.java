package arithmetic;
public class Rational {
	private int numerator , denominator;
	Rational(int n , int d)
	{
		numerator = n;
		if(d>=1)
		{
		denominator = d;
		}
		else
		{
			denominator =1;
		}
	}
	public String toString()
	{
		return "numeretaor :" + numerator + "denominator:" + denominator ;
	}
	public void add(Rational r)
	{
		int num , den;
		den = denominator * r.denominator;
		num = (r.denominator * numerator) + (r.numerator * denominator);
		System.out.println("sum  of two numbers is:"+num+"/"+den);
	}
	public void sub(Rational r)
	{
		int num , den;
		den = denominator * r.denominator;
		num = (r.denominator * numerator) - (r.numerator * denominator);
		System.out.println("difference b/w two numbers is:"+num+"/"+den);
	}
	public void multiply(Rational r)
	{
		int num ,den;
		den = denominator * r.denominator;
		num = numerator * r.numerator;
		System.out.println("product of two numbers is:"+num+"/"+den);
	}
	public void divide(Rational r)
	{
		int num ,den;
		den = denominator * r.numerator;
		num = numerator * r.denominator;
		System.out.println("division of two numbers is:"+num+"/"+den);
	}

}