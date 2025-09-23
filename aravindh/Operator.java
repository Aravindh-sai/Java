package aravindh;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a  = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        System.out.print("Enter the operator (+, -, *, /): ");
        char op = in.next().charAt(0);
        int result = 0;
        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                in.close();
                return;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            in.close();
            return;
        }
        System.out.println("The result is: " + result);
        in.close();

    }
}
