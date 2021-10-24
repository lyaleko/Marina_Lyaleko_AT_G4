package tasks.classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>(); //Создать пустой ArrayList

        String text = "мама мыла раму";
        String[] words = text.split(" "); // поделить строку

        for (String word : words) { // for-each
            myList.add(word); // добавить в список
        }
        for (String word : myList) { //Проитерировать список с for-each и отпечатать слова в консоль
            System.out.println(word);
        }
        for (int i = 0; i < myList.size(); i++) { // //Проитерировать список по индексу и отпечатать слова в консоль
            System.out.println(myList.get(i));
        }
    }
}
