import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws BadInputException {

        //ArithmeticCalculator<Double> arithmeticCalculator = new ArithmeticCalculator<>(new ArrayList<>(), Double.class);
        ArithmeticCalculator<Integer> arithmeticCalculator = new ArithmeticCalculator<>(new ArrayList<>(), Integer.class);
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("원의 넓이를 계산하고 싶으시면 1, 사칙연산을 진행하고 싶으시면 2를 입력해주세요.");
            int select = sc.nextInt();
            double result = 0;
            switch (select) {
                case 1:
                    System.out.print("원의 반지름을 입력하세요: ");
                    int radius = sc.nextInt();
                    sc.nextLine();
                    result = circleCalculator.calculate(radius);
                    System.out.println("결과값 : " + result);
                    circleCalculator.getResultList().add(radius + " * " + radius + " * pi = " + result);
                    System.out.println("저장된 원의 넓이 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                    String circleInquiry = sc.nextLine();
                    if (circleInquiry.equals("inquiry")) {
                        circleCalculator.inquiryResult();
                    }
                    break;
                case 2:
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    int firstNum = sc.nextInt();
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    int secondNum = sc.nextInt();
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    sc.nextLine();
                    char operator = sc.nextLine().charAt(0);
                    result = arithmeticCalculator.calculate(firstNum, secondNum, operator);
                    System.out.println("결과값 : " + result);
                    arithmeticCalculator.getResultList().add(firstNum + " " + operator + " " + secondNum + " = " + result);
                    System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                    String remove = sc.nextLine();
                    if (remove.equals("remove")) {
                        arithmeticCalculator.removeResult();
                    }
                    System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                    String inquiry = sc.nextLine();
                    if (inquiry.equals("inquiry")) {
                        arithmeticCalculator.inquiryResult();
                    }
                    System.out.println("저장된 연산결과 중 입력한 값보다 큰 값들을 조회하시겠습니까? (lambda 입력시 조회)");
                    String lambda = sc.nextLine();
                    if (lambda.equals("lambda")) {
                        System.out.println("기준 값을 입력하세요: ");
                        double num = sc.nextDouble();
                        arithmeticCalculator.printResultGreaterThan(num);
                    }
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            sc.nextLine();
            String exit = sc.nextLine();
            if (exit.equals("exit")) {
                break;
            }
        }
    }
}