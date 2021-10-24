package tasks.classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class MyNamesList {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");

        for(String col: names){
            System.out.print(col + " ");
        }
        System.out.println();

        names.set(2, "Оля"); // заменить элемент
        names.set(4, "Катя");

        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        names.remove("Оля");
        names.remove(3);

        System.out.println();

        for(String col: names){
            System.out.print(col + " ");
        }

    }
}
