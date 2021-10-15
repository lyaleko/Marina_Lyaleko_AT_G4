package project.boxing;
/*создать класс Bottle
у него есть обьем
есть вода
есть метод open(), который вызывает метод degas() в газировке*/

import project.liquid.SparklingWater;
import project.liquid.Water;

public class Bottle {

    private double volume;
    private SparklingWater water;

    public Bottle(double volume){
        this.volume = volume;
        int[] bubbles = new int[10000];

    }
    public void open(){
        this.water.setOpened(true);

    }
    public void warm(int temperature){
        this.water.setTemperature(25);

    }
    public SparklingWater getWater(){
        return water;
    }
    public void setWater(SparklingWater water){
        SparklingWater water1 = new SparklingWater();
    }
}

