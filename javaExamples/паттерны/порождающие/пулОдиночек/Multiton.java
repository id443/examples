public class Multiton {
    private static final ConcurrentMap<String, Multiton> multitons = new ConcurrentHashMap<>();

    private final String key;
    private Multiton(String key) { this.key = key; }

    public static Multiton getInstance(final String key) {
        return multitons.computeIfAbsent(key, Multiton::new);
    }
}
