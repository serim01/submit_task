import java.util.ArrayList;

public class CircleCalculator extends Calculator {

    public CircleCalculator(ArrayList<String> resultList) {
        super(resultList);
    }

    public double calculate(int radius) {
        return radius * radius * PI;
    }

    @Override
    public void inquiryResult() { //원의 넓이 연산결과 조회
        if (!super.getResultList().isEmpty()) {
            System.out.println("[저장된 원의 넓이 연산결과 조회]");
            for (String s : super.getResultList()) {
                System.out.println(s);
            }
        }else{
            System.out.println("저장된 원의 넓이 연산결과가 없습니다.");
        }
    }

}