
public class Multiplication extends Calculator
{

	public Multiplication(double d1, double d2) {
		super(d1, d2);
	}

	@Override
	public double calculate() {
		return d1*d2;
	}

}
