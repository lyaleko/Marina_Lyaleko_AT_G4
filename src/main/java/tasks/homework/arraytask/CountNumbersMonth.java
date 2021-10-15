package tasks.homework.arraytask;
import java.time.LocalDate;
/*написать метод, который вернет сумму тех элементов целочисленного
массива, которые кратны числу текущего месяца*/
public class CountNumbersMonth {

    public int returnNumbersMonth(){

        int[] arrayDates = new int[31];
        int sum = 0;

        LocalDate localDate = LocalDate.now();

        for (int i = 0; i < arrayDates.length; i++) {
            if (arrayDates[i] % localDate.getMonthValue() == 0) {
                sum = sum + arrayDates[i];
            }
        }
        return sum;
    }

}
