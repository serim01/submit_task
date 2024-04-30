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
    }
}