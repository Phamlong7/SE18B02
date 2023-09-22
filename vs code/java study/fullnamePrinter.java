import java.util.Scanner;

public class fullnamePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you first name: ");
        String firstname = scanner.nextLine();
        System.out.print("Enter you last name: ");
        String lastname = scanner.nextLine();
        String yourfullname = firstname + " " + lastname;
        System.out.println("Your full name is: " + yourfullname);
        scanner.close();
    }
}