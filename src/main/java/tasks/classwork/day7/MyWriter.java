package tasks.classwork.day7;

import java.io.*;

public class MyWriter {

    public static void main(String[] args) throws IOException {
        write();
    }

    public static void write() throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter("new2.txt"));
        out.write("NEW TEXT M \n mama \n papa");
        out.newLine();
        out.write("NEW TEXT M2  mama2  papa2");
        out.newLine();
        out.write("NEW TEXT M3  mama3  papa3");
        out.close();
    }

}
