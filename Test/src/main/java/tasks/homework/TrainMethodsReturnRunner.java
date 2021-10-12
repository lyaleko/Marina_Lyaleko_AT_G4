package tasks.homework;

public class TrainMethodsReturnRunner {

        public static void main(String[] args) {

            TrainMethodsReturn returnValue = new TrainMethodsReturn();

// 15. создать метод returnNewInt, который принимает на вход целое число (int) и возвращает это число умноженное на 3
            System.out.println("метод returnNewInt вернул " + returnValue.returnNewInt(3));
// 16. создать метод returnNewLong, который принимает на вход целое число (long) и возвращает это число минус 4
            System.out.println("метод returnNewLong вернул " + returnValue.returnNewLong(123456789));
// 17. создать метод returnNewChar, который принимает на вход символ (char) и возвращает строку из двух таки символов
            System.out.println("метод returnNewChar вернул " + returnValue.returnNewChar('%'));
// 18.создать метод returnNewFloat, который принимает на вход дробное число (float) и возвращает это число деленное на 2
            System.out.println("метод returnNewFloat вернул " + returnValue.returnNewFloat(10.66f));
// 19. создать метод returnNewDouble, который принимает на вход дробное число (double) и возвращает это число плюс 8
            System.out.println("метод returnNewDouble вернул " + returnValue.returnNewDouble(10.88));
// 20. создать метод returnNewShort, который принимает на вход целое число (short) и возвращает это число минус 1
            System.out.println("метод returnNewShort вернул " + returnValue.returnNewShort((short) 2000));
// 21. создать метод returnNewByte, который принимает на вход целое число (byte) и возвращает это число умноженное на 2
            System.out.println("метод returnNewShort вернул " + returnValue.returnNewByte((byte) 122));
// 22. создать метод returnNewBoolean, который принимает на вход булево значение (boolean) и возвращает обратное булево
            System.out.println("метод returnNewBoolean вернул " + returnValue.returnNewBoolean(true));

        }

}
