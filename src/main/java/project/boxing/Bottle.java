package project.boxing;
/*создать класс Bottle
у него есть обьем
есть вода
есть метод open(), который вызывает метод degas() в газировке*/

import project.liquid.SparklingWater;

public class Bottle {

    private double volume;
    private SparklingWater water;

    public Bottle(double volume){ // конструктор Bottle(double volume), в котором
        // бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр
        this.volume = volume;
        int[] bubbles = new int[10000];
    }

    public void open(){ //который меняет состояние воды в "открытое"
        System.out.println("change condition");
        this.water.setOpened(true);


    }
    public void warm(int temperature){ // устанавливает температуру воды в бутылке
        System.out.printf("Warming water to: %s", temperature).println();
        this.water.setTemperature(temperature);

    }
    public SparklingWater getWater(){ // возвращающий обьект воды
        System.out.print("return Water");
        return new SparklingWater(water.getColor(), water.getTransparency(), water.getSmell(), water.getTemperature());
    }
    public void setWater(SparklingWater water){ // добавляющий новый обьект воды
        System.out.print("add new Water");
        SparklingWater water1 = new SparklingWater(water.getColor(), water.getTransparency(), water.getSmell(), water.getTemperature());
    }
}

