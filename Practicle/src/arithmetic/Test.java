package arithmetic;
public class Test {
	public static void main(String[] args) {
		Rational r1 = new Rational(2,3);
		Rational r2 = new Rational(3,2);
		System.out.println(r1.toString());
		r1.add(r2);
		r1.sub(r2);
		r1.divide(r2);
		r1.multiply(r2);
		Complex c1 = new Complex(1,1);
		Complex c2 = new Complex(1,1);
		System.out.println(c1.toString());
		c1.add(c2);
		c1.sub(c2);
		c1.product(c2);	
	}
}