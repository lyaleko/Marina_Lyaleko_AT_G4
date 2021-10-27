package tasks.homework.arraylist;

import java.util.ArrayList;
import java.util.List;

/*Создать пустой список стрингов cities
        Добавить в список 3 города (Минск, Москва, Берлин)
        Проитерировать список через for-each и отпечатать слова в консоль с новой строки
        Посчитать сумму всех буков во всех словах и вывести число в консоль
        Проитерировать список по индексу и отпечатать слова в консоль через пробел*/
public class Cities {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        int count = 0;

        for (String city : cities) {
            System.out.print(city + "\n");
            count += city.length();
        }
        System.out.println(count);

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }

}
