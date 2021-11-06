package tasks.homework.streamtask;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*- для всех четных значений длин от 1 до 20 дюймов вывести в консоль значения в дюймах,
        певерести значения в сантиметры и найти сумму*/

public class MyStreamClass {

    public static void main(String[] args) {

        List<Integer> numbers = Stream.iterate(1, n -> n + 1)
                .limit(20)
                .filter(number -> number % 2 == 0)
                .filter(number -> (number > 1 && number < 20))
                .collect(Collectors.toList());

        double sumLenghtCm = numbers.stream().mapToDouble(x -> x * 2.54).sum();

// сгенерировать List коллекцию целых чисел из n элементов от minValue до maxValue и определить,
// содержаться ли в данной коллекции числа, которые делятся и на 3 и на 5 с помощь stream

        Scanner sc = new Scanner(System.in);

        System.out.println("Input min number");
        int minNumber = sc.nextInt();
        System.out.println("Input max number");
        int maxNumber = sc.nextInt();

        boolean numMatch = IntStream.range(minNumber,maxNumber)
                .anyMatch(n -> (n % 3 == 0 && n % 5 ==0));
        System.out.println(numMatch);

    }
}