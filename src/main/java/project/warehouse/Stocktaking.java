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
import java.nio.file.Path;

public class Stocktaking {

    Stocktaking(){

    }
    public <T extends Vessel> void save(VesselBox<T> vesselBox, String filename) throws IOException {

        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(vesselBox);

        oos.close();
    }
    public <T extends Vessel> VesselBox<T> load(Class<VesselBox> type, String filename) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(new File(filename));
        ObjectInputStream oi = new ObjectInputStream(fi);

        // Read objects
        VesselBox<T>  pr1 = (VesselBox<T>) oi.readObject();

        oi.close();
        fi.close();
        return  pr1;
    }
    public static void disposeBox(VesselBox box){ // убирает запись
        // required void method

    }

    private static final Path FILE = Path.of("/t.tmp"); //путь к файлу для записи

    public static void getInfo(){ //печатает в консоль информацию о состоянии склада

    }

}