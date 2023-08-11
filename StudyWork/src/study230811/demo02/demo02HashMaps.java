package study230811.demo02;

import java.util.HashMap;
import java.util.Map;

public class demo02HashMaps {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        HashMap<String,Person>  person = new HashMap<>();
        person.put("1号",new Person(18,"001"));
    }
}
