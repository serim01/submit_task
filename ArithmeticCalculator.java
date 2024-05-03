import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> extends Calculator {
    public final Class<T> type;

    public ArithmeticCalculator(ArrayList<String> resultList, Class<T> type){
        super(resultList);
        this.type = type;
    }

    public T calculate(T firstNum, T secondNum, char operator) throws BadInputException{
        return operatorFactory(operator).operate(firstNum, secondNum);
    }//제네릭 메소드

    private Operator<T> operatorFactory(char operator) throws BadInputException {
        OperatorType operatorType = OperatorType.fromOperator(operator);
        return switch(operatorType){
            case ADDITION ->  new AddOperator(type);
            case SUBTRACTION ->  new SubtractOperator(type);
            case MULTIPLICATION ->  new MultiplyOperator(type);
            case DIVISION ->  new DivideOperator(type);
            case MODULO ->  new ModOperator(type);
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