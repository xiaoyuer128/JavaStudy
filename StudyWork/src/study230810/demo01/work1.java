package study230810.demo01;

import java.util.HashSet;

/*
必须重写hashCode() and equals()
 */
public class work1 extends Object {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("1号",19);
        Person p2 = new Person("2号",19);
        Person p3 = new Person("1号",19);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }

}
