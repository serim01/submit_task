import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(ArrayList<String> resultList) {
        super(resultList);
    }

    public double calculate(int firstNum, int secondNum, char operator) throws BadInputException{
        return operatorFactory(operator).operate(firstNum, secondNum);
    }

    private Operator operatorFactory(char operator) throws BadInputException {
        OperatorType operatorType = OperatorType.fromOperator(operator);
        return switch(operatorType){
            case ADDITION ->  new AddOperator();
            case SUBTRACTION ->  new SubtractOperator();
            case MULTIPLICATION ->  new MultiplyOperator();
            case DIVISION ->  new DivideOperator();
            case MODULO ->  new ModOperator();
        };
    }

    @Override
    public void inquiryResult() { //사칙연산결과 조회
        if (!super.getResultList().isEmpty()) {
            System.out.println("[저장된 사칙연산결과 조회]");
            for (String s : super.getResultList()) {
                System.out.println(s);
            }
        }else{
            System.out.println("저장된 사칙연산결과가 없습니다.");
        }
    }
}