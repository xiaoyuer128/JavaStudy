package study230810.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collectinosdemo {
    public static void main(String[] args) {
        ArrayList<Student> clo  = new ArrayList<>();
        Student s1 = new Student(18,"num1");
        Student s2 = new Student(21,"num2");
        Student s3 = new Student(20,"num3");
        clo.add(s1);
        clo.add(s2);
        clo.add(s3);
        System.out.println(clo);

        Collections.sort(clo, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()- o2.getAge();//升序
            }
        });//可组合排序，
        System.out.println(clo);

    }
}
