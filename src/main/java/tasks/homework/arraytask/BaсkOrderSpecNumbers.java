package tasks.homework.arraytask;
/*написать метод, который вернет целочисленный массив,
состоящий только из тех элементов исходного целочисленного массива,
которые больше, чем число n, где n*/
public class BaсkOrderSpecNumbers {

    public static void sumInArray(int number) {
        int temp = 0;

        int[] array = {2, 3, 4, 5};
        int filterNumber = 0;

        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] < array[k]) {
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                    if (array[i] > number) {
                        filterNumber++;
                    }
                }
            }
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        BaсkOrderSpecNumbers.sumInArray(2);
    }
}