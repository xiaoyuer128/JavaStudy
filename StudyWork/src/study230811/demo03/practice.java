package study230811.demo03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        System.out.println("请输入字符：");
        Scanner in = new Scanner(System.in);
        String s  =in.next();
        Map<Character ,Integer> map = new HashMap<>();
        for (char c:s.toCharArray()
             ) {
            if(map.containsKey(c)){
                Integer value = map.get(c);
                System.out.print(value+"  ");
                value++;
                System.out.println(value);
                map.put(c,value);

            }else {
                map.put(c,1);
            }
        }
        for (Character key:map.keySet()
             ) {
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }

}
