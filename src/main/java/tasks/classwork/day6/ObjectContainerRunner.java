package tasks.classwork.day6;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class ObjectContainerRunner {



    public static void main(String[] args) {
        ObjectContainer full = new ObjectContainer();

        Random random = new Random();


        while (!full.isFull()) {
            full.add(random.nextInt(10));
            full.add("text");
        }


        while (!full.isEmpty()) {
            System.out.println(full.removeLast());
        }
    }
}

