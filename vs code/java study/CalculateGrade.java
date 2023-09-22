import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your attendance grade: ");
        double attendancegrade = scanner.nextDouble();
        System.out.println("Enter your Practical grade: ");
        double practicalgrade = scanner.nextDouble();
        System.out.println("Enter your Final Exam grade: ");
        double finalexamgrade = scanner.nextDouble();
        double Yourfinalgrade = (attendancegrade * 0.1) + (practicalgrade * 0.2) + (finalexamgrade * 0.7);
        System.out.println("Your final grade is: " + Yourfinalgrade);
        scanner.close();
    }
}
