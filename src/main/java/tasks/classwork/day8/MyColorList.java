package tasks.classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class MyColorList {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("Red"); //Добавить в список 5 цветов (Red, Green, Orange, White, Black)
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        // Проитерировать список через for-each и отпечатать слова в консоль через пробел
        for(String col: colors){
            System.out.print(col + " ");
        }
        System.out.println();
        // Вставить новые цвета (Pink, Yellow) на 2 и 4-ю позиции
        colors.add(2, "Pink");
        colors.add(4, "Yellow");

        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " ");
        }
        System.out.println();
        // Отпечатать слова в 1 и 5-й позиции в консоль в строку
        System.out.println(colors.get(1));
        System.out.println(colors.get(5));
    }

}
