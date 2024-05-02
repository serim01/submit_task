public class ModOperator implements Operator{

    @Override
    public double operate(int firstNum, int secondNum){
        return firstNum % secondNum;
    }
}
