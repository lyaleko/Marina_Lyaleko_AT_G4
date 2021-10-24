package tasks.classwork.day8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySetClass {

    public static void main(String[] args) {

        Set<String> mySetList = new HashSet<>();
        String text = "мама мыла раму";
        String[] words = text.split(" ");

        for (String word : words) {
            mySetList.add(word);
        }
        Iterator<String> iterator = mySetList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String x: mySetList) {
            System.out.println(x);
        }
    }
}
