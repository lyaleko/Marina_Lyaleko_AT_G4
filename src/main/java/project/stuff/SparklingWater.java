/* **создать класс SparklingWater, являющийся дочерним Water
у газировки есть пузырьки
вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
1 литр воды содержит 10 тыс пузырьков
у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье*/

/*  **------ наследуется от Water
        ------ содеждит приватные поля boolean isOpened, Bubble[] bubbles
        ------ содержит конструктор SparklingWater(), который вызывает внутренний метод isOpened();
        ------ есть публичный метод void pump(Bubble[] bubbles), который сетает массив из пузырьков в воду
        ------ есть публичный метод void setOpened(boolean isOpened), который меняет состояние воды на "открытое"
        ------ есть приватный метод void isOpened(), который в новом потоке проверят состояние воды на "открытость" и в случае, если она открыта запускает метод degas()
        ------ есть приватный метод degas(), который каждую секунду выпускает по партии пузырьков из рассчета 10 + 5 * температура_воды
        ------ есть публичный метод boolean isSparkle(), возвращающий true если в воде еще есть пузырьки газа
        -- каждый метод должен содержать сообщение о том, что он делает, например:
        System.out.printf("Warming water to: %s", temperature).println();*/
// - class SparklingWater extends Water
//---- private boolean isOpened, Bubble[] bubbles
//---- public SparklingWater(), конструктор, который сетает нужное количество пузырьков из рассчета, что 1 литр воды содержит 10 тыс пузырьков и вызывает внутренний метод isOpened();
//---- private isOpened(), который раз в 2 секунды (используем Thread.sleep()) проверяет, состояние закрытости в бутылке и если бутылка открылась, то запускает внутренний метод degas()
//---- private degas(), который каждую секунду выпускает по партии пузырьков из рассчета 10 + 5 * температура_воды
//---- public setOpen(), который переводит состояние открытости true
package project.stuff;
import project.stuff.Bubble;
import project.stuff.Water;

import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class SparklingWater extends Water {

    private boolean isOpened = false;
    private Bubble[] bubbles = {};
    // содержит конструктор SparklingWater(), который сетает нужное количество пузырьков из рассчета, что 1 литр воды содержит 10 тыс пузырьков и вызывает внутренний метод и вызывает внутренний метод isOpened();
    public SparklingWater(String color, String transparency, String smell, int temperature){
        isOpened();
    }
    public SparklingWater(double volume){ //конструктор, который сетает нужное количество пузырьков из рассчета, что 1 литр воды содержит 10 тыс пузырьков и вызывает внутренний метод isOpened();
        var count = (int) Math.round(volume * 10000);
        bubbles = new Bubble[count];
        for (int i = 0; i < count; i++) {
            bubbles[i] = new Bubble(Bubble.VOLUME, "air");
        }
        isOpened();
    };

    public SparklingWater(){ //конструктор, который сетает нужное количество пузырьков из рассчета, что 1 литр воды содержит 10 тыс пузырьков и вызывает внутренний метод isOpened();

    };
    public void pump(Bubble[] bubbles){ // сетает массив из пузырьков в воду
        System.out.println("Set bubbles");
        this.bubbles = bubbles;

    }
    public void setOpened(boolean isOpened){ // меняет состояние воды на "открытое", который переводит состояние открытости true
        System.out.printf("Is Water opened = %s ", isOpened).println();
        this.isOpened = isOpened;
    }
// //---- private isOpened(), который раз в 2 секунды (используем Thread.sleep())
// проверяет, состояние закрытости в бутылке и если бутылка открылась, то запускает внутренний метод degas()
    private void isOpened() { // в новом потоке проверят состояние воды на "открытость"
        // и в случае, если она открыта запускает метод degas()
        System.out.println("Start automatic check every second");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (isOpened){
                    degas();
                }
            }
        }, 0, 2000);
    }

    private void degas(){ // каждую секунду выпускает по партии пузырьков
        // из рассчета 10 + 5 * температура_воды
        if (this.isSparkle()){
            System.out.println("Output part of bubbles every second");
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
        System.out.println("Are there any bubbles?");
        return this.bubbles.length > 0;
    }

    @Override
    public void setOpened() {

    }

    @Override
    public void mix() {

    }
}

