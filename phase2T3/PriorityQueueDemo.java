import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.print("Enter number of tasks: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Task Priority: ");
            pq.offer(sc.nextInt());
        }

        System.out.println("\nExecution Order:");
        while (!pq.isEmpty()) {
            System.out.println("Executing Priority: " + pq.poll());
        }

        sc.close();
    }
}