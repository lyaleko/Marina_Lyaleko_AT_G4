package project.runner;
// **- создать класс Runner, содержащий main
//- в нем создать 3 бутылки, объёмом 0.5, 1, 1.5 лира с газировкой
//- открыть поочередно все бутылки и выпустить из них газ

// - class Runner - to run everything
import project.vessel.Bottle;

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
