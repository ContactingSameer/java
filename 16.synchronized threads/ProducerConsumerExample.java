import java.util.LinkedList;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        LinkedList<Integer> buffer = new LinkedList<Integer>();
        int maxSize = 5;
        Thread producer = new Producer(buffer, maxSize, "Producer");
        Thread consumer = new Consumer(buffer, maxSize, "Consumer");
        producer.start();
        consumer.start();
    }
}

class Producer extends Thread {
    private LinkedList<Integer> buffer;
    private int maxSize;
    private String name;
    private int count = 0;

    public Producer(LinkedList<Integer> buffer, int maxSize, String name) {
        this.buffer = buffer;
        this.maxSize = maxSize;
        this.name = name;
    }

    public void run() {
        while (true) {
            synchronized (buffer) {
                while (buffer.size() == maxSize) {
                    try {
                        System.out.println(name + " is waiting as buffer is full.");
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(name + " produced: " + count);
                buffer.add(count++);
                buffer.notify();
            }
        }
    }
}

class Consumer extends Thread {
    private LinkedList<Integer> buffer;
    private int maxSize;
    private String name;

    public Consumer(LinkedList<Integer> buffer, int maxSize, String name) {
        this.buffer = buffer;
        this.maxSize = maxSize;
        this.name = name;
    }

    public void run() {
        while (true) {
            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    try {
                        System.out.println(name + " is waiting as buffer is empty.");
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int value = buffer.remove();
                System.out.println(name + " consumed: " + value);
                buffer.notify();
            }
        }
    }
}
