import java.util.ArrayList;

public abstract class Calculator {
    private ArrayList<String> resultList = new ArrayList<>();//사칙연산결과 저장 리스트
    public static final double PI = 3.14159265358979323846; //pi값은 변하지않는 상수이기 때문에 static final을 사용한다.

    public  Calculator(ArrayList<String> resultList){
        this.resultList = resultList;
    }

    public void removeResult() { //사칙연산 결과 제일 처음거 삭제
        if (!resultList.isEmpty()) {
            resultList.remove(0);
        }
    }
    public ArrayList<String> getResultList() {
        return resultList;
    }
    abstract void inquiryResult();

}