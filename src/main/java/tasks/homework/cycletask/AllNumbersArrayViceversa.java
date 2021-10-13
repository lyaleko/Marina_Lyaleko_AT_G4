package tasks.homework.cycletask;
// поменять местами первый и последний элементы и вывести результат в консоль

public class AllNumbersArrayViceversa{

    public void allNumbersArrayViceversa(){

        int[] randomArray = {2, 7, 6, 3, 0, 9};
        int temp;
        temp = randomArray[0];
        randomArray[0] = randomArray[randomArray.length-1];
        randomArray[randomArray.length-1] = temp;
        for (int j : randomArray) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}