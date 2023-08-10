package study230810.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Doudizhu {
    //准备牌
    public static void main(String[] args) {
        //玩家和底牌集合
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        ArrayList<String> poker = new ArrayList<>();
        String[] color = {"♥","♣","♠","♦"};
        String[] nums = {"2","3","4","5","6","7","8","9","10","J",
                "Q","K","A"};
        String[] Joker = {"Bwang","Swang"};
        for (int i = 0; i < Joker.length; i++) {
            poker.add(Joker[i]);
        }
        for (String s: nums
             ) {
            for (String m:color
                 ) {
                //存储到牌中
                poker.add(m+s);
            }
        }
        System.out.println(poker);//打印牌
        System.out.println(poker.size());//判断牌数是否含有54张
        Collections.shuffle(poker);//shuffle函数洗牌
        System.out.println(poker);//打印洗牌过后的牌

        /*
        发牌，模0  模1 模2 底牌>=51
         */
        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            if(i>=51){
                dipai.add(s);
            }else if (i%3==0){
                player01.add(s);
            }else if (i%3==1){
                player02.add(s);
            }else{
                player03.add(s);
            }
        }

        //看牌
        System.out.println("player01 的牌："+player01);
        System.out.println("player02 的牌："+player02);
        System.out.println("player03 的牌："+player03);
        System.out.println("底牌："+dipai);



    }




}
