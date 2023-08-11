package study230811.demo04;

import java.util.Scanner;
public class demothrowable {
    static String usernames[] = {"zhangsan","lisi","wangwu"};

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String useer01 = in.next();
        checkusername(useer01);
    }
    public static void checkusername(String name)  {
        for (String s : usernames) {
            if(name.equals(s)){
                try {
                    throw new RegisterException("该用户已经被注册！");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("注册成功");
    }
}
