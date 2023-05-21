public class ThreadDemo {
    public static void main(String[] args) {
        // Create three threads
        Thread thread1 = new Thread(new GoodMorning());
        Thread thread2 = new Thread(new Hello());
        Thread thread3 = new Thread(new Welcome());

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }

    // A class that implements the Runnable interface to define the behavior of the "Good Morning" thread
    static class GoodMorning implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("Good Morning");
                try {
                    Thread.sleep(1000); // Sleep for one second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // A class that implements the Runnable interface to define the behavior of the "Hello" thread
    static class Hello implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("Hello");
                try {
                    Thread.sleep(2000); // Sleep for two seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // A class that implements the Runnable interface to define the behavior of the "Welcome" thread
    static class Welcome implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("Welcome");
                try {
                    Thread.sleep(3000); // Sleep for three seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
