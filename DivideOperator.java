import java.util.ArrayList;

public class DivideOperator implements Operator{

    @Override
    public double operate(int firstNum, int secondNum) throws BadInputException {
        if(secondNum == 0 ){
            throw new BadInputException("나눗셈에서 분모에 0이 들어올 수 없습니다.");
        }
        return (double) firstNum / secondNum;
    }
}
