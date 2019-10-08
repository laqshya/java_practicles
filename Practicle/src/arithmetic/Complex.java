package arithmetic;
public class Complex 
{
	private double real , imaginary;
	Complex(double r , double i)
	{
		this.real = r;
		this.imaginary = i;
	}
	public String toString()
	{
		return real + "+" + imaginary + "i" ;
	}
	public void add(Complex c)
	{
		double i , r;
		i = this.imaginary + c.imaginary;
		r = this.real + c.real;
		System.out.println(r + "+" + i + "i");
	}
	public void sub(Complex c)
	{
		double i , r;
		i = this.imaginary - c.imaginary;
		r = this.real - c.real;
		System.out.println(r + "+" + i + "i");
	}
	public void product(Complex c)
	{
		double i , r;
		r = ((this.real * this.imaginary) - (c.real * c.imaginary));
		i = ((this.real * c.imaginary) + (c.real * this.imaginary));
		System.out.println(r + "+" + i + "i");
	}	
}