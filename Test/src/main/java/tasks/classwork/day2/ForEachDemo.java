package demo2;
import java.util.Random;
public class ForEachDemo {

    public void foo() {

        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);

        }
        for (int i : array) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i: array) {
            sum += i;
        }
        System.out.println();
        System.out.println(sum / array.length);
    }

}
