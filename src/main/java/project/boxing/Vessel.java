package project.boxing;

import project.material.Material;

public abstract class Vessel /*extends Bottle, Cup, Can*/{

    private double volume;
    private double diameter;
    private int weight;
    private Material material;

    public Vessel(double volume, double diameter, int weight, Material material) {
        this.volume = volume;
        this.diameter = diameter;
        this.weight = weight;
        this.material = material;
    }


}
