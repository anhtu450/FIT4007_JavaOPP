import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create student objects
        Student student1 = new Student(1, "Nguyễn Văn A", 8.5f, 9.0f);
        Student student2 = new Student(2, "Trần Thị B7", 7.0f, 8.0f);
        Student student3 = createStudentFromInput(scanner);

        // Print student information header
        printHeader();

        // Print student information
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        scanner.close();
    }

    private static Student createStudentFromInput(Scanner scanner) {
        Student student = new Student();
        System.out.print("Enter Student ID for student3: ");
        student.setStudentId(scanner.nextInt());
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Name for student3: ");
        student.setName(scanner.nextLine());
        System.out.print("Enter Theory Score for student3: ");
        student.setTheoryScore(scanner.nextFloat());
        System.out.print("Enter Practical Score for student3: ");
        student.setPracticalScore(scanner.nextFloat());
        return student;
    }

    private static void printHeader() {
        System.out.printf("%-10s %-30s %-10s %-10s %-10s\n", "Student ID", "Name", "Theory", "Practical", "Average");
        System.out.println("---------------------------------------------------------------");
    }
}