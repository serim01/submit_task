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

    private Operator<T> operatorFactory(char operator){
        OperatorType operatorType = OperatorType.fromOperator(operator);
        return switch(operatorType){
            case ADDITION ->  new AddOperator<>(type);
            case SUBTRACTION ->  new SubtractOperator<>(type);
            case MULTIPLICATION ->  new MultiplyOperator<>(type);
            case DIVISION ->  new DivideOperator<>(type);
            case MODULO ->  new ModOperator<>(type);
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
    //저장된 결과 중 입력값보다 큰 결과값들을 출력.조회하는 메서드
    //값을 예시처럼 int/double로 저장하지않고 String으로 저장하여 substring과 indexof를 가지고 결과값으로만 비교하여 추출하였음.
    public void printResultGreaterThan(double num){
        System.out.println("[결과값이 기준값보다 큰 연산결과]");
        super.getResultList().stream().filter(result->Double.parseDouble(result.substring(result.indexOf("=")+2)) > num)
                .forEach(System.out::println);
    }
}