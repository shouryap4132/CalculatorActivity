package calculator;

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

    // Getters for numbers
    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    // Operations
    public double getAddition() {
        return number1 + number2;
    }

    public double getSubtraction() {
        return number1 - number2;
    }

    public double getMultiplication() {
        return number1 * number2;
    }

    public double getDivision() {
        if (number2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return number1 / number2;
    }
}