package tasks.homework;

public class TrainMethodsObjects {

    public void  processMouse(Mouse m) {
        System.out.println(m.getName() + m.getAge());
        m.printMouseDetails();

    }

    public void processSouce(Souce s) {
        System.out.println(s.getName() + s.getColor());
        s.printSouceDetails();

    }

    public void processBee(Bee b) {
        System.out.println(b.getName() + b.getGender());
        b.printBeeDetails();

    }

    public void processObstacle(Obstacle o) {
        System.out.println(b.getSeverity() + b.getDescription());
        o.printObstacleDetails();

    }

    public void processPineapple(Pineapple p) {
        System.out.println(p.setGrade() + b.getHeatCapacity());
        p.printPineappleDetails();

    }
}

