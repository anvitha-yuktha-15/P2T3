import java.util.HashSet;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<String> books = new HashSet<>();

        System.out.print("How many books to add? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Book Name: ");
            books.add(sc.nextLine());
        }

        System.out.println("\nUnique Books:");
        for (String book : books) {
            System.out.println(book);
        }

        System.out.println("Total Unique Books: " + books.size());

        sc.close();
    }
}