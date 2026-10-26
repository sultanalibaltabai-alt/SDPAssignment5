package calculator;

public class Main {

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 5;

        Calculator calculator = new Calculator(new AddStrategy());
        System.out.println("Add: " + calculator.calculate(firstNumber, secondNumber));

        calculator.setStrategy(new SubtractStrategy());
        System.out.println("Subtract: " + calculator.calculate(firstNumber, secondNumber));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("Multiply: " + calculator.calculate(firstNumber, secondNumber));
    }
}