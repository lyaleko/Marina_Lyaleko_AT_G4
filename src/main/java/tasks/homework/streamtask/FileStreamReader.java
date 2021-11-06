package tasks.homework.streamtask;

/*построчно прочитать файл и создать стрим из его строк, пропустив первые 4 строки собрать коллекцию
        в одну строку, разделить на по <br>, оставить только те, что начинаются с "Date log:",
        в каждой строке оставить только первые 20 символов, к каждой в конец дописать значение текущей даты*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileStreamReader {

    public static void main(String[] args) throws IOException {

        List<String> lines = new ArrayList<>();
        Path path = Paths.get("new.txt");

        var line = Files.lines(path)
                .skip(4)
                .filter(s -> s.startsWith("Date log:"))
                .map(line2 -> line2.substring(0, Math.min(line2.length(), 19)))
                .map(line2 -> line2 + " " + LocalDateTime.now())
                .collect(Collectors.joining("<br>"));

        System.out.println(line);
    }
}