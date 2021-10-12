package tasks.classwork.day2;

public class WhileDemo {

    public void foo() {
        int i = 23;
        while (i < 28) {
            if (i % 13 == 0) {
                System.out.println("continue!");
                break;
                //return;
                //continue;
            }
            System.out.println("i is : " + i++);
        }
        System.out.println("number is : " + i);
    }

}
