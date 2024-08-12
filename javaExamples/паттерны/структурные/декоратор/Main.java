package паттерны.структурные.декоратор;

class Main {
	
	public static void main (String... s) {
		Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
		c.doOperation(); // Результат выполнения программы "Hello, World!"
	    c.newOperation(); // New hello operation
    }
}