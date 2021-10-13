package tasks.homework.cycletask;
// вывести в консоль все элементы массива в обратном порядке
public class AllNumbersArrayOrder{

    public void backOrderNumbers(){
        int[] array = {3, 5, 9, 8, 7, 6,4};
        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}


