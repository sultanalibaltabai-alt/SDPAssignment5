package calculator;

public class Calculator {

    private OperationStrategy strategy;

    public Calculator(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int firstNumber, int secondNumber) {
        return strategy.execute(firstNumber, secondNumber);
    }
}