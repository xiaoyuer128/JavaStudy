package study230812.demo02;

public class DemoRunnable {
    public static void main(String[] args) {
        RunnableImpl impl = new RunnableImpl();
        Thread t = new Thread(impl);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
