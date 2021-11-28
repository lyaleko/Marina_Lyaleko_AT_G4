package project.materials;
//classes Bottle, Cup, Can, Glass, Plastic, Metal have constructors, which set all fields with default values
//???? all fields should have getters and setters
//  Glass (thermalConductivity - 0.017, color - green, density - 2200)

import project.materials.Material;

public class Glass extends Material {

    public Glass(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }
}