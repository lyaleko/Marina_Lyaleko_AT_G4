package tasks.classwork.day8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyHashSet {

    public static void main(String[] args) {

        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        String text = "мама мыла раму";

        long t0 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList1.add(text);
        }
        System.out.println("HashSet: " + (System.currentTimeMillis() - t0));

        long t = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList2.add(text);
        }
        System.out.println("TreeSet: " + (System.currentTimeMillis() - t));

        long t3 = System.currentTimeMillis();
        for (String word : myList1) {
            myList1.add(word);
            System.out.println("HashSet: " + (System.currentTimeMillis() - t3));
        }
        long t4 = System.currentTimeMillis();
        for (String word : myList2) {
            myList2.add(word);
            System.out.println("TreeSet: " + (System.currentTimeMillis() - t4));
        }


    }
}
