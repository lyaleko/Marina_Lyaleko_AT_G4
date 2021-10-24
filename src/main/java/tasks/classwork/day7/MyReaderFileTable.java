package tasks.classwork.day7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class MyReaderFileTable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Table table = (Table)ois.readObject();
        ois.close();
        System.out.println(table.toString());
    }

}
