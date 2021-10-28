package tasks.homework.arraylist;
/*Создать список стульев (класса Chair) furniture из 3 стульев высотой (1, 4, 2) и шириной (2, 2, 4) соответственно, через (Arrays.asList())
    Проитерировать список через for-each и отпечатать произведение высоты на ширину в консоль через пробел
    Создать пустую карту, где ключем является целое число, а значением обьект стула
    Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
    Проитерировать карту и отпечатать ключи в консоль
    Проитерировать карту и отпечатать значения в консоль
    Проитерировать карту и отпечатать пары ключ-значение в консоль*/

import project.mix.Chair;

import java.util.*;

public class ChairList {

    public static void main(String[] args) {

        List<Chair> furniture = new ArrayList<>(Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4)));

        for (Chair chair : furniture) {
            System.out.print(chair.getHeight() * chair.getWidth() + " ");
        }

        System.out.println();

        Map<Integer, Chair> furnitureMap = new HashMap<>();

        for (int i = 0; i < furniture.size(); i++) {
            furnitureMap.put(i, furniture.get(i));
        }

        for (int key : furnitureMap.keySet()) {
            System.out.print(key + " ");
        }

        System.out.println();

        for (Chair chair : furnitureMap.values()) {
            System.out.print(chair + " ");
        }

        System.out.println();

        for (Map.Entry couples : furnitureMap.entrySet()) {
            System.out.println(couples);
        }
    }
}