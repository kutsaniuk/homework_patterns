package Singleton;

/**
 * Created by kutsa on 09.12.2015.
 */
public class SingleObject {
    private static SingleObject ourInstance = new SingleObject();

    public static SingleObject getInstance() {
        return ourInstance;
    }

    private SingleObject() {
    }

    public SingleObject showMessage(){
        System.out.println("Hello World!");
        return null;
    }
}
