package project.feature;
import project.boxing.Vessel;
import project.boxing.VesselBox;
import java.io.*;

// Создать класс Stocktaking, который записывает информация о этих VesselBox обьектах в файл (отдельный файл для каждого ящика).
// Прочитать файл полученный в предыдущем пункте, получить обьекты VesselBox и вывести в консоль тип хранимых данных и их количество.

public class Stocktaking {

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
}