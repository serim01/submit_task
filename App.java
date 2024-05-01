import java.util.Scanner;

public class App {
    public static void main(String[] args) throws BadInputException {
        Calculator calculator = new Calculator();
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

            System.out.println("결과값 : " + calculator.calculate(firstNum, secondNum, real_operator));

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.nextLine();
            if (remove.equals("remove")) {
                calculator.getResultList().remove(0);
            }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.nextLine();
            if (inquiry.equals("inquiry")) {
                System.out.println("결과값 ");
                for (String s : calculator.getResultList()) {
                    System.out.println(s);
                }
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.nextLine();
            if (exit.equals("exit")) {
                break;
            }
        }
    }
}