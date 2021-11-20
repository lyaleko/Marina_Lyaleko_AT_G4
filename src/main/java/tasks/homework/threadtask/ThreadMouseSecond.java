package tasks.homework.threadtask;
//1.2 - создать 7 потоков, в каждом из которых:
//-- создать коллекцию из 18 мышей
//-- проитерировать коллекцию и пикнуть каждой четной мышью
//- запустить потоки

import java.util.ArrayList;
import java.util.List;

public class ThreadMouseSecond {

    public static void main(String[] args) {

        int numThreads = 7;
        for (int k = 0; k < numThreads; k++) {
            Thread thread = new Thread(() -> {
                List<Mouse> mouses = new ArrayList<>();
                for (int i = 1; i < 19; i++) {
                    Mouse mouse = new Mouse(i);
                    if (i%2==0) {
                        mouses.add(mouse);
                    }
                }
                mouses.forEach(x -> x.peep());
            });
            thread.start();
        }
    }
}