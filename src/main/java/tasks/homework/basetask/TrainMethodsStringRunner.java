package tasks.homework.basetask;

public class TrainMethodsStringRunner {

    public static void main(String[] args) {

// 5. создать в раннере TrainMethodsStringRunner обьект класса TrainMethodsString и вызвать всего его методы
        TrainMethodsString text = new TrainMethodsString();

        text.printMama();
        text.printPapa();
        text.printString("просто строка");
        text.printMamaString("кошку");
    }
}