package tasks.homework.threadtask;

import java.util.ArrayList;
import java.util.List;

//1.6
//- в главном потоке создать коллекцию из 420 мышей
//- создать 6 дочерних потоков, в каждом из которых:
//- каджые 170мс удалять 1 пикающую четную мышь
//- запустить потоки
public class ThreadMouseSixth {
    private static final Object lock = new Object();

    public static void main(String[] args){  //запустить потоки
        Thread main = new Thread(ThreadMouseForth::СhildThreads); // Thread main = new Thread(() -> СhildThreads());
        main.start();
    }

    public static void СhildThreads(){ // создать коллекцию из 460 мышей
        List<Mouse> mouses = new ArrayList<>();
        for (int i = 1; i <= 460; i++) {
            mouses.add(new Mouse(i));

        }

        List<Thread> threads = new ArrayList<>(); // создать 6 дочерних потоков
        for (int i = 0; i < 6; i++) {
            threads.add(new Thread(() -> RemoveMouse(mouses)));
        }

        threads.forEach(Thread::start); // threads.forEach(thread -> thread.start());
    }

    public static void RemoveMouse(List<Mouse> mouses) { // каджые 170мс удалять 1 пикающую мышь
        while (mouses.size() > 0) {
            try {
                Thread.sleep(170);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock) {
                Mouse mouse = mouses.stream().findFirst().orElse(null);
                if (mouse != null) {
                    mouses.remove(mouse);
                }
            }
        }
    }
}