class SharedData {
    private int value;
    private boolean available = false;

    public synchronized void produce(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        this.value = value;
        available = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        System.out.println("Consumed: " + value);
        available = false;
        notify();
    }
}

class Producer extends Thread {
    SharedData data;

    Producer(SharedData data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.produce(i);
        }
    }
}

class Consumer extends Thread {
    SharedData data;

    Consumer(SharedData data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.consume();
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {

        SharedData data = new SharedData();

        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();
    }
}