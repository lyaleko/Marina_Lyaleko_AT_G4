package tasks.homework.cycletask;

import java.util.Random;
//  пройти по массиву и вывести в консоль все элементы
public class AllNumbersArray{

    public void allnumbers(){
        int[] array = {1, 2, 3, 1, 2, 3};
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}


