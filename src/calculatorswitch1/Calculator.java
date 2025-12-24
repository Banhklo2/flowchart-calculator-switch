package calculatorswitch1;

public class Calculator {

    // 속성
    private int num1;
    private int num2;
    private char operator;

    // 생성자

    // 메서드
    public double calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (double) num1 / num2;
            default:
                throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }
}
