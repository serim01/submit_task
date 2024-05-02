import java.util.ArrayList;

public class SubtractOperator implements Operator{
    @Override
    public double operate(int firstNum, int secondNum){
        return firstNum - secondNum;
    }
}
