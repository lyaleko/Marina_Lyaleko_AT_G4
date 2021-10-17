package tasks.classwork.day6;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class GenericContainerRunner {


    public static void main(String[] args) {
        GenericContainer<Integer> full = new GenericContainer<>();

        Random random = new Random();

        while (!full.isFull()) {
            full.add(random.nextInt(10));

        }

        while (!full.isEmpty()) {
            System.out.println(full.removeLast());
        }
    }
}

