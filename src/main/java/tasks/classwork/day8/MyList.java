package tasks.classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        String text = "мама мыла раму";
        String[] words = text.split(" ");

        for (String word : words) {
            myList.add(word);
        }
        for (String word : myList) {
            System.out.println(word);
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
