package design_patterns.singleton;

public class MySingleton {
    private static MySingleton instance;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            return new MySingleton();
        }
        return instance;
    }

}
