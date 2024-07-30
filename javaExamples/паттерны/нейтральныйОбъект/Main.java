package паттерны.нейтральныйОбъект;

public class Main {
    public static void main(String[] args) {
        AbstractEntity realEntity = new RealEntity();
        realEntity.doSomething(); // RealEntity::doSomething

        AbstractEntity unknownEntity = new NullEntity();
        unknownEntity.doSomething(); // no output
    }
}
