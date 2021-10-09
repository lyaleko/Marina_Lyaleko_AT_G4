package basetask;

public class TrainMethodsIf {
    // 23. создать метод returnNewInt, который принимает на вход целое число (int) и если оно меньше 8,
    // то возвращает это число умноженное на 7, в противном случае деленное на 4
    public int returnNewInt(int newInt) {
        if (newInt < 8) {
            return newInt * 7;
        } else {
            return newInt / 4;
        }
    }

    // 24. создать метод returnNewLong, который принимает на вход целое число (long) и если оно больше 300,
    // то возвращает это число минус 300, в противном случае плюс 20
    public long returnNewLong(long newLong) {
        if (newLong > 300) {
            return newLong - 300;
        } else {
            return newLong + 20;
        }
    }

    // 25. создать метод returnNewChar, который принимает на вход символ (char) и если это 'g',
    // то возвращает строку "go", в противном случае строку из этого символа с префиксом "o"
    public String returnNewChar(char newChar) {
        if (newChar == 'g') {
            return ("go");
        } else {
            return "o" + newChar;
        }
    }

    // 26. создать метод returnNewFloat, который принимает на вход дробное число (float) и
    // если оно равно 0.67, то возвращает это число, в противном случае число умноженное на 2
    public float returnNewFloat(float newFloat) {
        if (newFloat == 0.67f) {
            return newFloat;
        } else {
            return newFloat * 2;
        }
    }

    // 27. создать метод returnNewDouble, который принимает на вход дробное число (double) и если оно больше 30,
    // но меньше 80, то  возвращает это число плюс 87, если оно больше 80, но меньше 400,
    // то возвращает это число минус 87, а если оно больше 400, то деленное на 4

    public double returnNewDouble(double newDouble) {
        if (newDouble > 30 && newDouble < 80) {
            return (newDouble + 87);
        }
        if (newDouble > 80 && newDouble < 400) {
            return (newDouble - 87);
        }
        if (newDouble > 400) {
            return newDouble / 4;
        }

        return newDouble;

    }

    // 28. создать невозвратный метод returnNewBoolean, который принимает на вход булево значение (boolean)
    // и если оно true то печатает в консоль "Я получил на вход значение истины", в противном случае печатает
    // в консоль "Я получил на вход ложь"
  public void returnNewBoolean(boolean valueBoolean) {
        if (valueBoolean == true) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }

    }

}





