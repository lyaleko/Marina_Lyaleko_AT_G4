package tasks.homework.arraylist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Arrays.asList())
        Проитерировать список через for-each и отпечатать слова в в файл figures через тире
        Посчитать сколько фигур НЕ содержат букву "и" и вывести число в консоль
        Проитерировать список по индексу и отпечатать слова в консоль через пробел
        Вставить на 3 позицию Треугольник
        Проитерировать список через for-each и отпечатать слова в консоль через пробел*/
public class Figures {

    public static void main(String[] args) throws IOException {

        List<String> myList = new ArrayList<>(Arrays.asList());

        myList.add("Овал");
        myList.add("Прямоугольник");
        myList.add("Круг");
        myList.add("Квадрат");
        myList.add("Эллипс");

        BufferedWriter out = new BufferedWriter((new FileWriter("figures.txt")));

        for (String f : myList) {
            if (f.matches(myList.get(myList.size() - 1)))
                out.write(f);
            else {
                out.write(f + "-");
            }

        }
        out.close();

        int count = 0;

        for (String words : myList) {
            if (!words.contains("и")) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < myList.size(); ++i) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        myList.set(3, "Треугольник");

        for (String str : myList) {
            System.out.print(str + " ");
        }

    }

}
