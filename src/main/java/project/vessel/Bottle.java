package project.vessel;
// создать класс Bottle, у него есть обьем, есть вода
// есть метод open(), который вызывает метод degas() в газировке
// содеждит приватные поля double volume, SparklingWater water
// содержит конструктор Bottle(double volume), в котором бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр
// есть публичный метод void open(), который меняет состояние воды в "открытое" (приблизительно, как this.water.setOpened(true)
// есть публичный метод void warm(int temperature), который устанавливает температуру воды в бутылке
// ???? есть публичный метод SparklingWater getWater() возвращающий обьект воды
// ???? есть публичный метод setWater(SparklingWater water) добавляющий новый обьект воды

// class Bottle has constructor, which set all fields with default values
// all fields should have getters and setters
// - all extending classes Bottle, Cup, Can calling super() constructor and set values:
// diameter - default for Bottle - 2.0
//---- volume - is passed from child constructor
//---- material - is passed from child constructor
//- all extending classes Bottle, Cup, Can have private Transformable stuff

import project.material.Material;
import project.stuff.Transformable;
import project.stuff.SparklingWater;

import java.io.Serializable;
import java.util.Arrays;

public class Bottle extends Vessel implements Containable, Serializable {

    private double volume;
    private SparklingWater water;
    private Transformable stuff;
    private int [] arrBubbles;

    public Bottle(double volume){ // конструктор Bottle(double volume), в котором
        // бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр
        System.out.println("Bottle filled with bubbles");
        this.volume = volume;
        this.arrBubbles = new int[(int) (volume * 10000)];

    }

    public Bottle(double volume, double diameter, Material material) {
        super (volume, 2.0, material);
    }
    @Override
    public String toString() {
        return "Bottle{" +
                "volume=" + volume +
                ", water=" + water +
                ", stuff=" + stuff +
                ", arrBubbles=" + Arrays.toString(arrBubbles) +
                '}';
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Transformable getStuff() {
        return stuff;
    }

    public void setStuff(Transformable stuff) {
        this.stuff = stuff;
    }

    public int[] getArrBubbles() {
        return arrBubbles;
    }

    public void setArrBubbles(int[] arrBubbles) {
        this.arrBubbles = arrBubbles;
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