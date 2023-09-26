import java.util.Scanner;

public class calculatenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        if (scanner.hasNextDouble()) {
            double firstNumber = scanner.nextDouble();
            System.out.print("Enter your second number: ");
            if (scanner.hasNextDouble()) {
                double secondNumber = scanner.nextDouble();
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    double total = firstNumber + secondNumber;
                    double minus = firstNumber - secondNumber;
                    double multiply = firstNumber * secondNumber;
                    double divide = firstNumber / secondNumber;
                    System.out.println("total: " + total);
                    System.out.println("minus: " + minus);
                    System.out.println("multiply: " + multiply);
                    System.out.println("divide: " + divide);
                }
            } else {
                System.out.println("Invalid second number. Please enter a valid number.");
            }
        } else {
            System.out.println("Invalid first number. Please enter a valid number.");
        }
        scanner.close();
    }
}