import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {
    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;
    private  final ModOperator modOperator;
    public ArithmeticCalculator(ArrayList<String> resultList, AddOperator addOperator, SubtractOperator subtractOperator,
                                MultiplyOperator multiplyOperator, DivideOperator divideOperator, ModOperator modOperator) {
        super(resultList);
        this.addOperator = addOperator;
        this.subtractOperator = subtractOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;
        this.modOperator = modOperator;
    }

    public double calculate(int firstNum, int secondNum, char operator) throws BadInputException{
        //사칙연산
        if (operator == '/' && secondNum == 0){
            throw new BadInputException("나눗셈에서 분모에 0이 들어올 수 없습니다.");
        }
        if (!(operator == '+' || operator == '-' || operator == '*' || operator == '/'|| operator == '%')){
            throw  new BadInputException("사칙연산 기호를 정확히 입력해주세요");
        }

        double result = 0;
        switch (operator) {
            case '+':
                result = addOperator.operate(firstNum, secondNum);
                break;
            case '-':
                result = subtractOperator.operate(firstNum,secondNum);
                break;
            case '*':
                result = multiplyOperator.operate(firstNum,secondNum);
                break;
            case '/':
                result = divideOperator.operate(firstNum,secondNum);
                break;
            case '%':
                result = modOperator.operate(firstNum,secondNum);
                break;
        }

        return result;
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