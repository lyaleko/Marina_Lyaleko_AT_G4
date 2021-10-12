package tasks.classwork.day2;

public class ForDemo {

    public void foot() {
        int i ;
        for (i = 23; i < 28; i++) {

            if (i % 13 == 0) {
                System.out.println("continue!");
                break;
                //return;
                //continue;
            }
            System.out.println("i is : " + i);
        }
        System.out.println("number is : " + i);
    }

}