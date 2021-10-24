package tasks.classwork.day7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyFileRunner {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(new Table(5,"black"));
        oos.close();
    }
}
