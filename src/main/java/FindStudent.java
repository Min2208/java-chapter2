import java.util.Scanner;

public class FindStudent {

    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String student = scanner.next();
        boolean exit=true;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                System.out.println("Position of student " + student + "is: " + i);
                exit=false;
            }
        }
        if (exit) {
            System.out.println("Student not found");
        }
    }
}
