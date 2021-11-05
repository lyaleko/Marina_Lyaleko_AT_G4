package project.boxing;
/*создать класс Bottle
у него есть обьем
есть вода
есть метод open(), который вызывает метод degas() в газировке*/

import project.feature.Transformable;
import project.feature.Containable;
import project.liquid.SparklingWater;
import java.io.Serializable;

public class Bottle extends Vessel implements Containable,Serializable {

   // private double volume;
    private SparklingWater water;
    private int [] arrBubbles;

    public Bottle(double volume){ // конструктор Bottle(double volume), в котором
        // бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр
        System.out.println("Bottle filled with bubbles");
        this.volume = volume;
        this.arrBubbles = new int[(int) (volume * 10000)];

    }

    @Override
    public String toString() {
        return "Bottle{" +
                "arrBubbles=" + arrBubbles.length +
                ", volume=" + volume +
                '}';
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void addStuff(Transformable stuff) {
    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    public void open(){ //который меняет состояние воды в "открытое"
        System.out.println("Is bottle opened?");
        this.water.setOpened(true);

    }

    @Override
    public void close() {

    }

    public void warm(int temperature){ // устанавливает температуру воды в бутылке
        System.out.printf("Warming water to: %s", temperature).println();
        this.water.setTemperature(temperature);

    }
    public SparklingWater getWater(){ // возвращающий обьект воды
        System.out.print("Get water properties");
        return new SparklingWater(water.getColor(), water.getTransparency(), water.getSmell(), water.getTemperature());
    }
    public SparklingWater setWater(SparklingWater water){ // добавляющий новый обьект воды
        System.out.print("Add new Water");
        return water;
    }
}