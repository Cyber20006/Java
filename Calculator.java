import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        double a = sc.nextDouble();

        System.out.print("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        double b = sc.nextDouble();

        sc.close();

        double result;

        switch (op) {
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Division by zero is not allowed");
                    return;
                }
                result = a / b;
                break;

            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result = " + result);
    }
}