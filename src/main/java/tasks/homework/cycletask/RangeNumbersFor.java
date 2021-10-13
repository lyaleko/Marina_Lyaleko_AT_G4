package tasks.homework.cycletask;
// используя for вывести в консоль каждое нечетное число от 3 до 19 включительно

public class RangeNumbersFor {

    public void methodRangeNumbersFor(){
        for (int i = 3; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}


