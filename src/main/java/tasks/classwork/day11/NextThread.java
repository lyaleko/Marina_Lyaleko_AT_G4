package tasks.classwork.day11;

public class NextThread {

    public static synchronized void syncMethod(String threadName){

        for (int i = 0; i < 3; i++) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.printf("%s-%s ", threadName, i);
        }
    }

    public static void main(String[] args) {

        new Thread(() -> {
            syncMethod("t1");
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        syncMethod("m");
    }
}
