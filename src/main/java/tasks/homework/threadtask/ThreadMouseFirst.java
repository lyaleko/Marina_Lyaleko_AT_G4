package tasks.homework.threadtask;
// 1.1 - создать 5 потоков, в каждом из которых:
//-- создать коллекцию из 20 мышей
//-- проитерировать коллекцию и пикнуть каждой мышью
//- запустить потоки одновременно

public class ThreadMouseFirst {

    public static void main(String[] args) {

        int numThreads = 5;
        for (int k = 0; k < numThreads; k++) {
            Thread thread = new Thread(() -> {
                for (int i = 1; i < 21; i++) {
                    Mouse mouse = new Mouse(i);
                    mouse.peep();
                }
            });
            thread.start();
        }
    }
}