package Strategy;

/**
 * Created by kutsa on 09.12.2015.
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}