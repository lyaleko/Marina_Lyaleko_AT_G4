package basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {

        TrainMethodsIf methodsIf = new TrainMethodsIf();
// 23. создать метод returnNewInt, который принимает на вход целое число (int) и если оно меньше 8,
// то возвращает это число умноженное на 7, в противном случае деленное на 4
        System.out.println("метод returnNewInt вернул " + methodsIf.returnNewInt(3));
        System.out.println("метод returnNewInt вернул " + methodsIf.returnNewInt(400));
// 24. создать метод returnNewLong, который принимает на вход целое число (long) и если оно больше 300,
// то возвращает это число минус 300, в противном случае плюс 20
        System.out.println("метод returnNewLong вернул " + methodsIf.returnNewLong(202));
        System.out.println("метод returnNewLong вернул " + methodsIf.returnNewLong(1000));
// 25. создать метод returnNewChar, который принимает на вход символ (char) и если это 'g',
// то возвращает строку "go", в противном случае строку из этого символа с префиксом "o"
        System.out.println("метод returnNewChar вернул " + methodsIf.returnNewChar('g'));
        System.out.println("метод returnNewChar вернул " + methodsIf.returnNewChar('m'));
// 26. создать метод returnNewFloat, который принимает на вход дробное число (float) и
// если оно равно 0.67, то возвращает это число, в противном случае число умноженное на 2
        System.out.println("метод returnNewFloat вернул " + methodsIf.returnNewFloat((float) 0.67));
        System.out.println("метод returnNewFloat вернул " + methodsIf.returnNewFloat((float) 3.33));
// 27. создать метод returnNewDouble, который принимает на вход дробное число (double) и если оно больше 30,
// но меньше 80, то  возвращает это число плюс 87, если оно больше 80, но меньше 400,
// то возвращает это число минус 87, а если оно больше 400, то деленное на 4
        System.out.println("метод returnNewDouble вернул " + methodsIf.returnNewDouble(40));
        System.out.println("метод returnNewDouble вернул " + methodsIf.returnNewDouble(399));
        System.out.println("метод returnNewDouble вернул " + methodsIf.returnNewDouble(800));
// 28. создать невозвратный метод returnNewBoolean, который принимает на вход булево значение (boolean)
// и если оно true то печатает в консоль "Я получил на вход значение истины", в противном случае печатает
// в консоль "Я получил на вход ложь"
        methodsIf.returnNewBoolean(true);
        methodsIf.returnNewBoolean(false);
    }
}
