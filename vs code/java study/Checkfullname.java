import java.util.Scanner;

public class Checkfullname {
    public static void main(String[] args) {
        String[] lists = { "Võ Trần Tuấn Kiệt", "Phạm Nguyễn Duy Long", "Thân Đức Quang Vinh",
                "Phạm Cao Hoàng Khương", "Johnny" };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Full name need to check: ");
        String fullnamecheck = scanner.nextLine();
        boolean exist = false;
        for (String name : lists) {
            if (name.equalsIgnoreCase(fullnamecheck)) {
                exist = true;
                break;
            }
        }
        if (exist) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
