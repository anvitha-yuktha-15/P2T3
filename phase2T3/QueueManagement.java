import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Customer Name: ");
            queue.offer(sc.nextLine());
        }

        System.out.println("\nNext Customer: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Serving: " + queue.poll());
        }

        System.out.println("Remaining Queue: " + queue);

        sc.close();
    }
}