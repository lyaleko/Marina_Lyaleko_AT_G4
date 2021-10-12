package tasks.homework;

public class TrainMethodsIfRunner {

    public static void main(String[] args) {

        TrainMethodsIf methodsIf = new TrainMethodsIf();

        System.out.println("метод returnNewInt вернул " + methodsIf.returnNewInt(3));
        System.out.println("метод returnNewInt вернул " + methodsIf.returnNewInt(400));
        System.out.println("метод returnNewLong вернул " + methodsIf.returnNewLong(202));
        System.out.println("метод returnNewLong вернул " + methodsIf.returnNewLong(1000));
        System.out.println("метод returnNewChar вернул " + methodsIf.returnNewChar('g'));
        System.out.println("метод returnNewChar вернул " + methodsIf.returnNewChar('m'));
        System.out.println("метод returnNewFloat вернул " + methodsIf.returnNewFloat((float) 0.67));
        System.out.println("метод returnNewFloat вернул " + methodsIf.returnNewFloat((float) 3.33));
        System.out.println("метод returnNewDouble вернул " + methodsIf.returnNewDouble(40));
        System.out.println("метод returnNewDouble вернул " + methodsIf.returnNewDouble(399));
        System.out.println("метод returnNewDouble вернул " + methodsIf.returnNewDouble(800));
        methodsIf.returnNewBoolean(true);
        methodsIf.returnNewBoolean(false);
    }

}
