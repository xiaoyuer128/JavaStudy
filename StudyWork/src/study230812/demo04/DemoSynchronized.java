package study230812.demo04;

public class DemoSynchronized {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {

                synchronized (obj){
                    System.out.println("老板，我要吃包子");
                    try {
                        obj.wait();
                        System.out.println("包子做好啦，可以吃了");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (obj){
                    System.out.println("包子制作完成");
                    obj.notify();
                }
            }
        }.start();

    }
}
