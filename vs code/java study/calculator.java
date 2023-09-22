import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double firstnumber = scanner.nextDouble();
        System.out.print("Enter your second number: ");
        double secondnumber = scanner.nextDouble();
        double total = firstnumber + secondnumber;
        double minus = firstnumber - secondnumber;
        double multiply = firstnumber * secondnumber;
        double divide = firstnumber / secondnumber;
        System.out.println("total: " + total);
        System.out.println("minus: " + minus);
        System.out.println("multiply: " + multiply);
        System.out.println("divide: " + divide);
        scanner.close();
    }
}
