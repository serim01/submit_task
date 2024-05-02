import java.util.ArrayList;

public class MultiplyOperator implements Operator{

    @Override
    public double operate(int firstNum, int secondNum){
        return firstNum * secondNum;
    }
}
