package tasks.homework.cycletask;
// запускаем в отдельном классе CycleTaskRunner, где создаем обьект соответствующего типа и вызываем нужный метод
public class CycleTaskRunner {

    public static void main(String[] args) {

        new RangeNumbersFor().methodRangeNumbersFor();
        new RangeNumbersWhile().methodRangeNumbersWhile();
        new RandomNumbersArray().FillRundomNumbers();

    }
}