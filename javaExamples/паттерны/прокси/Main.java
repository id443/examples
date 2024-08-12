package паттерны.прокси;

import паттерны.структурные.заместитель.IMath;
import паттерны.структурные.заместитель.MathProxy;

public class Main {
    public static void main(String[] args) {
		// Create math proxy
		IMath p = new MathProxy();

		// Do the math
		System.out.println("4 + 2 = " + p.add(4, 2));
		System.out.println("4 - 2 = " + p.sub(4, 2));
		System.out.println("4 * 2 = " + p.mul(4, 2));
		System.out.println("4 / 2 = " + p.div(4, 2));
	}
}
