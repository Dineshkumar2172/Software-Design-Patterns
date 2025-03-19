package maang_prep.creational;

public class Singleton {

    private static Singleton instance;
 
    private Singleton() {} // private constructor prevents instantiation from other classes.

    // public method to provide access to the instance.
    public static Singleton getInstance() {
        // creates an initial instance when any of the clients tries to create a object first time.
        // from next time onwards, we need to return the existing instance instead of creating new ones
        if (instance == null) {
            instance = new Singleton(); // creating instance
        }

        return instance;
    }
}
