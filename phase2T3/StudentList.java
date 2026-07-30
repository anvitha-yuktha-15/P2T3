import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            students.add(sc.nextLine());
        }

        System.out.println("\nStudent List:");
        for (String s : students) {
            System.out.println(s);
        }

        System.out.print("\nSearch student: ");
        String search = sc.nextLine();

        if (students.contains(search))
            System.out.println("Student Found.");
        else
            System.out.println("Student Not Found.");

        System.out.print("Enter student name to remove: ");
        String remove = sc.nextLine();

        if (students.remove(remove))
            System.out.println("Student Removed.");
        else
            System.out.println("Student Not Found.");

        Collections.sort(students);

        System.out.println("\nSorted Student List:");
        for (String s : students) {
            System.out.println(s);
        }

        sc.close();
    }
}