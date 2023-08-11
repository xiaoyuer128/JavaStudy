package study230811.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class work1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("1号",001);
        map.put("2号",002);
        map.put("3号",003);
        map.put("4号",004);
        System.out.println(map);
        //删除1号；remove返回v,无K返回null;
        map.remove("1号");
        //get方法有对应的K返回v，无K返回null;
        Integer m = map.get("2号");
        System.out.println(m);
        System.out.println(map);
        //遍历map集合:keySet();
        /*Set<String> set = map.keySet();*/
      /*  Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String s = it.next();
            Integer v = map.get(s);
            System.out.println(v);
        }
        System.out.println("------------");
        for (String s: set//set ==map.KeySet();
             ) {
            System.out.println(map.get(s));
        }*/

        Set<Map.Entry<String, Integer>> set1 = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
        while (it1.hasNext()){
            Map.Entry<String,Integer> entry = it1.next();
            System.out.println(entry.getKey()+entry.getValue());
        }
        System.out.println("------------");
        for (Map.Entry<String,Integer> entry :set1
             ) {
            System.out.println(entry.getKey()+entry.getValue());
        }
    }


}
