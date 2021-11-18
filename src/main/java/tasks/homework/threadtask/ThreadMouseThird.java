package tasks.homework.threadtask;
//1.3 - создать 6 потоков, в каждом из которых:
//-- создать коллекцию из 26 мышей
//-- проитерировать коллекцию и пикнуть каждой нечетной мышью
//- запустить потоки

import java.util.ArrayList;
import java.util.List;

public class ThreadMouseThird {

    public static void main(String[] args) {

        int numThreads = 6;
        for (int k = 0; k < numThreads; k++) {
            Thread thread = new Thread(() -> {
                List<Mouse> mouses = new ArrayList<>();
                for (int i = 1; i < 27; i++) {
                    Mouse mouse = new Mouse(i);
                    if (i%2==1) {
                        mouses.add(mouse);
                    }
                }
                mouses.forEach(x -> x.peep());
            });
            thread.start();
        }
    }
}