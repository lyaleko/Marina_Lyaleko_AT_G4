package tasks.homework.streamtask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*- для всех четных значений длин от 1 до 20 дюймов вывести в консоль значения в дюймах,
        певерести значения в сантиметры и найти сумму*/

public class MyStreamClass {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4 , 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21);
        List<Integer> numberStream = numbers.stream()
                .filter(number -> number % 2 == 0)
                .filter(number -> (number > 1 && number < 20))
                .peek(p -> System.out.print(p + " "))
/*                .map(n -> n * 2.54)  // TODO *певерести значения в сантиметры и найти сумму*
                .sum()*/
                .collect(Collectors.toList());



// сгенерировать List коллекцию целых чисел из n элементов от minValue до maxValue и определить,
// содержаться ли в данной коллекции числа, которые делятся и на 3 и на 5 с помощь stream

        List<Integer> values = Arrays.asList(5, 6, 10, 1);
        IntStream.range(values.stream().min(Integer::compare).get(), values.stream().max(Integer::compare).get())
                .filter(n -> (n % 3 == 0 && n % 5 ==0))
                .mapToObj(values::get)
                .peek(p -> System.out.print(p + " "))
                .collect(Collectors.toList());


    }
}