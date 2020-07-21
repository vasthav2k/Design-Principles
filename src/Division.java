
public class Division extends Calculator
{
	public Division(double d1, double d2) {
		super(d1, d2);
	}

	@Override
	public double calculate() {
		return d1/d2;
	}

}
