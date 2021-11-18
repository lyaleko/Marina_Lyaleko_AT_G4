package tasks.homework.threadtask;

import java.util.ArrayList;
import java.util.List;

//1.7
//- в главном потоке создать коллекцию из 240 мышей
//- создать 5 дочерних потоков
//- 3 из которых каджые 250мс удалять 1 пикающую нечетную мышь
//- 2 из которых каджые 220мс заменяют 1 пикающую четную мышь на ежа, который сообщает о себе
//- запустить потоки
public class ThreadMouseSeventh {

    private static final Object lock = new Object();

    public static void main(String[] args){
        CreateAndRunMainThread();
    }

    public static void CreateAndRunMainThread(){ //- запустить потоки
        Thread main = new Thread(ThreadMouseSeventh::MainJob);
        main.start();
    }

    public static void MainJob(){ //- в главном потоке создать коллекцию из 240 мышей
        List<Object> mouses = new ArrayList<>();
        for (int i = 1; i <= 240; i++) {
            mouses.add(new Mouse(i));
        }

        List<Thread> threads = new ArrayList<>(); //- создать 5 дочерних потоков
        for (int i = 0; i < 5; i++) {
            if (i<3){
                threads.add(new Thread(() -> RemoveFirstMouse(mouses))); //- 3 из которых каджые 250мс удалять 1 пикающую нечетную мышь
            }else {
                threads.add(new Thread(() -> ReplaceWithHedgehog(mouses))); //- 2 из которых каджые 220мс заменяют 1 пикающую четную мышь на ежа, который сообщает о себе
            }
        }

        threads.forEach(Thread::start);
    }

    public static void RemoveFirstMouse(List<Object> objects){ //- 3 из которых каджые 250мс удалять 1 пикающую нечетную мышь
        while (objects.size() > 0){
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized(lock) {
                Object mouse = objects.stream().filter(x -> x instanceof Mouse).findFirst().orElse(null);
                if (mouse != null){
                    objects.remove(mouse);
                }
            }
        }

    }

    public static void ReplaceWithHedgehog(List<Object> objects){ //- 2 из которых каджые 220мс заменяют 1 пикающую четную мышь на ежа, который сообщает о себе
        while (objects.size() > 0){
            try {
                Thread.sleep(220);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(lock){
                Object mouse = objects.stream().filter(x -> x instanceof Mouse).skip(1).findFirst().orElse(null);
                if (mouse != null){
                    int index = objects.indexOf(mouse);
                    Hedgehog hedgehog = new Hedgehog(index);
                    objects.set(index, hedgehog);
                    hedgehog.tellMe();
                }
            }
        }
    }
}