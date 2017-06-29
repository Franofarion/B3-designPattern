package Singleton;

/**
 * Created by baptiste on 29/06/17.
 */
public class Singleton {

    private static Singleton uniqueInstance;

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

}