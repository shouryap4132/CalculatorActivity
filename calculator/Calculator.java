package calculator;

import java.util.Scanner;

public class Calculator {
    private double number1;
    private double number2;

    // Setters
    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    // Basic Operations
    public double add() {
        return number1 + number2;
    }

    public double subtract() {
        return number1 - number2;
    }

    public double multiply() {
        return number1 * number2;
    }

    public double divide() {
        if (number2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return number1 / number2;
    }

    // Encapsulated UI Method: Handles input with Scanner and executes via switch statement
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Java Calculator ===");
        System.out.print("Enter first number: ");
        setNumber1(scanner.nextDouble());

        System.out.print("Enter second number: ");
        setNumber2(scanner.nextDouble());

        System.out.print("Choose an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = add();
                break;
            case '-':
                result = subtract();
                break;
            case '*':
                result = multiply();
                break;
            case '/':
                result = divide();
                if (Double.isNaN(result)) {
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                validOperation = false;
                break;
        }

        if (validOperation) {
            System.out.println("-------------------------");
            System.out.printf("Result: %.2f %c %.2f = %.2f%n", number1, operator, number2, result);
        }

        scanner.close();
    }
}