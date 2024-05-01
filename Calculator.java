import java.util.ArrayList;

public class Calculator {
    private ArrayList<String> resultList = new ArrayList<>();//사칙연산결과 저장 리스트
    private ArrayList<String> circleResultList = new ArrayList<>(); //원의 넓이 결과 저장 리스트
    static final double PI = 3.14159265358979323846; //pi값은 변하지않는 상수이기 때문에 static final을 사용한다.

    public Calculator(){ }

    public  Calculator(ArrayList<String> resultList, ArrayList<String> circleResultList){
        this.resultList = resultList;
        this.circleResultList = circleResultList;
    }

    public int calculate(int firstNum, int secondNum, char operator) throws BadInputException{
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

        resultList.add(firstNum + " " + operator + " " + secondNum + " = " + result);

        return result;
    }
    public void removeResult() { //사칙연산 결과 제일 처음거 삭제
        if (!resultList.isEmpty()) {
            resultList.remove(0);
        }
    }
    public void inquiryResults() { //사칙연산결과 조회
        if (!resultList.isEmpty()) {
            System.out.println("[저장된 사칙연산결과 조회]");
            for (String s : resultList) {
                System.out.println(s);
            }
        }else{
            System.out.println("저장된 사칙연산결과가 없습니다.");
        }
    }

    public double calculateCircleArea(int radius) { //원의 넓이 구하는 메소드
        double result = 0;
        result = radius * radius * PI;

        return  result;
    }

    public void inquiryCircleResults() { //원의 넓이 연산결과 조회
        if (!circleResultList.isEmpty()) {
            System.out.println("[저장된 원의 넓이 연산결과 조회]");
            for (String s : circleResultList) {
                System.out.println(s);
            }
        }else{
            System.out.println("저장된 원의 넓이 연산결과가 없습니다.");
        }
    }
    public ArrayList<String> getResultList() {
        return resultList;
    }
    public void setResultList(ArrayList<String> resultList) {
        this.resultList = resultList;
    }
    public ArrayList<String> getCircleResultList() {
        return circleResultList;
    }
    public void setCircleResultList(ArrayList<String> circleResultList) {
        this.circleResultList = circleResultList;
    }
}