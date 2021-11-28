package project.warehouse;

// Создать класс Stocktaking, который записывает информация о этих VesselBox обьектах в файл (отдельный файл для каждого ящика).
// Прочитать файл полученный в предыдущем пункте, получить обьекты VesselBox и вывести в консоль тип хранимых данных и их количество.
// ???? информация о каждом новом ящике записывается в виде новой строки в формате #hashCode#name
//---- private Stocktaking()
//????---- public static registerBox(VesselBox box) - записывает информацию в файл
//????---- public static disposeBox(VesselBox box) - убирает запись
//????---- private static final Path FILE - путь к файлу для записи
//????---- public static void getInfo() - печатает в консоль информацию о состоянии склада
//????-- информация о каждом новом ящике записывается в виде новой строки в формате #hashCode#name

import project.vessel.Vessel;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import static java.nio.file.StandardOpenOption.*;

public class Stocktaking {

    private static final Path FILE = Path.of("D:/testfiles/factory.txt"); //путь к файлу для записи

    Stocktaking(){
    }

    public static <T extends Vessel> void registerBox(VesselBox<T> vesselBox) { //записывает информация о этих VesselBox обьектах в файл (отдельный файл для каждого ящика).
        try {
            if (!Files.exists(FILE)){
                Files.createFile(FILE);
            }
            String str = "#" + vesselBox.hashCode() + "#" + vesselBox.getName(); //информация о каждом новом ящике записывается в виде новой строки в формате #hashCode#name
            List<String> lines = Files.readAllLines(FILE);
            lines.add(str);
            Files.write(FILE, lines, WRITE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T extends Vessel> void disposeBox(VesselBox<T> vesselBox) {// Прочитать файл полученный в предыдущем пункте,
        try {
            List<String> lines = Files.readAllLines(FILE);
            String str = "#"+vesselBox.hashCode()+"#"+vesselBox.getName();
            List<String> remaining = lines.stream().filter(x -> x.equals(str)).collect(Collectors.toList());
            Files.write(FILE, remaining);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void getInfo(){ //// получить обьекты VesselBox и вывести в консоль тип хранимых данных и их количество.
        //печатает в консоль информацию о состоянии склада
        try {
            List<String> lines = Files.readAllLines(FILE);
            System.out.println("getInfo: count = " + lines.size());
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}