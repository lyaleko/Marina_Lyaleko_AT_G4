package project.material;
//- abstract class Material (extending classes Glass, Plastic, Metal)
// package material
//????- enum Material (GLASS, PLASTIC, METAL)
// -- private double thermalConductivity;
// -- private String color;
// -- private double density;
// -- all field are set in constructor

public abstract class Material{

/*enum Material {
    GLASS, PLASTIC, METAL
}*/
    private double thermalConductivity;
    private String color;
    private double density;

    public Material(double thermalConductivity, String color, double density) {
        this.thermalConductivity = thermalConductivity;
        this.color = color;
        this.density = density;
    }

    public double getThermalConductivity() {
        return thermalConductivity;
    }

    public void setThermalConductivity(double thermalConductivity) {
        this.thermalConductivity = thermalConductivity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    @Override
    public String toString() {
        return "Material{" +
                "thermalConductivity=" + thermalConductivity +
                ", color='" + color + '\'' +
                ", density=" + density +
                '}';
    }
}