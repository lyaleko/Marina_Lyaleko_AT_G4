/*создать класс SparklingWater, являющийся дочерним Water
у газировки есть пузырьки
вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
1 литр воды содержит 10 тыс пузырьков
у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье*/
package project.liquid;

import project.boxing.Bubble;

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