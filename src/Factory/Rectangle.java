package Factory;

/**
 * Created by kutsa on 09.12.2015.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
