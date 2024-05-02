import java.util.ArrayList;

public class AddOperator implements Operator{
    @Override
    public double operate(int firstNum, int secondNum){
        return firstNum + secondNum;
    }
}
