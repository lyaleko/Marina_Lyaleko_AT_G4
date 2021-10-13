package tasks.homework.basetask;



public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();

        trainMethodsObjects.processMouse(new Mouse("Jerry", 5));
        trainMethodsObjects.processSouce(new Souce("Hinze", "red"));
        trainMethodsObjects.processBee(new Bee("man", 123));
        trainMethodsObjects.processObstacle(new Obstacle("stones", "medium"));
        trainMethodsObjects.processPineapple(new Pineapple("just grade", 3000));


    }

}