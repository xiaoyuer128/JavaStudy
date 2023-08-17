package study230817.demo02;

public class deno02DIgui {
    public static void main(String[] args) {
        int n = sum(4);
        System.out.println(n);
        int m = Jie(4);
        System.out.println(m);
    }
    public  static  int sum(int n){
        if(n == 1)return 1;
        return n+sum(n-1);
    }
    public static int Jie(int n){
        if(n == 1)return 1;
        return n*sum(n-1);
    }
}
