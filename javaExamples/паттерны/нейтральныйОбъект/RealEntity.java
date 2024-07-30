package паттерны.нейтральныйОбъект;

class RealEntity extends AbstractEntity {

    @Override
    public void doSomething() {
        System.out.println("RealEntity::doSomething");
    }
}