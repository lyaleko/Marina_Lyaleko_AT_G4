package project.vessel;

// classes Bottle, Cup, Can, Glass, Plastic, Metal have constructors, which set all fields with default values
// all fields should have getters and setters
//  all extending classes Bottle, Cup, Can calling super() constructor and set values:
// diameter - default for Cup - 8.0
// volume - is passed from child constructor
// material - is passed from child constructor
// all extending classes Bottle, Cup, Can have private Transformable stuff

import project.materials.Material;
import project.stuff.Transformable;
import java.io.Serializable;

public class Cup  extends Vessel implements Serializable {

    private Transformable stuff;

    public Cup(double volume, double diameter, Material material) {
        super(volume, 8.0, material);
    }

    @Override
    public String toString() {
        return "Cup{" +
                "stuff=" + stuff +
                '}';
    }

    public Cup() {

    }
}