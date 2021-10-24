package tasks.classwork.day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyReader {

    public static void read() throws IOException{
        BufferedReader in = new BufferedReader(new FileReader("new.txt"));
        String line;
        while ((line = in.readLine()) != null){
            System.out.println(line);
        }
        in.close();
    }

    public static void main(String[] args) throws IOException {
        read();
    }
}
