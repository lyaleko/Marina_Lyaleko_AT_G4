package tasks.classwork.day11;

public class MainThread {

    public static void main(String[] args) {

        Object lock = new Object();

        new Thread(()-> {
            synchronized (lock) {
                for (int i = 0; i < 3; i++) {
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("t1-%s ", i);
                }
            }
        }).start();

        synchronized (lock){
        for (int i = 0; i < 3; i++) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("m-%s ", i);
        }
        }
    }
}
