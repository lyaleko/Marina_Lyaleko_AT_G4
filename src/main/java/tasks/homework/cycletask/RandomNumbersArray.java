package tasks.homework.cycletask;
import java.util.Random;
// создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами

public class RandomNumbersArray{

    public int[] FillRundomNumbers(){
        int[] array = new int[7];
        Random random = new Random();
        for (int i = 0; i< array.length; i++){
            array[i] = random.nextInt(10);
        }
        return array;
    }

}
