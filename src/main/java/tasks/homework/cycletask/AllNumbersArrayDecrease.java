package tasks.homework.cycletask;
// отсортировать элементы массива в порядке убывания (любым способом) и вывести результат в консоль
public class AllNumbersArrayDecrease {

    public void allNumbersArrayDecrease() {
        int[] array = {2, 7, 6, 3, 0, 1};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] < array[k]) {
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
        System.out.print(temp);
    }

}