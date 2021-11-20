package project.warehouse;
//информация о каждом новом ящике записывается в виде новой строки в формате #hashCode#name
//- class Stocktaking
//---- private Stocktaking()
//---- public static registerBox(VesselBox box) - записывает информацию в файл
//---- public static disposeBox(VesselBox box) - убирает запись
//---- private static final Path FILE - путь к файлу для записи
//---- public static void getInfo() - печатает в консоль информацию о состоянии склада
//-- информация о каждом новом ящике записывается в виде новой строки в формате #hashCode#name

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;

public class Stocktaking {

    private Stocktaking(){

    }
    public static void registerBox(VesselBox box) throws IOException { //  записывает информацию в файл
        FileOutputStream fos = new FileOutputStream("t.tmp"); // required void method
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //  oos.writeObject(new VesselBox<>());
        oos.close();
    }

    public static void disposeBox(VesselBox box){ // убирает запись
        // required void method

    }

    private static final Path FILE = Path.of("/t.tmp"); //путь к файлу для записи

    public static void getInfo(){ //печатает в консоль информацию о состоянии склада

    }

}
