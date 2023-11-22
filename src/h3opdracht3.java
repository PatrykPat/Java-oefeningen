import java.util.Scanner;

public class h3opdracht3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number");
            double operand1 = scanner.nextDouble();

            // Check if the user wants to exit
            if (operand1 == 0) {
                System.out.println("Exiting the program.");
                break;
            }

            char operator = getOperator();
            double operand2 = scanner.nextDouble();

            double result = evaluateExpression(operand1, operator, operand2);

            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    private static char getOperator() {
        Scanner scanner = new Scanner(System.in);
        char operator;

        while (true) {
            System.out.print("Enter an operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                break;
            } else {
                System.out.println("Invalid operator. Please enter a valid operator.");
            }
        }

        return operator;
    }

    private static double evaluateExpression(double operand1, char operator, double operand2) {
        double result = 0.0;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

        return result;
    }
}