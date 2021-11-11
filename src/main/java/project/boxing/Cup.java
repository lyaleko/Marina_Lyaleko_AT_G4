package project.boxing;
import java.io.Serializable;
import project.material.Material;

public class Cup extends Vessel implements Serializable{

    public Cup(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }

    @Override
    public String toString() {
        return "Cup{" +
                "volume=" + volume +
                ", diameter=" + diameter +
                ", weight=" + weight +
                ", material=" + material +
                '}';
    }
}