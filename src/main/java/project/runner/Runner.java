package project.runner;
import project.boxing.Bottle;

public class Runner {

    public static void main(String[] args) {

        Bottle firstBottle = new Bottle(0.5);
        Bottle secondBottle= new Bottle(1);
        Bottle thirdBottle = new Bottle(1.5);

        firstBottle.open();
        secondBottle.open();
        thirdBottle.open();

    }
}
