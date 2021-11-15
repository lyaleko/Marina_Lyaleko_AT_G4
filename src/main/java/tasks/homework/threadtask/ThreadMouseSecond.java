package tasks.homework.threadtask;
//1.2 - создать 7 потоков, в каждом из которых:
//-- создать коллекцию из 18 мышей
//-- проитерировать коллекцию и пикнуть каждой четной мышью
//- запустить потоки

public class ThreadMouseSecond {

    public static void main(String[] args) {

        int numThreads = 7;
        for (int k = 0; k < numThreads; k++) {
            Thread thread = new Thread(() -> {
                for (int i = 1; i < 19; i++) {
                    Mouse mouse = new Mouse(i);
                    if (i%2==0) {
                        mouse.peep();
                    }
                }
            });
            thread.start();
        }
    }
}