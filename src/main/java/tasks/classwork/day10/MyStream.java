package tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        list.stream().anyMatch("мама"::equals);
        list.stream().allMatch("м"::contains);
        list.stream().map(x -> x + "м").collect(Collectors.toList());
        list.stream().flatMap(x-> Arrays.stream(x.split("а"))).filter(x -> !x.equals(""));



    }
}
