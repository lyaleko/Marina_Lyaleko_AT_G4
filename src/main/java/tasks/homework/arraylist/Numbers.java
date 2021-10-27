package tasks.homework.arraylist;

import java.util.Arrays;
import java.util.Collection;
import java.util.*;

/*Создать список целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Arrays.asList())
    Проитерировать список через for-each и отпечатать числа в консоль новой строки
    Посчитать сумму всех чисел и вывести результат в консоль
    Отсортировать список по возрастанию
    Проитерировать список по индексу и отпечатать числа в консоль через пробел
    Развернуть список в обратном порядке
    Проитерировать список через for-each и отпечатать числа в консоль через пробел*/

public class Numbers {

    public static void main(String[] args) {

        var numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        int sum = 0;
        for (int number : numbers) {
            sum += number;
            System.out.println(number);
        }

        System.out.println("Sum = " + sum);

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println();

        for (int number: numbers){
            System.out.print(number + " ");
        }
    }
}