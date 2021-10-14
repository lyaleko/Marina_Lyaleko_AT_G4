package tasks.homework.arraytask;
/*написать метод, который вернет целочисленный массив,
состоящий только из тех элементов исходного целочисленного массива,
которые больше, чем число n, где n*/
public class BaсkOrderSpecNumbers {

    public  int[]  sumInArray(int number) {

        int[] array = {2, 3, 4, 5};
        int filter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number)
                filter++;
        }

        for (int j : array) {

            System.out.print(j + " ");
        }
        System.out.println();


    }

}
