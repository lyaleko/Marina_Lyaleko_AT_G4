package tasks.homework.cycletask;
// каждый элемент массива умножить на 5 и вывести результат в консоль
public class AllNumbersArrayMultiply{

    public void allNumbersArrayMultiply(){
        int[] array = {2, 3, 4, 5, 6, 7};
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i]* 5 + " ");
        }
        System.out.println();
    }

}
