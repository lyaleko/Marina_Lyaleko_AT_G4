package tasks.classwork.day10;

import tasks.classwork.day9.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMin {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.WOMEN));

        List<String> list = Arrays.asList("мама мыла раму");

        list.stream().flatMap(x-> Arrays.stream(x.split(""))).peek(System.out::println).max(String::compareTo).get();
        people.stream().min(Comparator.comparingInt(Person::getAge)).get();
    }
}
