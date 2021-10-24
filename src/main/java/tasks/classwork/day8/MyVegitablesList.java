package tasks.classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class MyVegitablesList {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Помидор");
        names.add("Огурец");
        names.add("Кобачок");
        names.add("Батат");
        names.add("Картоха");

        for (String col : names) {
            System.out.print(col + " ");
        }
        System.out.println();
// Посчитать сколько овощей содержат букву «а» и вывести число в консоль
        int count = 0;

        for (String vegitable : names) {
            if (vegitable.contains("а")) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < names.size(); i++) {

            System.out.print(names.get(i) + " ");
        }
        System.out.println();

        names.remove("Огурец");
        names.remove(3);

        for(String col: names){
            System.out.print(col + " ");
        }

    }
}
