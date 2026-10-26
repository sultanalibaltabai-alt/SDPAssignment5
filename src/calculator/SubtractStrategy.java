package calculator;

public class SubtractStrategy implements OperationStrategy {

    public int execute(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}