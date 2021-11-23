package project.material;

// classes Bottle, Cup, Can, Glass, Plastic, Metal have constructors, which set all fields with default values
// all fields should have getters and setters
// Plastic (thermalConductivity - 0.2, color - white, density - 1800)

public class Plastic extends Material{

    public Plastic(double thermalConductivity, String color, double density) {
        super(0.2, "white", 1800);
    }
}