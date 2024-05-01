import java.util.ArrayList;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private ArrayList<String> resultList = new ArrayList<String>();

    public ArrayList<String> getResultList() {
        return resultList;
    }

    public void setResultList(ArrayList<String> resultList) {
        this.resultList = resultList;
    }
    public Calculator(){ }

    public int calculate(int firstNum, int secondNum, char operator) throws BadInputException{

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

        resultList.add(firstNum + " " + operator + " " + secondNum + " = " + result);

        return result;
    }
}