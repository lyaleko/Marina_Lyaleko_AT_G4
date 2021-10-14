package project.liquid;

import project.boxing.Bubble;
import project.boxing.Water;

public class SparklingWater extends Water {
    private Bubble[] bubbles;

    public SparklingWater(String color, String clear, String smell, int temperature ){
        super (color,clear,smell,temperature);

    }

    public void pump(Bubble[] bubbles){
        this.bubbles = bubbles;

    }

    public void degas(){

    }
}