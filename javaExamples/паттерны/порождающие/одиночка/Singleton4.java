package паттерны.порождающие.одиночка;

public class Singleton4 {
		
	public static class SingletonHolder {
		public static final Singleton HOLDER_INSTANCE = new Singleton();
	}
		
	public static Singleton getInstance() {
		return SingletonHolder.HOLDER_INSTANCE;
	}
}