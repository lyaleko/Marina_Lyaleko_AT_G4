package project.feature;

//import project.boxing.VesselBox;
import tasks.classwork.day7.Table;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Stocktaking {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

      //  oos.writeObject(new VesselBox<>());
        oos.close();
    }
}
