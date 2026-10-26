package calculator;

public class AddStrategy implements OperationStrategy {

    public int execute(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}