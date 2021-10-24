package tasks.classwork.day8;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

    public static void main(String[] args) {

        Map<Integer, String> words = new HashMap<>();
        String[] array = "мама мыла раму".split(" ");

        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
        }
        for (int in : words.keySet()) {
            System.out.println(in);
        }
        for (String x : words.values()) {
            System.out.println(x);
        }
        for (Map.Entry y : words.entrySet()) {
            System.out.println(y);
        }
    }
}
