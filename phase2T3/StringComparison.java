import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("Using == : " + (str1 == str2));
        System.out.println("Using equals() : " + str1.equals(str2));
        System.out.println("Using equalsIgnoreCase() : " + str1.equalsIgnoreCase(str2));
        System.out.println("Using compareTo() : " + str1.compareTo(str2));

        System.out.println("\nDifference:");
        System.out.println("== compares object references.");
        System.out.println("equals() compares string content.");
        System.out.println("equalsIgnoreCase() compares content ignoring case.");
        System.out.println("compareTo() compares strings lexicographically.");

        sc.close();
    }
}