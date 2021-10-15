package tasks.homework.arraytask;
/*- написать метод, который подсчитает сумму каждого n-ого
элемента в целочисленном массиве, где n - целое число,
передаваемое в сигнатуру этого метода*/
public class CountIntNumbers {

    public void countIntNumbersArray(int number){
        int[] array = {2, 3, 4};
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[number];
        }
    }
}
