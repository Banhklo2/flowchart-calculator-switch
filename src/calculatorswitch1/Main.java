package calculatorswitch1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {

            System.out.println("첫 번째 숫자를 입력하시오.: ");
            if (!sc.hasNextInt()) {
                System.out.println("숫자를 입력해주세요!");
                sc.next();
                continue;
            }
            int num1 = sc.nextInt();

            System.out.println("연산자를 입력하시오.: ");
            String opInput = sc.next();
            char operator = opInput.charAt(0);

            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("잘못된 입력입니다. (+, -, *, / 중 하나를 입력하세요.)");
                continue;
            }

            System.out.println("두 번째 숫자를 입력하시오: ");

            if (!sc.hasNextInt()) {
                System.out.println("숫자를 입력해주세요!");
                sc.next();
                continue;
            }
            int num2 = sc.nextInt();

            if (operator == '/' && num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                continue;
            }

            double result = calculator.calculate(num1, num2, operator);
            System.out.println("결과: " + result);
            break;
        }
        sc.close();
    }
}
