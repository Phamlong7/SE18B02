import java.util.ArrayList;
import java.util.List;
public class Person {
    private String email;
    private String firstName;
    private String lastName;
    private int birthYear;
    private String gender;
    private String phoneNumber;
    private String address;
    public Person(String email, String firstName, String lastName, int birthYear, String gender, String phoneNumber, String address) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
    public void changePhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }
    public void changeAddress(String newAddress) {
        this.address = newAddress;
    }
    public static void main(String[] args) {
        Person person = new Person("Long@example.com", "Pham", "Long", 2004, "Male", "0868772004", "123 Main St");
        System.out.println("Personal Information:");
        person.displayInfo();
        person.changePhoneNumber("0868772005");
        person.changeAddress("456 Elm St");
        System.out.println("\nUpdated Information:");
        person.displayInfo();
    }
}
public class Lecturer extends Person {
    private List<String> coursesTaught;
    public Lecturer(String email, String firstName, String lastName, int birthYear, String gender, String phoneNumber, String address) {
        super(email, firstName, lastName, birthYear, gender, phoneNumber, address);
        coursesTaught = new ArrayList<>();
    }
    public void addCourse(String courseName) {
        coursesTaught.add(courseName);
    }
    public void displayCoursesTaught() {
        System.out.println("Courses Taught:");
        for (String course : coursesTaught) {
            System.out.println(course);
        }
    }
}
public class Student extends Person {
    private List<String> coursesTaught;
    public Student(String email, String firstName, String lastName, int birthYear, String gender, String phoneNumber, String address){
        super(email, firstName, lastName, birthYear, gender, phoneNumber, address);
        this.major=major;
        courseEnrolled = new ArrayList<>();
    }
    public void enrolleCourse(String courseName){
        courseEnrolled.add(courseName);
    } 
    public void displayEnrolledCourses() {
        System.out.println("Enrolled Courses (Major: " + major + "):");
        for (String course : coursesEnrolled) {
            System.out.println(course);
        }
    }
}