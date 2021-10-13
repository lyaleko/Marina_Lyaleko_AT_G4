package tasks.homework.basetask;

public class TrainMethodsReturn {
    // 15. создать метод returnNewInt, который принимает на вход целое число (int) и возвращает это число умноженное на 3

    public int returnNewInt(int num3) {
        return num3 * 3;
    }

    // 16. создать метод returnNewLong, который принимает на вход целое число (long) и возвращает это число минус 4
    public long returnNewLong(long longNum3) {
        return longNum3 - 4;
    }

    // 17. создать метод returnNewChar, который принимает на вход символ (char) и возвращает строку из двух таки символов
    public String returnNewChar(char charNum3) {
        String resultCharNum3 = "";
        for (int i = 0; i < 2; i++) {
            resultCharNum3 = resultCharNum3 + charNum3;
        }
        return resultCharNum3;
    }

    // 18.создать метод returnNewFloat, который принимает на вход дробное число (float) и возвращает это число деленное на 2
    public float returnNewFloat(float floatNum3) {
        return floatNum3 / 2;
    }

    // 19. создать метод returnNewDouble, который принимает на вход дробное число (double) и возвращает это число плюс 8
   public double returnNewDouble(double doubleNum3) {
        return doubleNum3 + 8;
   }

    // 20. создать метод returnNewShort, который принимает на вход целое число (short) и возвращает это число минус 1
    public short returnNewShort(short shortNum3) {
        final int i = 1;
        return (short) (shortNum3 - 1);
    }

    // 21. создать метод returnNewByte, который принимает на вход целое число (byte) и возвращает это число умноженное на 2
    public int returnNewByte(byte byteNum3) {
        return byteNum3 * 2;
    }

    // 22. создать метод returnNewBoolean, который принимает на вход булево значение (boolean) и возвращает обратное булево
    public boolean returnNewBoolean(boolean booleanValue){
        boolean t = true;
        boolean f = false;
            if (booleanValue == t) {
                return  f;
            } else {
                booleanValue = false;
                return t;
            }
    }
}