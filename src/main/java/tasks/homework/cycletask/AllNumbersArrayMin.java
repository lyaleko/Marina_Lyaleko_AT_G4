package tasks.homework.cycletask;

import java.util.Arrays;
// найти минимальный элемент массива и вывести результат в консоль
public class AllNumbersArrayMin{

    public void allNumbersArrayMin() {
        int[] array = {5, 6, 7, 8, 4, 9};
        Arrays.sort(array);
        int min = array[0];
        System.out.println(min);
    }

}
