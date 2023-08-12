package study230812.demo03;

public class DemoInnerClassThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i+" ");
                }
            }
        }.start();
        Runnable r =new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+i+" ");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
