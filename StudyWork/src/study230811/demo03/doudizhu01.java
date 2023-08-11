package study230811.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class doudizhu01 {
    public static void main(String[] args) {
        //准备牌
        HashMap<Integer,String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        List<String> colors = List.of("♥", "♣", "♠", "♦");
        List<String> nums = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
                "Q", "K", "A");
        //大小王存储
        int index = 0;
        poker.put(index,"Bwang");
        pokerIndex.add(index);
        index++;
        poker.put(index,"Xwang");
        pokerIndex.add(index);
        index++;
        for (String s:nums
             ) {
            for (String m:colors
                 ) {
                poker.put(index,m+s);
                pokerIndex.add(index);
                index++;
            }
        }
//        System.out.println(pokerIndex);
//        System.out.println(poker);
        Collections.shuffle(pokerIndex);
        ArrayList<Integer> p01 = new ArrayList<>();
        ArrayList<Integer> p02 = new ArrayList<>();
        ArrayList<Integer> p03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();

        for (int i = 0; i < pokerIndex.size(); i++) {
            if (i >= 51) {
                dipai.add(pokerIndex.get(i));
            }else if(i%3==0){
                p01.add(pokerIndex.get(i));
            }else if(i%3==1){
                p02.add(pokerIndex.get(i));
            }else if(i%3==2){
                p03.add(pokerIndex.get(i));
            }
        }
        Collections.sort(p01);
        Collections.sort(p02);
        Collections.sort(p03);
        Collections.sort(dipai);
        System.out.println(p01);
        System.out.println(p02);
        System.out.println(p03);
        System.out.println(dipai);
        show("p01",poker,p01);
        show("p02",poker,p02);
        show("p03",poker,p03);
        show("dipai",poker,dipai);
    }

    private static void show(String name,HashMap<Integer,String> poker ,ArrayList<Integer> list) {
        System.out.print("name: "+name+": ");
        for (Integer integer : list) {
            String value = poker.get(integer);
            System.out.print(value+"  ");
        }
        System.out.println();
    }
}
