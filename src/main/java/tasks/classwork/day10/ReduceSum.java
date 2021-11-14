package tasks.classwork.day10;

import tasks.classwork.day9.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceSum {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама мыла раму");

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.WOMEN));

        list.stream().flatMap(x-> Arrays.stream(x.split(""))).count();

        list.stream().map(String::length).mapToInt( p -> {
            if (p % 2 == 0) {
                return 0;
            }else {
                return p;
            }
        }).sum();

        list.stream().collect(Collectors.joining(":", "<p>", "</p>"));

        people.stream().collect(Collectors.toMap(x ->x.hashCode(), x -> x));
        people.stream().collect(Collectors.groupingBy(p ->p.getSex())).keySet().forEach(System.out::println);
        
    }
}
