package project.materials;

// classes Bottle, Cup, Can, Glass, Plastic, Metal have constructors, which set all fields with default values
// ???? all fields should have gettres and setters*/
// Plastic (thermalConductivity - 0.2, color - white, density - 1800)

import project.materials.Material;

public class Plastic extends Material {

    public Plastic(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }
}