package tasks.homework.streamtask;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PersonRunner {

    public static void main(String[] args) {

        List<String> people =
                IntStream.rangeClosed(1, 100).boxed()
                .map(i -> new Person("Name" + i, "Surname" + i, ThreadLocalRandom.current()
                .nextInt(15,30) ))
                .filter(p -> p.getAge() < 21)
                .peek(person -> System.out.println(person.getName() + " " + person.getAge()))
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(people);
    }
}