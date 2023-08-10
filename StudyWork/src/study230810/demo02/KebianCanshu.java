package study230810.demo02;

public class KebianCanshu {
    public static void main(String[] args) {

        int m= add(10,20,30,20,20);
        System.out.println(m);
    }
    public static int add(int...arr){//只能有一个可变参数，且如果有多个参数的话，可变参数必须在末尾
        int sum  = 0;
        for (int i : arr) {
            sum +=i;
        }
        return sum;
                
    }
    //Object...arr可接收任意类型的参数
/*  public static int add(int a , int b){
        return a+b;
     } */
}
