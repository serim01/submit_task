import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[]resultList = new String[10];
        int index = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            sc.nextLine();
            String operator = sc.nextLine();
            char real_operator = operator.charAt(0);

            int result = 0;

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
                    result = firstNum / secondNum;
                    break;
            }
            System.out.println("결과: " + result);
            resultList[index] = firstNum + " " + real_operator + " " + secondNum + " = " + result;
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.nextLine();
            if (exit.equals("exit")) {
                break;
            }
            index++;
        }
//        for(String a : resultList){
//            System.out.println(a);
//        }
    }
}