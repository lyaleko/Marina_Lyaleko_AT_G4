package tasks.homework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {

    public static void main(String[] args) {
        List<String> myList = new ArrayList();
        myList.add("Common blue");
        myList.add("Swallowtailai");
        myList.add("Aglais io");
        myList.add("Common blue");

        for (String bab : myList) {
            System.out.print("\"" + bab + "\"" + " ");
        }
        System.out.println();

        int count = 0;

        for (String words : myList) {
            if (words.contains("o")) {
                count++;
            }
        }

        System.out.println(count);

        for (int i = 0; i < myList.size(); ++i) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        for (String str : myList) {
            System.out.print(str + "\n");
        }

    }
}
