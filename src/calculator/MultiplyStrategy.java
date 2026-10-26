package calculator;

public class MultiplyStrategy implements OperationStrategy {

    public int execute(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}