package паттерны.прокси;

public class Math implements IMath {

	public double add(double x, double y) {
		return x + y;
	}

	public double sub(double x, double y) {
		return x - y;
	}

	public double mul(double x, double y) {
		return x * y;
	}

	public double div(double x, double y) {
		return x / y;
	}
}