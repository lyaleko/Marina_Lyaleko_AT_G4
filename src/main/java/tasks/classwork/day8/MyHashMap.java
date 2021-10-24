package tasks.classwork.day8;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

    public static void main(String[] args) {

        Map<Integer, String> words = new HashMap<>();
        String[] array = "мама мыла раму".split(" ");

        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]); // слова  добавить в карту по принципу <индекс, слово>
        }
        for (int in : words.keySet()) { // Проитерировать ключи катры
            System.out.println(in);
        }
        for (String x : words.values()) { // Проитерировать значения карты
            System.out.println(x);
        }
        for (Map.Entry y : words.entrySet()) { // Проитерировать комбинацию
            System.out.println(y);
        }
    }
}
