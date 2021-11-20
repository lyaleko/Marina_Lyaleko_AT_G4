package project.vessel;

/* **- classes Bottle, Cup, Can, Glass, Plastic, Metal have constructors, which set all fields with default values
        - all fields should have gettres and setters*/
//- all extending classes Bottle, Cup, Can calling super() constructor and set values:
//**---- diameter - default for Bottle - 2.0, Cup - 8.0, Can - 10.0
//---- volume - is passed from child constructor
//---- material - is passed from child constructor
//- all extending classes Bottle, Cup, Can have private Transformable stuff

import project.material.Material;
import project.stuff.Transformable;

public class Can extends Vessel {
    private Transformable stuff;

    public Can(double volume, double diameter, Material material) {
        super(volume, 10.0,  material);
    }
}
