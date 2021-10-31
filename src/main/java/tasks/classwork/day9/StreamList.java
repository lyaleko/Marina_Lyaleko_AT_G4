package tasks.classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamList {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        long y = list.stream().filter("мама"::equals).count();
        String str = list.stream().findFirst().orElse("мама");
        String str2 = list.stream().filter("мама"::equals).findFirst().get();
        String str3 = list.stream().skip(4).findFirst().get();

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(Arrays.toString(list.stream().skip(2).limit(2).toArray()));
        System.out.println(list.stream().filter(x -> x.contains("м")).distinct().collect(Collectors.toList()));
    }
}
