package tasks.classwork.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NewArrayList {

    public static void main(String[] args) {

        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        String text = "мама мыла раму";

        long t0 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {//Каждый лист заполнить 10000000 строками
            myList1.add(text);
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - t0));
// Проитерировать оба списка по индексу и найти, который из них быстрее
        long t = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList2.add(text);
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - t));
    }
}
