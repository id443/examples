public class AtomicVolitileSynchronyzed {
    private final AtomicInteger counter = new AtomicInteger(0);
    
    int getValue() {
        return counter.get();
    }
    
    void increment() {
        counter.incrementAndGet();
    }
}
