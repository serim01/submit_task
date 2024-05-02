import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(ArrayList<String> resultList) {
        super(resultList);
    }

    public double calculate(int firstNum, int secondNum, char operator) throws BadInputException{
        //사칙연산
        if (operator == '/' && secondNum == 0){
            throw new BadInputException("나눗셈에서 분모에 0이 들어올 수 없습니다.");
        }
        if (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')){
            throw  new BadInputException("사칙연산 기호를 정확히 입력해주세요");
        }

        int result = 0;
        switch (operator) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
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