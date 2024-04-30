import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNum = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondNum = sc.nextInt();
        System.out.print("사칙연산 기호를 입력하세요: ");
        sc.nextLine();
        String operator = sc.nextLine();
        char real_operator = operator.charAt(0);
        double result = 0;
        switch (real_operator) {
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
                if(secondNum == 0){
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }else {
                    result = (double) firstNum / secondNum;
                    break;
                }
        }
        System.out.println("결과: " + result);

    }
}