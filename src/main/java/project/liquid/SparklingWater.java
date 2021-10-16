/*создать класс SparklingWater, являющийся дочерним Water
у газировки есть пузырьки
вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
1 литр воды содержит 10 тыс пузырьков
у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье*/
package project.liquid;
import project.boxing.Bubble;
import project.boxing.Bottle;

public class SparklingWater extends Water {
    private boolean isOpened;
    private Bubble[] bubbles;

    Bottle bottle = new Bottle();


    public SparklingWater(){
        isOpened();
    }

    private void isOpened() {
    }

    public void pump(Bubble[] bubbles){
        this.bubbles = bubbles;

    }
    public void setOpened(boolean isOpened){
        bottle.open();
    }

    private void isOpened(boolean isOpened) {
        if (isOpened == true) {
            degas();
        }//todo


    }
    private void degas(){
        int partSecond = 0;
        for (int i = 0; i < bubbles.length; i++) {
            partSecond += (10 + 5) * this.getTemperature();
        }
    }
    public boolean isSparkle(){
            return bubbles != null;
    }
}

