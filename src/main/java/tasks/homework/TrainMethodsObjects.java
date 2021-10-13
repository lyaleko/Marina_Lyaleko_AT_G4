package tasks.homework;

public class TrainMethodsObjects {

    public void  processMouse(Mouse mouse) {
        System.out.println(mouse.getName() + mouse.getAge());
        mouse.printMouseDetails();

    }

    public void processSouce(Souce souce) {
        System.out.println(souce.getName() + souce.getColor());
        souce.printSouceDetails();

    }

    public void processBee(Bee bee) {
        System.out.println(bee.getWeight() + bee.getGender());
        bee.printBeeDetails();

    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println(obstacle.getSeverity() + obstacle.getDescription());
        obstacle.printObstacleDetails();

    }

    public void processPineapple(Pineapple pineapple) {
        System.out.println(pineapple.getGrade() + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();

    }
}

