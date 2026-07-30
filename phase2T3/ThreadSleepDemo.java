public class ThreadSleepDemo {

    public static void main(String[] args) {

        try {
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("Countdown Finished!");
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted.");
        }
    }
}