import calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Set the two numbers
        calculator.setNumber1(10);
        calculator.setNumber2(5);

        // Access results directly via operation methods
        System.out.println("Number 1: " + calculator.getNumber1());
        System.out.println("Number 2: " + calculator.getNumber2());
        System.out.println("-------------------------");
        System.out.println("Addition: "       + calculator.getAddition());
        System.out.println("Subtraction: "    + calculator.getSubtraction());
        System.out.println("Multiplication: " + calculator.getMultiplication());
        System.out.println("Division: "       + calculator.getDivision());
    }
}