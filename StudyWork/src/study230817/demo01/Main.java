package study230817.demo01;
//使用Lambda表达式实现多线程
public class Main {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        }
                ).start();
    }
}
