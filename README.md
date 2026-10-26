# Assignment 5 - Strategy Pattern (Calculator)

A simple Java calculator that uses the Strategy pattern.
The calculator can change its operation at runtime.

## Project structure

```
src/calculator/
├── OperationStrategy.java
├── AddStrategy.java
├── SubtractStrategy.java
├── MultiplyStrategy.java
├── Calculator.java
└── Main.java
```

## How to build and run

Requirements: JDK 17.

From the project root:

```
javac -d out src/calculator/*.java
java -cp out calculator.Main
```

Or open the project in IntelliJ IDEA and run `Main`.

Expected output:

```
Add: 15
Subtract: 5
Multiply: 50
```

## How to add a new strategy

1. Create a new class in `src/calculator`, for example `MaxStrategy`.
2. Implement `OperationStrategy` and write the algorithm in `execute`.
3. In `Main`, pass the new strategy to `calculator.setStrategy(...)`.

No existing class needs to be changed.