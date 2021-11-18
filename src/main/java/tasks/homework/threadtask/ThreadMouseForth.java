package tasks.homework.threadtask;

import java.util.ArrayList;
import java.util.List;

//1.4- в главном потоке создать коллекцию из 280 мышей
//- создать 5 дочерних потоков, в каждом из которых:
//- каджые 300мс удалять 1 пикающую мышь
//- запустить потоки
public class ThreadMouseForth {
    private static final Object lock = new Object();

    public static void main(String[] args){  //запустить потоки
        Thread main = new Thread(ThreadMouseForth::СhildThreads); // Thread main = new Thread(() -> СhildThreads());
        main.start();
        System.out.println();
    }

    public static void СhildThreads(){ // создать коллекцию из 280 мышей
        List<Mouse> mouses = new ArrayList<>();
        for (int i = 1; i <= 280; i++) {
            mouses.add(new Mouse(i));

        }

        List<Thread> threads = new ArrayList<>(); // создать 5 дочерних потоков
        for (int i = 0; i < 5; i++) {
                threads.add(new Thread(() -> RemoveMouse(mouses)));
        }

        threads.forEach(Thread::start); // threads.forEach(thread -> thread.start());
    }

    public static void RemoveMouse(List<Mouse> mouses){ // каджые 300мс удалять 1 пикающую мышь
        while (mouses.size() > 0){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized(lock) {
                Mouse mouse = mouses.stream().findFirst().orElse(null);
                if (mouse != null){
                    mouses.remove(mouse);
                }
            }
        }
    }
}