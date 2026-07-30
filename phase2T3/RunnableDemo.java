class StudentThread implements Runnable {

    public void run() {
        String[] students = {"Nimisha", "Rahul", "Ananya", "Rohit", "Priya"};

        for (String student : students) {
            System.out.println(student);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {

        Thread t = new Thread(new StudentThread());
        t.start();
    }
}