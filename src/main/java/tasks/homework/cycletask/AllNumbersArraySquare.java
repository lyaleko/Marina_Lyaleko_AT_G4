package tasks.homework.cycletask;
// каждый элемент массива возвести в квадрат и вывести результат в консоль
import java.lang.Math;

public class AllNumbersArraySquare{

    public void allNumbersArraySquare(){
        int[] array = {2, 7, 6, 3, 0, 9};
        for(int i = 0; i < array.length; i++){
            System.out.print((int)Math.pow((array[i]),2)  + " " );
        }
    }

}
