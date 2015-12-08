package Factory;

/**
 * Created by kutsa on 09.12.2015.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}