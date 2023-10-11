import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person {
    private String email;
    private int phoneNumber;
    private String major;
    private String address;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName, String email, int phoneNumber, String major, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.major = major;
        this.address = address;
    }
}
public class StudentManagement {
    private List<Person> students;
    public StudentManagement() {
        students = new ArrayList<>();
    }
    public void addStudent(Person student) {
        students.add(student);
    }
    public void editStudent(String email, String newEmail, String newMajor) {
        for (Person student : students) {
            if (student.getEmail().equals(email)) {
                student.setEmail(newEmail);
                student.setMajor(newMajor);
            }
        }
    }
    public void deleteStudent(String email) {
        Iterator<Person> iterator = students.iterator();
        while (iterator.hasNext()) {
            Person student = iterator.next();
            if (student.getEmail().equals(email)) {
                iterator.remove();
            }
        }
    }
    public void showStudents() {
        for (Person student : students) {
            System.out.println("First Name: " + student.getFirstName());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Phone Number: " + student.getPhoneNumber());
            System.out.println("Major: " + student.getMajor());
            System.out.println("Address: " + student.getAddress());
            System.out.println();
        }
    }
    public void deleteAllStudents() {
        students.clear();
    }
}
public class TeacherManagement {
    private List<Person> teachers;

    public TeacherManagement() {
        teachers = new ArrayList<>();
    }
    public void addTeacher(Person teacher) {
        teachers add(teacher);
    }
    public void editTeacher(String email, String newEmail, String newMajor) {
        for (Person teacher : teachers) {
            if (teacher.getEmail().equals(email)) {
                teacher.setEmail(newEmail);
                teacher.setMajor(newMajor);
            }
        }
    }

    public void deleteTeacher(String email) {
        Iterator<Person> iterator = teachers.iterator();
        while (iterator.hasNext()) {
            Person teacher = iterator.next();
            if (teacher.getEmail().equals(email)) {
                iterator.remove();
            }
        }
    }
    public void showTeachers() {
        for (Person teacher : teachers) {
            System.out.println("First Name: " + teacher.getFirstName());
            System.out.println("Last Name: " + teacher.getLastName());
            System.out.println("Email: " + teacher.getEmail());
            System.out.println("Phone Number: " + teacher.getPhoneNumber());
            System.out.println("Major: " + teacher.getMajor());
            System.out.println("Address: " + teacher.getAddress());
            System.out.println();
        }
    }
    public void deleteAllTeachers() {
        teachers.clear();
    }
}
public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        TeacherManagement teacherManagement = new TeacherManagement();
    }
}
