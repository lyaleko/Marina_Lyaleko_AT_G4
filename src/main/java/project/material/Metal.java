package project.material;

// classes Bottle, Cup, Can, Glass, Plastic, Metal have constructors, which set all fields with default values
// all fields should have getters and setters
// Metal (thermalConductivity - 58.0, color - silver, density - 7800)

public class Metal extends Material{

    public Metal(double thermalConductivity, String color, double density) {
        super(58, "silver", 7800);
    }
}