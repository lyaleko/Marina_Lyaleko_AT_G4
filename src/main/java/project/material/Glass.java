package project.material;

/* **- classes Bottle, Cup, Can, Glass, Plastic, Metal have constructors, which set all fields with default values
        - all fields should have gettres and setters*/

//  Glass (thermalConductivity - 0.017, color - green, density - 2200)

public class Glass extends Material{

    public Glass(double thermalConductivity, String color, double density) {
        super(0.017, "green", 2200);
    }

}
