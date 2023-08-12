package study230812.demo01;

public class Demo01Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.run();
        System.out.println("nihao");
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main "+i);
        }

    }

}
