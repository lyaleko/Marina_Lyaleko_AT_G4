package tasks.homework.basetask;

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] args) {

// 14. создать в раннере TrainMethodsPrimitiveRunner обьект класса TrainMethodsPrimitive и вызвать всего его методы
        TrainMethodsPrimitive digtP = new TrainMethodsPrimitive();

        digtP.printInt(123);
        digtP.printLong(112233);
        digtP.printChar('&');
        digtP.printFloat((float) 19.9);
        digtP.printDouble(19.87654321);
        digtP.printShort((short) 12);
        digtP.printByte((byte) -123);
        digtP.printBoolean(Boolean.TRUE);

    }

}
