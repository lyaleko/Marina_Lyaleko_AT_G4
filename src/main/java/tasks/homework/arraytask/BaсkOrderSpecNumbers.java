package tasks.homework.arraytask;

import java.util.Arrays;

/*написать метод, который вернет целочисленный массив,
состоящий только из тех элементов исходного целочисленного массива,
которые больше, чем число n, где n - целое число, передаваемое в сигнатуру этого метода,
элементы в результирующем массиве должны быть расположены в обратном порядке*/
public class BaсkOrderSpecNumbers {

    public static int[] filterArray(int[] array, int n) {

        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num > n){
                int index = result.length;
                result = new int[index+1];
                result[index]= num;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5};
        int[] result = BaсkOrderSpecNumbers.filterArray(array, 3);
        System.out.println(Arrays.toString(result));
    }
}