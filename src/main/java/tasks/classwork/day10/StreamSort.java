package tasks.classwork.day10;

import tasks.classwork.day9.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        list.stream().sorted().collect(Collectors.toList());
        list.stream().sorted((x, y) -> -x.compareTo(y)).distinct().collect(Collectors.toList());

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.WOMEN));

        people.stream().sorted((x, y) -> {
            if (x.getSex()!= y.getSex()){
                return x.getSex().compareTo(y.getSex());
            }
            else{
                return x.getAge() - y.getAge();
            }

        }).peek(p -> System.out.println());
    }
}
