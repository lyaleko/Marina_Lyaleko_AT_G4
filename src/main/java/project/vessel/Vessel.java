package project.vessel;
// abstract class Vessel (extending classes Bottle, Cup, Can)
// each Vessel has:
// private double volume;
// private double diameter;
// private int weight;
// private Material material;
// all field are set in constructor
// volume, diameter, material are passed from child constructor
// weight is set in constructor as density * volume / 4
// all fields have getters and setters

import project.material.Material;

public abstract class Vessel{

    private double volume;
    private double diameter;
    private int weight;
    private Material material;

    public Vessel(double volume, double diameter, Material material) {
        this.volume = volume;
        this.diameter = diameter;
        this.weight = (int) (volume*material.getDensity()/4);
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Vessel() {

    }
}