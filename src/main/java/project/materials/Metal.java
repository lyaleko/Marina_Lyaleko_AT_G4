package project.materials;

//classes Bottle, Cup, Can, Glass, Plastic, Metal have constructors, which set all fields with default values
//???? all fields should have getters and setters
// -- Metal (thermalConductivity - 58.0, color - silver, density - 7800)

import project.materials.Material;

public class Metal extends Material {

    public Metal(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }
}