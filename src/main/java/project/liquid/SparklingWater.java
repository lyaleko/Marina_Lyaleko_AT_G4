/*создать класс SparklingWater, являющийся дочерним Water
у газировки есть пузырьки
вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
1 литр воды содержит 10 тыс пузырьков
у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье*/
package project.liquid;
import project.boxing.Bubble;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class SparklingWater extends Water {

    private boolean isOpened = false;
    private Bubble[] bubbles = {};

    public SparklingWater(String color, String transparency, String smell, int temperature){
        isOpened();
    }


    public void pump(Bubble[] bubbles){ // сетает массив из пузырьков в воду
        System.out.println("set bubbles");
        this.bubbles = bubbles;

    }
    public void setOpened(boolean isOpened){ // меняет состояние воды на "открытое"
        System.out.printf("set isOpened = %s ", isOpened).println();
        this.isOpened = isOpened;
    }

    private void isOpened() { //  новом потоке проверят состояние воды на "открытость"
        // и в случае, если она открыта запускает метод degas()
        System.out.println("start automatic check");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (isOpened){
                    degas();
                }
            }
        }, 0, 1000);
    }

    private void degas(){ // каждую секунду выпускает по партии пузырьков
        // из рассчета 10 + 5 * температура_воды
        if (this.isSparkle()){
            System.out.println("output bubbles");
            int expectedCount = (10 + 5) * this.getTemperature();
            int possibleBubblesAmount = Math.min(expectedCount, this.bubbles.length);
            for (int i = 0; i < possibleBubblesAmount; i++) {
                Bubble b = this.bubbles[i];
                b.cramp();
                this.bubbles = Arrays.copyOfRange(this.bubbles, possibleBubblesAmount, this.bubbles.length-1);
            }
        }
    }
    public boolean isSparkle(){ // возвращающий true если в воде еще есть пузырьки газа
        System.out.println("output bubbles");
        return this.bubbles.length > 0;
    }
}

