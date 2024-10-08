package паттерны.порождающие.одиночка;

public class Singleton3 {
    private static volatile Singleton instance;

    public static Singleton getInstance() {
    Singleton localInstance = instance;
    if (localInstance == null) {
        synchronized (Singleton.class) {
            localInstance = instance;
            if (localInstance == null) {
                instance = localInstance = new Singleton();
            }
        }
    }
    return localInstance;
}
}